package sufod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sufod.entity.Attaque;
import sufod.entity.Equipement;
import sufod.entity.Monstre;
import sufod.entity.Personnage;

public interface EquipementRepository extends JpaRepository<Equipement, Integer>{
	
	
	@Query("Select e from Equipement e left join fetch e.monstre =:monstre")
	List<Equipement> findAllMonstre(@Param("monstre") Monstre monstre);
	
	@Query("Select e from Equipement e left join fetch e.personnage =:personnage")
	List<Equipement> findAllPersonnage(@Param("monstre") Personnage personnage);

}
