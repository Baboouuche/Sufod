package sufod.entity;

import java.util.Objects;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("e")
public class Equipement extends Item {

		private int pv;
		private int defMagique;
		private int defPhysique;
		private int defDistance;
		private int attMagique;
		private int attPhysique;
		private int attDistance;
		private int Esquive;
		private int PAequipement;
		private int PMequipement;
		PartieCorps localisation;
		
		@ManyToOne
		@JoinColumn(name = "monstre_id", foreignKey = @ForeignKey(name = "equipementMonstre_monstre_id_fk"))
		private Monstre monstre;
		@ManyToOne
		@JoinColumn(name = "monstre_id", foreignKey = @ForeignKey(name = "equipementPersonnage_monstre_id_fk"))
		private Personnage personnage;
		
		public Equipement() {

		}

		public Equipement(int pv, int defMagique, int defPhysique, int defDistance, int attMagique,
				int attPhysique, int attDistance, int esquive, PartieCorps localisation) {
			this.pv = pv;
			this.defMagique = defMagique;
			this.defPhysique = defPhysique;
			this.defDistance = defDistance;
			this.attMagique = attMagique;
			this.attPhysique = attPhysique;
			this.attDistance = attDistance;
			this.Esquive = esquive;
			this.localisation = localisation;
		}

		

		public int getPv() {
			return pv;
		}

		public void setPv(int pv) {
			this.pv = pv;
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

		public int getEsquive() {
			return Esquive;
		}

		public void setEsquive(int esquive) {
			Esquive = esquive;
		}

		public int getPAequipement() {
			return PAequipement;
		}

		public void setPAequipement(int pAequipement) {
			PAequipement = pAequipement;
		}

		public int getPMequipement() {
			return PMequipement;
		}

		public void setPMequipement(int pMequipement) {
			PMequipement = pMequipement;
		}

		public PartieCorps getLocalisation() {
			return localisation;
		}

		public void setLocalisation(PartieCorps localisation) {
			this.localisation = localisation;
		}

		public Monstre getMonstre() {
			return monstre;
		}

		public void setMonstre(Monstre monstre) {
			this.monstre = monstre;
		}

		public Personnage getPersonnage() {
			return personnage;
		}

		public void setPersonnage(Personnage personnage) {
			this.personnage = personnage;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Objects.hash(Esquive, PAequipement, PMequipement, attDistance, attMagique,
					attPhysique, defDistance, defMagique, defPhysique, localisation, pv);
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
			Equipement other = (Equipement) obj;
			return Double.doubleToLongBits(Esquive) == Double.doubleToLongBits(other.Esquive)
					&& PAequipement == other.PAequipement && PMequipement == other.PMequipement
					&& Double.doubleToLongBits(attDistance) == Double.doubleToLongBits(other.attDistance)
					&& Double.doubleToLongBits(attMagique) == Double.doubleToLongBits(other.attMagique)
					&& Double.doubleToLongBits(attPhysique) == Double.doubleToLongBits(other.attPhysique)
					&& Double.doubleToLongBits(defDistance) == Double.doubleToLongBits(other.defDistance)
					&& Double.doubleToLongBits(defMagique) == Double.doubleToLongBits(other.defMagique)
					&& Double.doubleToLongBits(defPhysique) == Double.doubleToLongBits(other.defPhysique)
					&& localisation == other.localisation && pv == other.pv;
		}
		
		

	}

