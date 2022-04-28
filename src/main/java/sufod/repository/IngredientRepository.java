package sufod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sufod.entity.Item;
import sufod.entity.Personnage;

public interface IngredientRepository extends JpaRepository<Item, Long> {

	List<Item> findByNom(String nom);

	List<Item> findByNomContaining(String nom);

	List<Item> findByPersonnage(Personnage id);

}
