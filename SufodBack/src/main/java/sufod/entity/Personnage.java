package sufod.entity;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "personnage")
public class Personnage extends Vivant{
	
	/*----------- Attributs -----------*/

	private int idCompte;
	
	protected int pc;
	@Enumerated(EnumType.ORDINAL)
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
	
	@OneToMany (mappedBy = "personnage")
	private Set<Attaque> attaquePersonnage;
	
	@OneToMany (mappedBy = "personnage")
	private Set<Equipement> equipementPersonnage;
	
	@ManyToOne
	@JoinColumn(name = "compte_id", foreignKey = @ForeignKey(name = "PERSONNAGE_COMPTE_ID_FK"))
	private Compte compte;

	
	/*----------- Constrictors -----------*/	
	
	public Personnage () {
		
		
	}
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
	public Set<Attaque> getAttaquePersonnage() {
		return attaquePersonnage;
	}
	public void setAttaquePersonnage(Set<Attaque> attaquePersonnage) {
		this.attaquePersonnage = attaquePersonnage;
	}
	public Set<Equipement> getEquipementPersonnage() {
		return equipementPersonnage;
	}
	public void setEquipementPersonnage(Set<Equipement> equipementPersonnage) {
		this.equipementPersonnage = equipementPersonnage;
	}
	
	
	
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(attaquePersonnage, compte, equipBras, equipCou, equipJambe, equipMain,
				equipPied, equipPlastron, equipPoignet, equipTete, equipementPersonnage, idCompte, metier, pc, xp);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personnage other = (Personnage) obj;
		return Objects.equals(attaquePersonnage, other.attaquePersonnage) && Objects.equals(compte, other.compte)
				&& equipBras == other.equipBras && equipCou == other.equipCou && equipJambe == other.equipJambe
				&& equipMain == other.equipMain && equipPied == other.equipPied && equipPlastron == other.equipPlastron
				&& equipPoignet == other.equipPoignet && equipTete == other.equipTete
				&& Objects.equals(equipementPersonnage, other.equipementPersonnage) && idCompte == other.idCompte
				&& metier == other.metier && pc == other.pc && xp == other.xp;
	}
	
	



	



	
}
