package PetShop.ComparadorDePreco.Model;

public class PrecoBanho {
    private double precoSemanaPequeno;
    private double precoSemanaGrande;
    private double precoFinalDeSemanaPequeno;
    private double precoFinalDeSemanaGrande;

    public PrecoBanho(double precoSemanaPequeno, double precoSemanaGrande, double precoFinalDeSemanaPequeno, double precoFinalDeSemanaGrande) {
        this.precoSemanaPequeno = precoSemanaPequeno;
        this.precoSemanaGrande = precoSemanaGrande;
        this.precoFinalDeSemanaPequeno = precoFinalDeSemanaPequeno;
        this.precoFinalDeSemanaGrande = precoFinalDeSemanaGrande;
    }

    public double getPrecoSemanaPequeno() {
        return precoSemanaPequeno;
    }

    public void setPrecoSemanaPequeno(double precoSemanaPequeno) {
        this.precoSemanaPequeno = precoSemanaPequeno;
    }

    public double getPrecoSemanaGrande() {
        return precoSemanaGrande;
    }

    public void setPrecoSemanaGrande(double precoSemanaGrande) {
        this.precoSemanaGrande = precoSemanaGrande;
    }

    public double getPrecoFinalDeSemanaPequeno() {
        return precoFinalDeSemanaPequeno;
    }

    public void setPrecoFinalDeSemanaPequeno(double precoFinalDeSemanaPequeno) {
        this.precoFinalDeSemanaPequeno = precoFinalDeSemanaPequeno;
    }

    public double getPrecoFinalDeSemanaGrande() {
        return precoFinalDeSemanaGrande;
    }

    public void setPrecoFinalDeSemanaGrande(double precoFinalDeSemanaGrande) {
        this.precoFinalDeSemanaGrande = precoFinalDeSemanaGrande;
    }

    public double calcularPrecoTotal(boolean finalDeSemana, int qtdPequenos, int qtdGrandes) {
        double precoPequeno = finalDeSemana ? precoFinalDeSemanaPequeno : precoSemanaPequeno;
        double precoGrande = finalDeSemana ? precoFinalDeSemanaGrande : precoSemanaGrande;
        return (qtdPequenos * precoPequeno) + (qtdGrandes * precoGrande);
    }
}
