package model;

import java.util.List;

public class Personnage extends Vivant{
	
	/*----------- Attributs -----------*/
	
	private int idCompte;
	
	protected int pc;
	
	protected Metier metier;
	
	protected int equipTete;
	protected int equipPlastron;
	protected int equipCou;
	protected int equipMain;
	protected int equipPoignet;
	protected int equipPied;
	protected int equipJambe;
	protected int equipBras;
	
	private int xp;

	
	/*----------- Constrictors -----------*/	
	public Personnage(int id, String nom, String description, int niveau, Classe classe, int pvMax, int esquive,
			int vitesse, int paMax, int pmMax, int attMagique, int attPhysique, int attDistance, int defMagique,
			int defPhysique, int defDistance, int pc, Metier metier,int idCompte) {
		
		super(id, nom, description, niveau, classe, pvMax, esquive, vitesse, paMax, pmMax, attMagique, attPhysique,
				attDistance, defMagique, defPhysique, defDistance);
		
		this.idCompte = idCompte;
		this.pc = pc;
		
		this.metier = metier;
	}
	
	public Personnage(String nom, String description, int niveau, Classe classe, int pvMax, int esquive,
			int vitesse, int paMax, int pmMax, int attMagique, int attPhysique, int attDistance, int defMagique,
			int defPhysique, int defDistance, int pc, Metier metier,int idCompte) {
		
		super(nom, description, niveau, classe, pvMax, esquive, vitesse, paMax, pmMax, attMagique, attPhysique,
				attDistance, defMagique, defPhysique, defDistance);

		this.idCompte = idCompte;
		this.pc = pc;
		
		this.metier = metier;
	}


	/*----------- Getters & Setters -----------*/
	
	public int getPc() {
		return pc;
	}


	public int getIdCompte() {
		return idCompte;
	}


	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}


	public void setPc(int pc) {
		this.pc = pc;
	}


	public Metier getMetier() {
		return metier;
	}


	public void setMetier(Metier metier) {
		this.metier = metier;
	}


	public int getEquipTete() {
		return equipTete;
	}


	public void setEquipTete(int equipTete) {
		this.equipTete = equipTete;
	}


	public int getEquipPlastron() {
		return equipPlastron;
	}


	public void setEquipPlastron(int equipPlastron) {
		this.equipPlastron = equipPlastron;
	}


	public int getEquipCou() {
		return equipCou;
	}


	public void setEquipCou(int equipCou) {
		this.equipCou = equipCou;
	}


	public int getEquipMain() {
		return equipMain;
	}


	public void setEquipMain(int equipMain) {
		this.equipMain = equipMain;
	}


	public int getEquipPoignet() {
		return equipPoignet;
	}


	public void setEquipPoignet(int equipPoignet) {
		this.equipPoignet = equipPoignet;
	}


	public int getEquipPied() {
		return equipPied;
	}


	public void setEquipPied(int equipPied) {
		this.equipPied = equipPied;
	}


	public int getEquipJambe() {
		return equipJambe;
	}


	public void setEquipJambe(int equipJambe) {
		this.equipJambe = equipJambe;
	}


	public int getEquipBras() {
		return equipBras;
	}


	public void setEquipBras(int equipBras) {
		this.equipBras = equipBras;
	}
	
	public int getXp() {
		return xp;
	}


	public void setXp(int xp) {
		this.xp = xp;
	}
	


	/*----------- To String -----------*/
	



	@Override
	public String toString() {
		return "Personnage [idCompte=" + idCompte + ", pc=" + pc + ", metier=" + metier + ", equipTete=" + equipTete
				+ ", equipPlastron=" + equipPlastron + ", equipCou=" + equipCou + ", equipMain=" + equipMain
				+ ", equipPoignet=" + equipPoignet + ", equipPied=" + equipPied + ", equipJambe=" + equipJambe
				+ ", equipBras=" + equipBras + "]";
	}
	
	
	
	public String toStringInForm() {
		return "Personnage : " + nom + " | Niveau : " + super.niveau + " | Classe : " + super.classe + " | Metier : " + metier +
				"\n Description : " + description +
				"\n PV : " + super.pvMax + " | PA : " + super.paMax + " | PM : " + super.pmMax + 
				"\n Attaque ==> Magique : " + super.attMagique + " | Physique : " + super.attPhysique + " | Distance : " + super.attDistance +
				"\n Defence ==> Magique : " + super.defMagique + " | Physique : " + super.defPhysique + " | Distance : " + super.defDistance +
				"\n Tete : " + equipTete + " | Plastron : "	+ equipPlastron + " | Jambe : " + equipJambe +
				"\n Cou : " + equipCou + " | Main : " + equipMain + " | Poignet : " + equipPoignet + 
				"\n Pied=" + equipPied  + " | Bras=" + equipBras;
	}

	
}
