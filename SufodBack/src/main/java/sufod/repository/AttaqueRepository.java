package sufod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sufod.entity.Attaque;
import sufod.entity.Monstre;
import sufod.entity.Personnage;

public interface AttaqueRepository extends JpaRepository<Attaque, Integer>{
	
	
	@Query("Select a from Attaque a left join fetch a.monstre =:monstre")
	List<Attaque> findAllMonstre(@Param("monstre") Monstre monstre);
	
	@Query("Select a from Attaque a left join fetch a.personnage =:personnage")
	List<Attaque> findAllPersonnage(@Param("personnage") Personnage personnage);

}
