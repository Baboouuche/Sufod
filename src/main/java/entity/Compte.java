package entity;

import java.util.List;

public class Compte {

	
/*----------- Attributs -----------*/
	
	protected int id; 
	
	protected String nom;
	protected String prenom;
	
	protected String mail;
	
	protected String pseudo;
	
	List<Personnage> personnages;

	
/*----------- Constrictors -----------*/
	public Compte(int id, String nom, String prenom, String mail, String pseudo, List<Personnage> personnages) {
		
		this.id = id;
		
		this.nom = nom;
		this.prenom = prenom;
		
		this.mail = mail;
		
		this.pseudo = pseudo;
		
		this.personnages = personnages;
	}
	
	
public Compte(int id, String nom, String prenom, String mail, String pseudo) {
		
		this.id = id;
		
		this.nom = nom;
		this.prenom = prenom;
		
		this.mail = mail;
		
		this.pseudo = pseudo;
	}


/*----------- Getters & Setters -----------*/	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public List<Personnage> getJoueurs() {
		return personnages;
	}


	public void setJoueurs(List<Personnage> personnages) {
		this.personnages = personnages;
	}


	public int getId() {
		return id;
	}
	
	
	public List<Personnage> getPersonnages() {
		return personnages;
	}


	public void setPersonnages(List<Personnage> personnages) {
		this.personnages = personnages;
	}


	public void setId(int id) {
		this.id = id;
	}


	/*----------- To String -----------*/
	@Override
	public String toString() {
		return "Compte [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", pseudo=" + pseudo + ", personnages ="
				+ personnages + "]";
	}	
	
	public String toStringInForm() {
		return "Compte n�" + id + 
				"\n Propri�taire : " + nom + " " + prenom +
				"\n Mail : " + mail +
				"\n Pseudo=" + pseudo;
	}
	

}
