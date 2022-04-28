package sufod.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import sufod.entity.Compte;
import sufod.entity.Personnage;


public interface PersonnageRepository extends JpaRepository<Personnage, Long> {

	Optional<Personnage> findById(Long id);

	List<Personnage> findByCompte(Compte compte);

	@Modifying
	@Transactional
	@Query("delete from Personnage p where p.compte=:compte")
	void deleteByCompte(@Param("compte") Compte compte);
}

