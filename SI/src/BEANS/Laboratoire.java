package BEANS;

public class Laboratoire {
	
    private int id_laboratoire;
    private String description_laboratoire;
    private String nom_laboratoire;
    private String etablissement_laboratoire;
	private int id_responsable;

    
    public int getId_laboratoire() {
		return id_laboratoire;
	}
	public Laboratoire() {
		super();
	}
	public Laboratoire(int id_laboratoire, String description_laboratoire, String nom_laboratoire,
			String etablissement_laboratoire, int id_responsable) {
		super();
		this.id_laboratoire = id_laboratoire;
		this.description_laboratoire = description_laboratoire;
		this.nom_laboratoire = nom_laboratoire;
		this.etablissement_laboratoire = etablissement_laboratoire;
		this.id_responsable = id_responsable;
	}
	public void setId_laboratoire(int id_laboratoire) {
		this.id_laboratoire = id_laboratoire;
	}
	public String getDescription_laboratoire() {
		return description_laboratoire;
	}
	public void setDescription_laboratoire(String description_laboratoire) {
		this.description_laboratoire = description_laboratoire;
	}
	public String getNom_laboratoire() {
		return nom_laboratoire;
	}
	public void setNom_laboratoire(String nom_laboratoire) {
		this.nom_laboratoire = nom_laboratoire;
	}
	public String getEtablissement_laboratoire() {
		return etablissement_laboratoire;
	}
	public void setEtablissement_laboratoire(String etablissement_laboratoire) {
		this.etablissement_laboratoire = etablissement_laboratoire;
	}
	public int getId_responsable() {
		return id_responsable;
	}
	public void setId_responsable(int id_responsable) {
		this.id_responsable = id_responsable;
	}

}
