package entity;

import java.util.List;

public class Monstre extends Vivant{

	/*----------- Attributs -----------*/
	private int minDrop;
	private int maxDrop;
	
	private List<Drop> drops;

	
	/*----------- Constrictors -----------*/	
	
	public Monstre(int id, String nom, String description, int niveau, Classe classe, int pvMax, int esquive,
			int vitesse, int paMax, int pmMax, int attMagique, int attPhysique, int attDistance, int defMagique,
			int defPhysique, int defDistance, int minDrop, int maxDrop) {
		
		super(id, nom, description, niveau, classe, pvMax, esquive, vitesse, paMax, pmMax, attMagique, attPhysique,
				attDistance, defMagique, defPhysique, defDistance);
		
		this.minDrop = minDrop;
		this.maxDrop = maxDrop;
	}


	/*----------- Getters & Setters -----------*/
	public int getMinDrop() {
		return minDrop;
	}


	public void setMinDrop(int minDrop) {
		this.minDrop = minDrop;
	}


	public int getMaxDrop() {
		return maxDrop;
	}


	public void setMaxDrop(int maxDrop) {
		this.maxDrop = maxDrop;
	}


	public List<Drop> getDrops() {
		return drops;
	}


	public void setDrops(List<Drop> drops) {
		this.drops = drops;
	}
	
	
	/*----------- To String -----------*/

	
	@Override
	public String toString() {
		return "Monstre [minDrop=" + minDrop + ", maxDrop=" + maxDrop + ", drops=" + drops + "]";
	}
	
	
	
	public String toStringInForm() {
		return "Monstre : " + nom + " | Niveau : " + super.niveau + " | Classe : " + super.classe +
				"\n Description : " + description +
				"\n PV : " + super.pvMax + " | PA : " + super.paMax + " | PM : " + super.pmMax + 
				"\n Attaque ==> Magique : " + super.attMagique + " | Physique : " + super.attPhysique + " | Distance : " + super.attDistance +
				"\n Defence ==> Magique : " + super.defMagique + " | Physique : " + super.defPhysique + " | Distance : " + super.defDistance;
	}



	
	
}
