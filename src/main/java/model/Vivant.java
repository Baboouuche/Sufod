package model;

import java.util.List;

public class Vivant {
	
	
	/*----------- Attributs -----------*/
	
	protected int id;
	protected String nom;
	protected String description;
	
	protected int niveau;
	
	protected Classe classe;
	
	protected int pvMax;
	protected int pv;
	
	protected int esquive;
	protected int vitesse;
	
	protected int pa;
	protected int paMax;
	protected int pm;
	protected int pmMax;
	
	protected int attMagique;
	protected int attPhysique;
	protected int attDistance;
	
	protected int defMagique;
	protected int defPhysique;
	protected int defDistance;
	
	protected List<Attaque> attaques;
	

	/*----------- Constrictors -----------*/
	
	public Vivant(int id, String nom, String description, int niveau, Classe classe, int pvMax, int esquive,
			int vitesse, int paMax, int pmMax, int attMagique, int attPhysique, int attDistance, int defMagique,
			int defPhysique, int defDistance, List<Attaque> attaques) {
	
		this.id = id;
		
		this.nom = nom;
		this.description = description;
		
		this.niveau = niveau;
		
		this.classe = classe;
		
		this.pvMax = pvMax;
		
		this.esquive = esquive;
		this.vitesse = vitesse;
		
		this.paMax = paMax;
		this.pmMax = pmMax;
		
		this.attMagique = attMagique;
		this.attPhysique = attPhysique;
		this.attDistance = attDistance;
		
		this.defMagique = defMagique;
		this.defPhysique = defPhysique;
		this.defDistance = defDistance;
		
		this.attaques = attaques;
	}

	public Vivant(int id, String nom, String description, int niveau, Classe classe, int pvMax, int esquive,
			int vitesse, int paMax, int pmMax, int attMagique, int attPhysique, int attDistance, int defMagique,
			int defPhysique, int defDistance) {
	
		this.id = id;
		
		this.nom = nom;
		this.description = description;
		
		this.niveau = niveau;
		
		this.classe = classe;
		
		this.pvMax = pvMax;
		
		this.esquive = esquive;
		this.vitesse = vitesse;
		
		this.paMax = paMax;
		this.pmMax = pmMax;
		
		this.attMagique = attMagique;
		this.attPhysique = attPhysique;
		this.attDistance = attDistance;
		
		this.defMagique = defMagique;
		this.defPhysique = defPhysique;
		this.defDistance = defDistance;
	}
	
	public Vivant(String nom, String description, int niveau, Classe classe, int pvMax, int esquive,
			int vitesse, int paMax, int pmMax, int attMagique, int attPhysique, int attDistance, int defMagique,
			int defPhysique, int defDistance) {		
		this.nom = nom;
		this.description = description;
		
		this.niveau = niveau;
		
		this.classe = classe;
		
		this.pvMax = pvMax;
		
		this.esquive = esquive;
		this.vitesse = vitesse;
		
		this.paMax = paMax;
		this.pmMax = pmMax;
		
		this.attMagique = attMagique;
		this.attPhysique = attPhysique;
		this.attDistance = attDistance;
		
		this.defMagique = defMagique;
		this.defPhysique = defPhysique;
		this.defDistance = defDistance;
		
		this.attaques = attaques;
	}
	
	/*----------- Getters & Setters -----------*/
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getNiveau() {
		return niveau;
	}


	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}


	public Classe getClasse() {
		return classe;
	}


	public void setClasse(Classe classe) {
		this.classe = classe;
	}


	public int getPvMax() {
		return pvMax;
	}


	public void setPvMax(int pvMax) {
		this.pvMax = pvMax;
	}


	public int getPv() {
		return pv;
	}


	public void setPv(int pv) {
		this.pv = pv;
	}


	public int getEsquive() {
		return esquive;
	}


	public void setEsquive(int esquive) {
		this.esquive = esquive;
	}


	public int getVitesse() {
		return vitesse;
	}


	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}


	public int getPa() {
		return pa;
	}


	public void setPa(int pa) {
		this.pa = pa;
	}


	public int getPaMax() {
		return paMax;
	}


	public void setPaMax(int paMax) {
		this.paMax = paMax;
	}


	public int getPm() {
		return pm;
	}


	public void setPm(int pm) {
		this.pm = pm;
	}


	public int getPmMax() {
		return pmMax;
	}


	public void setPmMax(int pmMax) {
		this.pmMax = pmMax;
	}


	public int getAttMagique() {
		return attMagique;
	}


	public void setAttMagique(int attMagique) {
		this.attMagique = attMagique;
	}


	public int getAttPhysique() {
		return attPhysique;
	}


	public void setAttPhysique(int attPhysique) {
		this.attPhysique = attPhysique;
	}


	public int getAttDistance() {
		return attDistance;
	}


	public void setAttDistance(int attDistance) {
		this.attDistance = attDistance;
	}


	public int getDefMagique() {
		return defMagique;
	}


	public void setDefMagique(int defMagique) {
		this.defMagique = defMagique;
	}


	public int getDefPhysique() {
		return defPhysique;
	}


	public void setDefPhysique(int defPhysique) {
		this.defPhysique = defPhysique;
	}


	public int getDefDistance() {
		return defDistance;
	}


	public void setDefDistance(int defDistance) {
		this.defDistance = defDistance;
	}


	public List<Attaque> getAttaques() {
		return attaques;
	}


	public void setAttaques(List<Attaque> attaques) {
		this.attaques = attaques;
	}

	
	/*----------- To String -----------*/
	
	@Override
	public String toString() {
		return "Vivant [id=" + id + ", nom=" + nom + ", description=" + description + ", niveau=" + niveau + ", classe="
				+ classe + ", pvMax=" + pvMax + ", esquive=" + esquive + ", vitesse=" + vitesse + ", paMax=" + paMax
				+ ", pmMax=" + pmMax + ", attMagique=" + attMagique + ", attPhysique=" + attPhysique + ", attDistance="
				+ attDistance + ", defMagique=" + defMagique + ", defPhysique=" + defPhysique + ", defDistance="
				+ defDistance + ", attaques=" + attaques + "]";
	}
	
	

}
