package PetShop.ComparadorDePreco.Model;

public class PetShop {
    private String nome;
    private PrecoBanho precos;
    private double distancia;


    public PetShop(String nome, PrecoBanho precos, double distancia) {
        this.nome = nome;
        this.precos = precos;
        this.distancia = distancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PrecoBanho getPrecos() {
        return precos;
    }

    public void setPrecos(PrecoBanho precos) {
        this.precos = precos;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double calculoValorPetshop(boolean finalDeSemana, int qtdPequenos, int qtdGrandes) {
        return precos.calcularPrecoTotal(finalDeSemana, qtdPequenos, qtdGrandes);
    }
}
