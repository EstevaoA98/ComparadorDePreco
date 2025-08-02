package PetShop.ComparadorDePreco.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PetShop {
    private String nome;
    private PrecoBanho precos;
    private double distancia;

    public double calculoValorPetshop(boolean finalDeSemana, int qtdPequenos, int qtdGrandes) {
        return precos.calcularPrecoTotal(finalDeSemana, qtdPequenos, qtdGrandes);
    }
}
