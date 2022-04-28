package sufod.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sufod.entity.Equipement;
import sufod.entity.Item;
import sufod.entity.Personnage;

public interface ItemRepository extends JpaRepository<Item, Long> {

	List<Item> findByNom(String nom);

	List<Item> findByNomContaining(String nom);

	List<Item> findByPersonnage(Personnage id);
	
	@Query("select i from Item i left join fetch i.ingredients")
	Optional<Item> findIngredients(@Param("type") Long id);
	
	@Query("select i from Item i left join fetch i.equipements")
	Optional<Item> findEquipements(@Param("id") Long id);

}
