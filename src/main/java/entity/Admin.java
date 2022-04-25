package entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "admin")
@SequenceGenerator(name = "seqPersonne", sequenceName = "seq_admin", allocationSize = 1)
public class Admin extends Compte {
	
	public Admin() {
	}
	
	public Admin(Long id, String nom, String prenom, String mail, String pseudo, Set<Personnage> personnages) {
		super(id, nom, prenom, mail, pseudo, personnages);
	}
	
	public Admin(Long id, String nom, String prenom, String mail, String pseudo) {
		super(id, nom, prenom, mail, pseudo);
	}
