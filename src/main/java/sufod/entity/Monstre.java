package sufod.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private int minDrop;
	private int maxDrop;
	
	@OneToMany(mappedBy="key.monstre")
	private Set<Move> moveSet;
	
	
	
	
	/*----------- Constrictors -----------*/	
	
	public Monstre(){
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


	
}
