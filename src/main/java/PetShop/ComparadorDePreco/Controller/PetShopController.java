package PetShop.ComparadorDePreco.Controller;

import PetShop.ComparadorDePreco.Service.PetShopService;
import PetShop.ComparadorDePreco.DTO.CotacaoBanhoDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import PetShop.ComparadorDePreco.DTO.PetShopInformacaosDTO;
import java.util.List;

@RestController
@RequestMapping("/petshop")
public class PetShopController {

    @Autowired
    private PetShopService service;

    @PostMapping("/cotacao")
    public ResponseEntity<?> cotar(@Valid @RequestBody CotacaoBanhoDTO dto) {
        return ResponseEntity.ok(service.cotacaoBanho(dto));
    }

    @GetMapping("/todos")
    public ResponseEntity<List<PetShopInformacaosDTO>> listarTodosPetshops() {
        return ResponseEntity.ok(service.getAllPetShopsInfo());
    }

}
