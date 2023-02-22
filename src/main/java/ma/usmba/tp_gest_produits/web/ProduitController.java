package ma.usmba.tp_gest_produits.web;

import ma.usmba.tp_gest_produits.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProduitController {
    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/produits")
    public String products(Model model){
        model.addAttribute("produits", produitRepository.findAll());
        return "produits";
    }

    @GetMapping("/fournisseurs")
    public String fournisseurs(){
        return "fournisseurs";
    }
}
