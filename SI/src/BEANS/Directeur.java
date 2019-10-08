package BEANS;

public class Directeur {
	
	    private int id_directeur;
	    private String nom_directeur;
	    private String prenom_directeur;
	    private String nom_centre;
	    private String description_centre;
	    private Float montant_centre;
	    private String etab_centre;
	    private String sexe_directeur;
	    private String num_directeur;
	    private String email_directeur;
	    private String address_directeur;
	    private String profession_directeur;
	    
	    public Directeur(int id_directeur, String nom_directeur, String prenom_directeur, String nom_centre,
				String description_centre, Float montant_centre, String etab_centre, String sexe_directeur,
				String num_directeur, String email_directeur, String address_directeur, String profession_directeur) {
			super();
			this.id_directeur = id_directeur;
			this.nom_directeur = nom_directeur;
			this.prenom_directeur = prenom_directeur;
			this.nom_centre = nom_centre;
			this.description_centre = description_centre;
			this.montant_centre = montant_centre;
			this.etab_centre = etab_centre;
			this.sexe_directeur = sexe_directeur;
			this.num_directeur = num_directeur;
			this.email_directeur = email_directeur;
			this.address_directeur = address_directeur;
			this.profession_directeur = profession_directeur;
		}
		public Directeur() {
			super();
		}
		public int getId_directeur() {
			return id_directeur;
		}
		public void setId_directeur(int id_directeur) {
			this.id_directeur = id_directeur;
		}
		public String getNom_directeur() {
			return nom_directeur;
		}
		public void setNom_directeur(String nom_directeur) {
			this.nom_directeur = nom_directeur;
		}
		public String getPrenom_directeur() {
			return prenom_directeur;
		}
		public void setPrenom_directeur(String prenom_directeur) {
			this.prenom_directeur = prenom_directeur;
		}
		public String getNom_centre() {
			return nom_centre;
		}
		public void setNom_centre(String nom_centre) {
			this.nom_centre = nom_centre;
		}
		public String getDescription_centre() {
			return description_centre;
		}
		public void setDescription_centre(String description_centre) {
			this.description_centre = description_centre;
		}
		public Float getMontant_centre() {
			return montant_centre;
		}
		public void setMontant_centre(Float montant_centre) {
			this.montant_centre = montant_centre;
		}
		public String getEtab_centre() {
			return etab_centre;
		}
		public void setEtab_centre(String etab_centre) {
			this.etab_centre = etab_centre;
		}
		public String getSexe_directeur() {
			return sexe_directeur;
		}
		public void setSexe_directeur(String sexe_directeur) {
			this.sexe_directeur = sexe_directeur;
		}
		public String getNum_directeur() {
			return num_directeur;
		}
		public void setNum_directeur(String num_directeur) {
			this.num_directeur = num_directeur;
		}
		public String getEmail_directeur() {
			return email_directeur;
		}
		public void setEmail_directeur(String email_directeur) {
			this.email_directeur = email_directeur;
		}
		public String getAddress_directeur() {
			return address_directeur;
		}
		public void setAddress_directeur(String address_directeur) {
			this.address_directeur = address_directeur;
		}
		public String getProfession_directeur() {
			return profession_directeur;
		}
		public void setProfession_directeur(String profession_directeur) {
			this.profession_directeur = profession_directeur;
		}
		

}
