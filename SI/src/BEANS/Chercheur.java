package BEANS;

public class Chercheur {
	
	 	private int id_ch;
	 	private String nom_ch;
	 	private String prenom_ch;
	 	private String etab_ch;
	 	private String sexe_ch;
	 	private String num_ch;
	 	private String email_ch;
	 	private String address_ch;
	 	private String profession_ch;
	 	
	 	
	 	
	 	public Chercheur() {
			super();
		}
		public Chercheur(int id_ch, String nom_ch, String prenom_ch, String etab_ch, String num_ch, String email_ch,
				 String address_ch, String profession_ch, String sexe_ch) {
			
			this.id_ch = id_ch;
			this.nom_ch = nom_ch;
			this.prenom_ch = prenom_ch;
			this.etab_ch = etab_ch;
			this.sexe_ch = sexe_ch;
			this.num_ch = num_ch;
			this.email_ch = email_ch;
			this.address_ch = address_ch;
			this.profession_ch = profession_ch;
			

		}
		

	 	public int getId_ch() {
			return id_ch;
		}
		public void setId_ch(int id_ch) {
			this.id_ch = id_ch;
		}
		public String getNom_ch() {
			return nom_ch;
		}
		public void setNom_ch(String nom_ch) {
			this.nom_ch = nom_ch;
		}
		public String getPrenom_ch() {
			return prenom_ch;
		}
		public void setPrenom_ch(String prenom_ch) {
			this.prenom_ch = prenom_ch;
		}
		public String getEtab_ch() {
			return etab_ch;
		}
		public void setEtab_ch(String etab_ch) {
			this.etab_ch = etab_ch;
		}
		public String getSexe_ch() {
			return sexe_ch;
		}
		public void setSexe_ch(String sexe_ch) {
			this.sexe_ch = sexe_ch;
		}
		public String getNum_ch() {
			return num_ch;
		}
		public void setNum_ch(String num_ch) {
			this.num_ch = num_ch;
		}
		public String getEmail_ch() {
			return email_ch;
		}
		public void setEmail_ch(String email_ch) {
			this.email_ch = email_ch;
		}
		public String getAddress_ch() {
			return address_ch;
		}
		public void setAddress_ch(String address_ch) {
			this.address_ch = address_ch;
		}
		public String getProfession_ch() {
			return profession_ch;
		}
		public void setProfession_ch(String profession_ch) {
			this.profession_ch = profession_ch;
		}
		
}
