package BEANS;

public class Administrateur {
	
	
		private int id_administrateur;
		private String  nom_administrateur; 
	    private String prenom_administrateur;
	    private String etab_administrateur;
	    private String  sexe_administrateur;
	    private String num_administrateur;
	    private String email_administrateur;
	    private String  address_administrateur;
	    private String   profession_administrateur;
	    
	    public Administrateur(int id_administrateur, String nom_administrateur, String prenom_administrateur,
				String etab_administrateur, String sexe_administrateur, String num_administrateur,
				String email_administrateur, String address_administrateur, String profession_administrateur) {
			super();
			this.id_administrateur = id_administrateur;
			this.nom_administrateur = nom_administrateur;
			this.prenom_administrateur = prenom_administrateur;
			this.etab_administrateur = etab_administrateur;
			this.sexe_administrateur = sexe_administrateur;
			this.num_administrateur = num_administrateur;
			this.email_administrateur = email_administrateur;
			this.address_administrateur = address_administrateur;
			this.profession_administrateur = profession_administrateur;
		}
		public int getId_administrateur() {
			return id_administrateur;
		}
		public void setId_administrateur(int id_administrateur) {
			this.id_administrateur = id_administrateur;
		}
		public Administrateur() {
			super();
		}
		public String getNom_administrateur() {
			return nom_administrateur;
		}
		public void setNom_administrateur(String nom_administrateur) {
			this.nom_administrateur = nom_administrateur;
		}
		public String getPrenom_administrateur() {
			return prenom_administrateur;
		}
		public void setPrenom_administrateur(String prenom_administrateur) {
			this.prenom_administrateur = prenom_administrateur;
		}
		public String getEtab_administrateur() {
			return etab_administrateur;
		}
		public void setEtab_administrateur(String etab_administrateur) {
			this.etab_administrateur = etab_administrateur;
		}
		public String getSexe_administrateur() {
			return sexe_administrateur;
		}
		public void setSexe_administrateur(String sexe_administrateur) {
			this.sexe_administrateur = sexe_administrateur;
		}
		public String getNum_administrateur() {
			return num_administrateur;
		}
		public void setNum_administrateur(String num_administrateur) {
			this.num_administrateur = num_administrateur;
		}
		public String getEmail_administrateur() {
			return email_administrateur;
		}
		public void setEmail_administrateur(String email_administrateur) {
			this.email_administrateur = email_administrateur;
		}
		public String getAddress_administrateur() {
			return address_administrateur;
		}
		public void setAddress_administrateur(String address_administrateur) {
			this.address_administrateur = address_administrateur;
		}
		public String getProfession_administrateur() {
			return profession_administrateur;
		}
		public void setProfession_administrateur(String profession_administrateur) {
			this.profession_administrateur = profession_administrateur;
		}
		
	
	

}
