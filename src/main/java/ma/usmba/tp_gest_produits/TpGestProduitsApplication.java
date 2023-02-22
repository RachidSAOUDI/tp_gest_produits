package ma.usmba.tp_gest_produits;

import ma.usmba.tp_gest_produits.entities.Produit;
import ma.usmba.tp_gest_produits.repositories.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpGestProduitsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpGestProduitsApplication.class, args);
    }

    CommandLineRunner start(ProduitRepository produitRepository){
        return args -> {
          produitRepository.save(new Produit(null,"PC Portable",7600,34));
          produitRepository.save(new Produit(null,"Scanner",1000,34));
          produitRepository.save(new Produit(null,"Imprimante",600,34));
        };
    }

}
