package model;

import java.util.List;

public class Admin extends Compte {
	
	public Admin(int id, String nom, String prenom, String mail, String pseudo, List<Personnage> Personnage) {
		super(id, nom, prenom, mail, pseudo, Personnage);
	}
	
	public Admin(int id, String nom, String prenom, String mail, String pseudo) {
		super(id, nom, prenom, mail, pseudo);
	}

	
}
