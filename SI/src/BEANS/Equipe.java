package BEANS;

public class Equipe {

    private int id_equipe;
    private int id_laboratoire;
    private String description_equipe;
    public Equipe(int id_equipe, int id_laboratoire, String description_equipe, String responsable_equipe,
			String nom_equipe, String etablissement_equipe) {
		super();
		this.id_equipe = id_equipe;
		this.id_laboratoire = id_laboratoire;
		this.description_equipe = description_equipe;
		this.responsable_equipe = responsable_equipe;
		this.nom_equipe = nom_equipe;
		this.etablissement_equipe = etablissement_equipe;
	}
	private String responsable_equipe;
    private String nom_equipe;
    private String etablissement_equipe;
	public int getId_equipe() {
		return id_equipe;
	}
	public Equipe() {
		super();
	}
	public void setId_equipe(int id_equipe) {
		this.id_equipe = id_equipe;
	}
	public int getId_laboratoire() {
		return id_laboratoire;
	}
	public void setId_laboratoire(int id_laboratoire) {
		this.id_laboratoire = id_laboratoire;
	}
	public String getEtablissement_equipe() {
		return etablissement_equipe;
	}
	public void setEtablissement_equipe(String etablissement_equipe) {
		this.etablissement_equipe = etablissement_equipe;
	}
	public String getNom_equipe() {
		return nom_equipe;
	}
	public void setNom_equipe(String nom_equipe) {
		this.nom_equipe = nom_equipe;
	}
	public String getResponsable_equipe() {
		return responsable_equipe;
	}
	public void setResponsable_equipe(String responsable_equipe) {
		this.responsable_equipe = responsable_equipe;
	}
	public String getDescription_equipe() {
		return description_equipe;
	}
	public void setDescription_equipe(String description_equipe) {
		this.description_equipe = description_equipe;
	}

}
