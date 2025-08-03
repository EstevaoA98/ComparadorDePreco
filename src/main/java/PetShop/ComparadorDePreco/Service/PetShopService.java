package PetShop.ComparadorDePreco.Service;

import PetShop.ComparadorDePreco.DTO.CotacaoBanhoDTO;
import PetShop.ComparadorDePreco.Model.PetShop;
import PetShop.ComparadorDePreco.Model.PrecoBanho;
import org.springframework.stereotype.Service;
import PetShop.ComparadorDePreco.DTO.PetShopInformacaosDTO;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class PetShopService {
    // listagem de petshops
    private final List<PetShop> petShops;

    // construtor
    public PetShopService() {
        this.petShops = List.of(
                new PetShop("Meu Canino Feliz", new PrecoBanho(20, 40, 24, 48), 2.0),
                new PetShop("Vai Rex", new PrecoBanho(15, 50, 20, 55), 1.7),
                new PetShop("ChowChawgas", new PrecoBanho(30, 45, 30, 45), 0.8)
        );
    }
    // método retorna todas as informações
    public List<PetShopInformacaosDTO> getAllPetShopsInfo() {
        return petShops.stream()
                .map(petShop -> new PetShopInformacaosDTO(
                        petShop.getNome(),
                        petShop.getPrecos().getPrecoSemanaPequeno(),
                        petShop.getPrecos().getPrecoSemanaGrande(),
                        petShop.getPrecos().getPrecoFinalDeSemanaPequeno(),
                        petShop.getPrecos().getPrecoFinalDeSemanaGrande(),
                        petShop.getDistancia()
                ))
                .collect(Collectors.toList());
    }
    // método retorna a cotação
    public Map<String, Object> cotacaoBanho(CotacaoBanhoDTO dto) {
        boolean finalDeSemana = isFinalDeSemana(dto.getData());
        int pequenos = dto.getCachorroPequeno();
        int grandes = dto.getCachorroGrande();

        // melhor petshop com base nos preços
        PetShop melhorPetShop = null;
        double melhorPreco = Double.MAX_VALUE;

        // melhor preço e petshop com base nos preços e distância
        for (PetShop petShop : petShops) {
            double preco = petShop.calculoValorPetshop(finalDeSemana, pequenos, grandes);

            boolean precoMelhor = preco < melhorPreco;
            boolean mesmaPrecoMenorDist = preco == melhorPreco && petShop.getDistancia() < melhorPetShop.getDistancia();

            if (melhorPetShop == null || precoMelhor || mesmaPrecoMenorDist) {
                melhorPetShop = petShop;
                melhorPreco = preco;
            }
        }
        // retorno da cotação
        return Map.of(
                "nomePetshop", melhorPetShop.getNome(),
                "precoTotal", melhorPreco
        );
    }
    // método de verificação se é final de semana
    private boolean isFinalDeSemana(LocalDate data) {
        DayOfWeek dia = data.getDayOfWeek();
        return dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY;
    }
}
