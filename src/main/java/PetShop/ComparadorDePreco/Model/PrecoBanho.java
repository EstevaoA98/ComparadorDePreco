package PetShop.ComparadorDePreco.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PrecoBanho {
    private double precoSemanaPequeno;
    private double precoSemanaGrande;
    private double precoFinalDeSemanaPequeno;
    private double precoFinalDeSemanaGrande;

    public double calcularPrecoTotal(boolean finalDeSemana, int qtdPequenos, int qtdGrandes) {
        double precoPequeno = finalDeSemana ? precoFinalDeSemanaPequeno : precoSemanaPequeno;
        double precoGrande = finalDeSemana ? precoFinalDeSemanaGrande : precoSemanaGrande;
        return (qtdPequenos * precoPequeno) + (qtdGrandes * precoGrande);
    }
}
