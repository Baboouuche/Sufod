package sufod.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Embeddable
public class MoveKey implements Serializable {
	@ManyToOne
	@JoinColumn(name = "attaque_id", foreignKey = @ForeignKey(name = "move_attaque_id_fk"))
	private Attaque attaque;
	
	@ManyToMany
	@JoinColumn(name = "vivant_id", foreignKey = @ForeignKey(name = "move_vivant_id_fk"))
	private Vivant vivant;

	public MoveKey() {

	}

	public MoveKey(Attaque attaque, Vivant vivant) {
		super();
		this.attaque = attaque;
		this.vivant = vivant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(attaque, vivant);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoveKey other = (MoveKey) obj;
		return Objects.equals(attaque, other.attaque) && Objects.equals(vivant, other.vivant);
	}

}
