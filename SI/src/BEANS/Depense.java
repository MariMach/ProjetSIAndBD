package BEANS;

public class Depense {
	/*
	 * 
	id_depense INTEGER PRIMARY KEY,
    description_depense VARCHAR(200),
    nom_depense VARCHAR(100),
    montant_depense FLOAT
	 */
	
	private int id_depense;
	private String description_depense;
	private String nom_depense;
	private Float montant_depense;
	
	public Depense(int id_depense, String description_depense, String nom_depense, Float montant_depense) {
		super();
		this.id_depense = id_depense;
		this.description_depense = description_depense;
		this.nom_depense = nom_depense;
		this.montant_depense = montant_depense;
	}
	public Depense() {
		super();
	}
	public int getId_depense() {
		return id_depense;
	}
	public void setId_depense(int id_depense) {
		this.id_depense = id_depense;
	}
	public String getDescription_depense() {
		return description_depense;
	}
	public void setDescription_depense(String description_depense) {
		this.description_depense = description_depense;
	}
	public String getNom_depense() {
		return nom_depense;
	}
	public void setNom_depense(String nom_depense) {
		this.nom_depense = nom_depense;
	}
	public Float getMontant_depense() {
		return montant_depense;
	}
	public void setMontant_depense(Float montant_depense) {
		this.montant_depense = montant_depense;
	}

}
