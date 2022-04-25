package entity;

import java.util.List;
import java.util.Set;


@Entity
@Table(name="monstre")

public class Monstre extends Vivant{

	/*----------- Attributs -----------*/
	private int minDrop;
	private int maxDrop;
	
	
	@OneToMany(mappedBy = "key.monstre")
	private Set<Drop> drops;
	
	@OneToMAny(mappedBy = "monstre")
	private Set<Attaque> pokemons;
	
	
	
	
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




	public Set<Drop> getDrops() {
		return drops;
	}




	public void setDrops(Set<Drop> drops) {
		this.drops = drops;
	}




	public Set<Attaque> getPokemons() {
		return pokemons;
	}




	public void setPokemons(Set<Attaque> pokemons) {
		this.pokemons = pokemons;
	}






	
	
}
