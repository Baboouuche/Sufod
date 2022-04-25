package entity;

import java.util.List;

public class Joueur extends Compte{

	public Joueur(int id, String nom, String prenom, String mail, String pseudo, List<Personnage> Personnage) {
		super(id, nom, prenom, mail, pseudo, Personnage);
	}
	
	public Joueur(int id, String nom, String prenom, String mail, String pseudo) {
		super(id, nom, prenom, mail, pseudo);
	}
	

}
