package ma.usmba.tp_gest_produits.repositories;

import ma.usmba.tp_gest_produits.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
