package sufod.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sufod.entity.Equipement;
import sufod.entity.Item;
import sufod.entity.PartieCorps;
import sufod.entity.Personnage;

public interface EquipementRepository extends JpaRepository<Item, Long> {

	List<Item> findByNom(String nom);

	List<Item> findByNomContaining(String nom);

	List<Item> findByPersonnage(Personnage id);

	@Query("select e from Item e left join fetch e.equipements where e=:localisation")
	Optional<Equipement> findEquipementsByPartieDuCorps(@Param("localisation") PartieCorps localisation);

}
