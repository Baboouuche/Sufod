package sufod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sufod.entity.Personnage;

public interface PersonnageRespository extends JpaRepository<Personnage, Integer> {

}
