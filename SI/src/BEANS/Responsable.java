package BEANS;

public class Responsable {
	
    private int id_responsable;
    private String nom_responsable;
    private String prenom_responsable;
    private String etab_responsable;
    private String sexe_responsable;
    private String num_responsable;
    private String email_responsable;
    private String address_responsable;
    
    
    public Responsable(int id_responsable, String nom_responsable, String prenom_responsable,
			String etab_responsable, String sexe_responsable, String num_responsable, String email_responsable,
			String address_responsable, String profession_responsable) {
		super();
		this.id_responsable = id_responsable;
		this.nom_responsable = nom_responsable;
		this.prenom_responsable = prenom_responsable;
		this.etab_responsable = etab_responsable;
		this.sexe_responsable = sexe_responsable;
		this.num_responsable = num_responsable;
		this.email_responsable = email_responsable;
		this.address_responsable = address_responsable;
		this.profession_responsable = profession_responsable;
	}
    
    public Responsable() {
		super();
	}
	public int getId_responsable() {
		return id_responsable;
	}
	public void setId_responsable(int id_responsable) {
		this.id_responsable = id_responsable;
	}
	public String getNom_responsable() {
		return nom_responsable;
	}
	public void setNom_responsable(String nom_responsable) {
		this.nom_responsable = nom_responsable;
	}
	public String getPrenom_responsable() {
		return prenom_responsable;
	}
	
	public void setPrenom_responsable(String prenom_responsable) {
		this.prenom_responsable = prenom_responsable;
	}

	public String getEtab_responsable() {
		return etab_responsable;
	}
	public void setEtab_responsable(String etab_responsable) {
		this.etab_responsable = etab_responsable;
	}
	public String getSexe_responsable() {
		return sexe_responsable;
	}
	public void setSexe_responsable(String sexe_responsable) {
		this.sexe_responsable = sexe_responsable;
	}
	public String getNum_responsable() {
		return num_responsable;
	}
	public void setNum_responsable(String num_responsable) {
		this.num_responsable = num_responsable;
	}
	public String getEmail_responsable() {
		return email_responsable;
	}
	public void setEmail_responsable(String email_responsable) {
		this.email_responsable = email_responsable;
	}
	public String getAddress_responsable() {
		return address_responsable;
	}
	public void setAddress_responsable(String address_responsable) {
		this.address_responsable = address_responsable;
	}
	public String getProfession_responsable() {
		return profession_responsable;
	}
	public void setProfession_responsable(String profession_responsable) {
		this.profession_responsable = profession_responsable;
	}
	private String profession_responsable;
	
}
