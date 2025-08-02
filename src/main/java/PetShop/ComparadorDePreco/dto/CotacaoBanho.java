package PetShop.ComparadorDePreco.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CotacaoBanho {

    @NotNull
    private LocalDate data;

    @Min(0)
    private int cachorroPequeno;

    @Min(0)
    private int cachorroGrande;
}
