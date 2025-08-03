package PetShop.ComparadorDePreco.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetShopWebController {
    // Método para exibir a página principal
    @GetMapping("/")
    public String paginaPrincipal() {
        return "cotacao";
    }
}