package sufod.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class IngredientKey implements Serializable {
	@ManyToOne
	@JoinColumn(name = "personnage_id", foreignKey = @ForeignKey(name = "ingredient_personnage_id_fk"))
	private Personnage personnage;
	@ManyToOne
	@JoinColumn(name = "item_id", foreignKey = @ForeignKey(name = "ingredient_item_id_fk"))
	private Item item;

	public IngredientKey() {
		super();
	}

	public IngredientKey(Personnage personnage, Item item) {
		super();
		this.personnage = personnage;
		this.item = item;
	}

	public Personnage getPersonnage() {
		return personnage;
	}

	public void setPersonnage(Personnage personnage) {
		this.personnage = personnage;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(personnage, item);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IngredientKey other = (IngredientKey) obj;
		return Objects.equals(personnage, other.personnage) && Objects.equals(item, other.item);
	}

}
