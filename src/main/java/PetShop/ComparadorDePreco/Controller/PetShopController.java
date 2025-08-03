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
//Endpoint de cotação
@RequestMapping("/petshop")
public class PetShopController {
    //Injeção de dependência
    @Autowired
    private PetShopService service;
    //Método de cotação
    @PostMapping("/cotacao")
    public ResponseEntity<?> cotar(@Valid @RequestBody CotacaoBanhoDTO dto) {
        return ResponseEntity.ok(service.cotacaoBanho(dto));
    }
    //Método para listar todos os petshops no front
    @GetMapping("/todos")
    public ResponseEntity<List<PetShopInformacaosDTO>> listarTodosPetshops() {
        return ResponseEntity.ok(service.getAllPetShopsInfo());
    }

}
