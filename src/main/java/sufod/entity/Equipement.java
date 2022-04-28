package sufod.entity;

import java.util.Objects;

import javax.persistence.DiscriminatorValue;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "equipement")
@DiscriminatorValue("e")

public class Equipement {

	@EmbeddedId
	private EquipementKey key;
	private int quantite;

	private int pv;
	private double defMagique;
	private double defPhysique;
	private double defDistance;
	private double attMagique;
	private double attPhysique;
	private double attDistance;
	private double Esquive;
	PartieCorps localisation;

	public Equipement() {

	}

	public Equipement(EquipementKey key, int quantite, int pv, double defMagique, double defPhysique,
			double defDistance, double attMagique, double attPhysique, double attDistance, double esquive,
			PartieCorps localisation) {
		this.key = key;
		this.quantite = quantite;
		this.pv = pv;
		this.defMagique = defMagique;
		this.defPhysique = defPhysique;
		this.defDistance = defDistance;
		this.attMagique = attMagique;
		this.attPhysique = attPhysique;
		this.attDistance = attDistance;
		Esquive = esquive;
		this.localisation = localisation;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public double getDefMagique() {
		return defMagique;
	}

	public void setDefMagique(double defMagique) {
		this.defMagique = defMagique;
	}

	public double getDefPhysique() {
		return defPhysique;
	}

	public void setDefPhysique(double defPhysique) {
		this.defPhysique = defPhysique;
	}

	public double getDefDistance() {
		return defDistance;
	}

	public void setDefDistance(double defDistance) {
		this.defDistance = defDistance;
	}

	public double getAttMagique() {
		return attMagique;
	}

	public void setAttMagique(double attMagique) {
		this.attMagique = attMagique;
	}

	public double getAttPhysique() {
		return attPhysique;
	}

	public void setAttPhysique(double attPhysique) {
		this.attPhysique = attPhysique;
	}

	public double getAttDistance() {
		return attDistance;
	}

	public void setAttDistance(double attDistance) {
		this.attDistance = attDistance;
	}

	public double getEsquive() {
		return Esquive;
	}

	public void setEsquive(double esquive) {
		Esquive = esquive;
	}

	public PartieCorps getLocalisation() {
		return localisation;
	}

	public void setLocalisation(PartieCorps localisation) {
		this.localisation = localisation;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public EquipementKey getKey() {
		return key;
	}

	public void setKey(EquipementKey key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Esquive, attDistance, attMagique, attPhysique, defDistance, defMagique, defPhysique, key,
				localisation, pv, quantite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipement other = (Equipement) obj;
		return Double.doubleToLongBits(Esquive) == Double.doubleToLongBits(other.Esquive)
				&& Double.doubleToLongBits(attDistance) == Double.doubleToLongBits(other.attDistance)
				&& Double.doubleToLongBits(attMagique) == Double.doubleToLongBits(other.attMagique)
				&& Double.doubleToLongBits(attPhysique) == Double.doubleToLongBits(other.attPhysique)
				&& Double.doubleToLongBits(defDistance) == Double.doubleToLongBits(other.defDistance)
				&& Double.doubleToLongBits(defMagique) == Double.doubleToLongBits(other.defMagique)
				&& Double.doubleToLongBits(defPhysique) == Double.doubleToLongBits(other.defPhysique)
				&& Objects.equals(key, other.key) && localisation == other.localisation && pv == other.pv
				&& quantite == other.quantite;
	}

}
