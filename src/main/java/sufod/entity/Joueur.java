package sufod.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "joueur")
@SequenceGenerator(name = "seqPersonne", sequenceName = "seq_joueur", allocationSize = 1)
public class Joueur extends Compte{

	public Joueur(Long id, String nom, String prenom, String mail, String pseudo, Set<Personnage> personnages) {
		super(id, nom, prenom, mail, pseudo, personnages);
	}
	
	public Joueur(Long id, String nom, String prenom, String mail, String pseudo) {
		super(id, nom, prenom, mail, pseudo);
	}

}