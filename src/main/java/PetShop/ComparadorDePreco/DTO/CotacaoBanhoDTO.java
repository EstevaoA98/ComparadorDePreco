package PetShop.ComparadorDePreco.DTO;

import java.time.LocalDate;

public class CotacaoBanhoDTO {
    // Atributos
    private LocalDate data;
    private int cachorroPequeno;
    private int cachorroGrande;

    // Métodos Getters e Setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getCachorroPequeno() {
        return cachorroPequeno;
    }

    public void setCachorroPequeno(int cachorroPequeno) {
        this.cachorroPequeno = cachorroPequeno;
    }

    public int getCachorroGrande() {
        return cachorroGrande;
    }

    public void setCachorroGrande(int cachorroGrande) {
        this.cachorroGrande = cachorroGrande;
    }

}
