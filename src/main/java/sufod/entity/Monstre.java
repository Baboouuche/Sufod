package sufod.entity;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="monstre")
@SequenceGenerator(name = "seqMonstre", sequenceName = "seq_monstre", initialValue = 10, allocationSize = 1)
public class Monstre extends Vivant{
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqMonstre")
	/*----------- Attributs -----------*/
	
	private int Drop;
	
	//@OneToMany(mappedBy="key.monstre")
	//private Set<Move> moveSet;
	
	@OneToMany (mappedBy = "monstre")
	private Set<Attaque> attaqueMonstre;
	
	@OneToMany (mappedBy = "monstre")
	private Set<Equipement> equipementMonstre;
	
	
	/*----------- Constrictors -----------*/	
	
	public Monstre(){
	}


	/*----------- Getters & Setters -----------*/

	public int getDrop() {
		return Drop;
	}


	public void setDrop(int drop) {
		Drop = drop;
	}


	public Set<Attaque> getAttaqueMonstre() {
		return attaqueMonstre;
	}


	public void setAttaqueMonstre(Set<Attaque> attaqueMonstre) {
		this.attaqueMonstre = attaqueMonstre;
	}


	public Set<Equipement> getEquipementMonstre() {
		return equipementMonstre;
	}


	public void setEquipementMonstre(Set<Equipement> equipementMonstre) {
		this.equipementMonstre = equipementMonstre;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Drop, attaqueMonstre, equipementMonstre);
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
		Monstre other = (Monstre) obj;
		return Drop == other.Drop && Objects.equals(attaqueMonstre, other.attaqueMonstre)
				&& Objects.equals(equipementMonstre, other.equipementMonstre);
	}





	

	
	

}
