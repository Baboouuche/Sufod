package entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("i")
public class Ingredient extends Item {

	
	public Ingredient() {

	}

}
