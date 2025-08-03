package PetShop.ComparadorDePreco.DTO;

public class PetShopInformacaosDTO {
    private String nome;
    private double precoSemanaPequeno;
    private double precoSemanaGrande;
    private double precoFinalDeSemanaPequeno;
    private double precoFinalDeSemanaGrande;
    private double distancia;

    public PetShopInformacaosDTO(String nome, double precoSemanaPequeno, double precoSemanaGrande,
                                 double precoFinalDeSemanaPequeno, double precoFinalDeSemanaGrande, double distancia) {
        this.nome = nome;
        this.precoSemanaPequeno = precoSemanaPequeno;
        this.precoSemanaGrande = precoSemanaGrande;
        this.precoFinalDeSemanaPequeno = precoFinalDeSemanaPequeno;
        this.precoFinalDeSemanaGrande = precoFinalDeSemanaGrande;
        this.distancia = distancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public double getPrecoFdsPequeno() {
        return precoFinalDeSemanaPequeno;
    }

    public void setPrecoFdsPequeno(double precoFinalDeSemanaPequeno) {
        this.precoFinalDeSemanaPequeno = precoFinalDeSemanaPequeno;
    }

    public double getPrecoFdsGrande() {
        return precoFinalDeSemanaGrande;
    }

    public void setPrecoFdsGrande(double precoFinalDeSemanaGrande) {
        this.precoFinalDeSemanaGrande = precoFinalDeSemanaGrande;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
