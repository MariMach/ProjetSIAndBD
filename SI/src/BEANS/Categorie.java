package BEANS;

public class Categorie {
	
	/*
	 * 
	 * id_categorie INTEGER PRIMARY KEY,
    description_categorie VARCHAR(200),
    nom_categorie VARCHAR(100),
    id_depense  INTEGER,
    montant_categorie FLOAT
	 * 
	 * 
	 */
	
	private int id_categorie;
	private int id_depense;
	private String description_categorie;
	private String nom_categorie;
	private Float montant_categorie;
	public int getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(int id_categorie) {
		this.id_categorie = id_categorie;
	}
	public int getId_depense() {
		return id_depense;
	}
	public Categorie() {
		super();
	}
	public Categorie(int id_categorie, int id_depense, String description_categorie, String nom_categorie,
			Float montant_categorie) {
		super();
		this.id_categorie = id_categorie;
		this.id_depense = id_depense;
		this.description_categorie = description_categorie;
		this.nom_categorie = nom_categorie;
		this.montant_categorie = montant_categorie;
	}
	public void setId_depense(int id_depense) {
		this.id_depense = id_depense;
	}
	public String getDescription_categorie() {
		return description_categorie;
	}
	public void setDescription_categorie(String description_categorie) {
		this.description_categorie = description_categorie;
	}
	public String getNom_categorie() {
		return nom_categorie;
	}
	public void setNom_categorie(String nom_categorie) {
		this.nom_categorie = nom_categorie;
	}
	public Float getMontant_categorie() {
		return montant_categorie;
	}
	public void setMontant_categorie(Float montant_categorie) {
		this.montant_categorie = montant_categorie;
	}

}
