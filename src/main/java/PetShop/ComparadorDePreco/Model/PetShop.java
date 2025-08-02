package PetShop.ComparadorDePreco.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class PetShop {
    private String nome;
    private double valorBanhoCachorroPequenoSemana;
    private double valorBanhoCachorroGrandeSemana;
    private double valorBanhoPequenoFinalDeSemana;
    private double valorBanhoGrandeFinalDeSemana;
    private double distancia;

    public double CalculoValorPetshop(Boolean finalDeSemana, int Pequeno, int Grande) {
        double ValorPequeno = finalDeSemana ? valorBanhoPequenoFinalDeSemana : valorBanhoCachorroPequenoSemana;
        double ValorGrande = finalDeSemana ? valorBanhoGrandeFinalDeSemana : valorBanhoCachorroGrandeSemana;
        return (Pequeno * ValorPequeno) + (Grande * ValorGrande);
            }
}
