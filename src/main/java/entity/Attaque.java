package entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;



@Entity
@SequenceGenerator(name = "seqAttaque", sequenceName = "seq_attaque", allocationSize = 1, initialValue = 10)
public class Attaque implements Serializable {
	
	@ManyToMany(mappedBy = "attaque")
	private Set<Vivant> vivant;
	/*----------- Attributs -----------*/	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqAttaque")
	private Integer id;
	
	private String nom;
	private String description;

	private int niveau;
	@Enumerated(EnumType.STRING)
	private TypeCible typeCible;
	@Enumerated(EnumType.STRING)
	private TypeAtt typeAtt;

	private int degatMagique;
	private int degatPhysique;
	private int degatDistance;


	private double chanceTouch;
	private double chanceCritique;

	private double multiplCritique;

	private int coutPA;
	private int coutPM;

	private int effetPA;
	private int effetPM;

	/*----------- Constrictors -----------*/

	public Attaque(int id, String nom, String description, int niveau, 
			TypeCible typeCible, TypeAtt typeAtt, 
			int degatMagique, int degatPhysique, int degatDistance, 
			double chanceTouch, double chanceCritique,
			int coutPA, int coutPM, int malusPA, int malusPM ) {

		this.id = id;				
		this.nom = nom;
		this.description = description;

		this.niveau = niveau;

		this.typeCible = typeCible;
		this.typeAtt = typeAtt;

		this.degatMagique = degatMagique;
		this.degatPhysique = degatPhysique;
		this.degatDistance = degatDistance;

		this.chanceTouch = chanceTouch;
		this.chanceCritique = chanceCritique;
		this.multiplCritique = 1;

		this.coutPA = coutPA;
		this.coutPM = coutPM;

		this.effetPA = malusPA;
		this.effetPM = malusPM;
	}
	public Attaque(String nom, String description, int niveau, 
			TypeCible typeCible, TypeAtt typeAtt, 
			int degatMagique, int degatPhysique, int degatDistance, 
			double chanceTouch, double chanceCritique,
			int coutPA, int coutPM, int malusPA, int malusPM ) {

		this.id = id;				
		this.nom = nom;
		this.description = description;

		this.niveau = niveau;

		this.typeCible = typeCible;
		this.typeAtt = typeAtt;

		this.degatMagique = degatMagique;
		this.degatPhysique = degatPhysique;
		this.degatDistance = degatDistance;

		this.chanceTouch = chanceTouch;
		this.chanceCritique = chanceCritique;
		this.multiplCritique = 1;

		this.coutPA = coutPA;
		this.coutPM = coutPM;

		this.effetPA = malusPA;
		this.effetPM = malusPM;
	}



	/*----------- Getters & Setters -----------*/

	public Integer getId(){
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}	

	public String getDesription() {
		return description;
	}



	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}



	public TypeAtt getTypeAtt() {
		return typeAtt;
	}


	public TypeCible getTypeCible() {
		return typeCible;
	}


	public int getDegatMagique() {
		return degatMagique;
	}


	public void setDegatMagique(int degatMagique) {
		this.degatMagique = degatMagique;
	}

	public int getDegatPhysique() {
		return degatPhysique;
	}

	public void setDegatPhysique(int degatPhysique) {
		this.degatPhysique = degatPhysique;
	}


	public int getDegatDistance() {
		return degatDistance;
	}

	public void setDegatDistance(int degatDistance) {
		this.degatDistance = degatDistance;
	}

	public double getChanceTouch() {
		return chanceTouch;
	}

	public void setChanceTouch(double chanceTouch) {
		this.chanceTouch = chanceTouch;
	}

	public double getChanceCritique() {
		return chanceCritique;
	}

	public void setChanceCritique(double chanceCritique) {
		this.chanceCritique = chanceCritique;
	}

	public double getMultiplCritique() {
		return multiplCritique;
	}

	public void setMultiplCritique(double multiplCritique) {
		this.multiplCritique = multiplCritique;
	}


	public int getCoutPA() {
		return coutPA;
	}

	public void setCoutPA(int coutPA) {
		this.coutPA = coutPA;
	}

	public int getCoutPM() {
		return coutPM;
	}

	public void setCoutPM(int coutPM) {
		this.coutPM = coutPM;
	}

	public int getMalusPA() {
		return effetPA;
	}

	public void setMalusPA(int malusPA) {
		this.effetPA = malusPA;
	}

	public int getMalusPM() {
		return effetPM;
	}

	public void getMalusPM(int malusPM) {
		this.effetPM = malusPM;
	}
	
	
	/*----------- hashCode -----------*/
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attaque other = (Attaque) obj;
		return Objects.equals(id, other.id);
	}


	

	

}
