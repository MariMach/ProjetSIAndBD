package BEANS;

import java.util.Date;

public class Demande {
/*
	 id_demande INTEGER PRIMARY KEY,
	    description_demande VARCHAR(200),
	    id_chercheur INTEGER,
	    id_categorie  VARCHAR(100),
	    date_demande DATE,
	    etat_demande VARCHAR(100),
	    montant_demande  INTEGER
	    
	*/
	
	private int id_demande;
	private String description_demande;
	private int id_chercheur;
	private int id_categorie;
	private  String date_demande;
	private String etat_demande;
	private Float montant_demande;
	private int id_laboratoire;
	
	public int getId_demande() {
		return id_demande;
	}
	public void setId_demande(int id_demande) {
		this.id_demande = id_demande;
	}
	public String getDescription_demande() {
		return description_demande;
	}
	public Demande() {
		super();
	}
	public Demande(int id_demande, String description_demande, int id_chercheur, int id_categorie, String date_demande,
			String etat_demande, Float montant_demande, int id_laboratoire) {
		super();
		this.id_demande = id_demande;
		this.description_demande = description_demande;
		this.id_chercheur = id_chercheur;
		this.id_categorie = id_categorie;
		this.date_demande = date_demande;
		this.etat_demande = etat_demande;
		this.montant_demande = montant_demande;
		this.id_laboratoire = id_laboratoire;

	}
	public void setDescription_demande(String description_demande) {
		this.description_demande = description_demande;
	}
	public int getId_chercheur() {
		return id_chercheur;
	}
	public void setId_chercheur(int id_chercheur) {
		this.id_chercheur = id_chercheur;
	}
	public int getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(int id_categorie) {
		this.id_categorie = id_categorie;
	}
	public String getDate_demande() {
		return date_demande;
	}
	public void setDate_demande(String date_demande) {
		this.date_demande = date_demande;
	}
	public String getEtat_demande() {
		return etat_demande;
	}
	public void setEtat_demande(String etat_demande) {
		this.etat_demande = etat_demande;
	}
	public Float getMontant_demande() {
		return montant_demande;
	}
	public void setMontant_demande(Float montant_demande) {
		this.montant_demande = montant_demande;
	}
	public int getId_laboratoire() {
		return id_laboratoire;
	}
	public void setId_laboratoire(int id_laboratoire) {
		this.id_laboratoire = id_laboratoire;
	}
}
