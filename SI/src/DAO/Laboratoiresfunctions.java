package DAO;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import BEANS.Categorie;
import BEANS.Chercheur;
import BEANS.Equipe;
import BEANS.Laboratoire;
import BEANS.Responsable;
import DB.DataBaseSI;

public class Laboratoiresfunctions {
	
	/*
	 * 
	 * int id_laboratoire, String description_laboratoire, String nom_laboratoire,
			String etablissement_laboratoire, int id_responsable
	 */

	public static Laboratoire getLaboratoire(int id_laboratoire) {
		Laboratoire lab = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from Laboratoire where id_laboratoire =  "+ id_laboratoire +" ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				lab = new Laboratoire(rs.getInt("id_laboratoire"), rs.getString("description_laboratoire"), rs.getString("nom_laboratoire"),
						 rs.getString("etablissement_laboratoire"), rs.getInt("id_responsable"));
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return lab;
	}
	
	
	
public static ArrayList<Laboratoire> getLaboratoireChercheurs(int id_ch){
		
		ArrayList<Laboratoire> labs = new ArrayList<Laboratoire>();
		Laboratoire lab = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from Laboratoire where id_laboratoire in (select id_laboratoire from chercheurl where id_chercheur = '"+ id_ch   + "')";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 
				lab = new Laboratoire(rs.getInt("id_laboratoire"), rs.getString("description_laboratoire"), rs.getString("nom_laboratoire"),
						 rs.getString("etablissement_laboratoire"), rs.getInt("id_responsable"));
				 labs.add(lab);
				 
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return labs;
		
	}

public static Laboratoire getLaboratoireResponsable(int id_laboratoire){
	
	Laboratoire lab = null;
	try {
		
		Statement st = DataBaseSI.getStatment();
		String sql = "select * from Laboratoire where id_laboratoire = " + id_laboratoire + " ";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			 
			lab = new Laboratoire(rs.getInt("id_laboratoire"), rs.getString("description_laboratoire"), rs.getString("nom_laboratoire"),
					 rs.getString("etablissement_laboratoire"), rs.getInt("id_responsable"));
			 
		}
		st.close();
	} catch (Exception e) {
		e.printStackTrace();
	}	
	return lab;
	
}
	
	public static ArrayList<Equipe> getLaboratoireEquipes(int id_laboratoire){
		
		ArrayList<Equipe> equipes = new ArrayList<Equipe>();
		Equipe eq = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from Equipe where id_laboratoire = '"+ id_laboratoire   + "' ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 
				eq = new Equipe(rs.getInt("id_equipe"), rs.getInt("id_laboratoire"), rs.getString("description_equipe"), rs.getString("responsable_equipe"),
						 rs.getString("nom_equipe"), rs.getString("etablissement_equipe"));
				 equipes.add(eq);
				 
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return equipes;
		
	}
	
public static ArrayList<Chercheur> getLaboratoireMembres(int id_laboratoire){
		
		ArrayList<Chercheur> chs = new ArrayList<Chercheur>();
		Chercheur ch = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from chercheur where id_ch in (select id_chercheur from chercheurl where id_laboratoire = '"+ id_laboratoire   + "')";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 
				 ch = new Chercheur(rs.getInt("id_ch"), rs.getString("nom_ch"), rs.getString("prenom_ch"), rs.getString("etab_ch"),
						 rs.getString("num_ch"), rs.getString("email_ch"),
						 rs.getString("address_ch"), rs.getString("profession_ch"), rs.getString("sexe_ch") );
				 chs.add(ch);
				 
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return chs;
		
	}

public static float getmontantbychercheur(int id_laboratoire,float montant) {
	
	
	int nombre=0;
	try {
		
		Statement st = DataBaseSI.getStatment();
		String sql = " select count(id_chercheur) as nombrech from chercheurl where id_laboratoire = '"+ id_laboratoire   + "'and type_ch = 0 ";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			 
			 nombre = rs.getInt("nombrech");
			 	 
		}
		st.close();
	} catch (Exception e) {
		e.printStackTrace();
	}	
	return montant/nombre;
	
}


public static ArrayList<Laboratoire> getallLabo(){
	
	ArrayList<Laboratoire> labs = new ArrayList<Laboratoire>();
	Laboratoire lab = null;
	try {
		
		Statement st = DataBaseSI.getStatment();
		String sql = "select * from Laboratoire";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			 
			lab = new Laboratoire(rs.getInt("id_laboratoire"), rs.getString("description_laboratoire"), rs.getString("nom_laboratoire"),
					 rs.getString("etablissement_laboratoire"), rs.getInt("id_responsable"));
			 labs.add(lab);
			 
		}
		st.close();
	} catch (Exception e) {
		e.printStackTrace();
	}	
	return labs;
	
}

/*
 * 
 * id_laboratoire INTEGER PRIMARY KEY,
    description_laboratoire VARCHAR(100),
    nom_laboratoire VARCHAR(100),
    etablissement_laboratoire VARCHAR(100),
    id_responsable INTEGER
 */

public static int ajouterLaboratoire(String description_laboratoire, String nom_laboratoire, String etablissement_laboratoire, int id_responsable) {
	
	int nlaboratoire = 0;
	
	
	
	try {
		
		Statement st = DataBaseSI.getStatment();
		String sql = "select count(*) as maax from laboratoire";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			nlaboratoire = rs.getInt("maax");
		}	
		st.close();
		 
	} catch (Exception e) {
		e.printStackTrace();
	}	
	
try {			
		Statement stt = DataBaseSI.getStatment();
		/*
		 * INSERT INTO Demande (id_demande, description_demande, id_chercheur, id_categorie, date_demande, etat_demande, 
		 * montant_demande) VALUES (1,'Frais de mission',2,1, '12-DEC-2018','en cours',4000);

		 */
		nlaboratoire = nlaboratoire + 1;

		String sql = "insert into laboratoire values(" + nlaboratoire + ", '" + description_laboratoire + "',  '" 
		+ nom_laboratoire + "',  '" + etablissement_laboratoire + "'," + id_responsable +")";
		
		ResultSet rss = stt.executeQuery(sql);	

		stt.close();
	} catch (Exception e) {
		e.printStackTrace();
	}

	return nlaboratoire;
}

// getallResponsables

/*
 * 
 * int id_responsable, String nom_responsable, String prenom_responsable, int id_laboratoire,
			String etab_responsable, String sexe_responsable, String num_responsable, String email_responsable,
			String address_responsable, String profession_responsable
 */


public static ArrayList<Responsable> getallResponsables(){
	
	ArrayList<Responsable> responsables = new ArrayList<Responsable>();
	Responsable lab = null;
	try {
		
		Statement st = DataBaseSI.getStatment();
		String sql = "select * from responsable";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			 
			lab = new Responsable( rs.getInt("id_responsable"), rs.getString("nom_responsable"), rs.getString("prenom_responsable"),
					 rs.getString("etab_responsable"), rs.getString("sexe_responsable"), rs.getString("num_responsable"), rs.getString("email_responsable"), 
					 rs.getString("address_responsable"), rs.getString("profession_responsable") );
			
			responsables.add(lab);
			 
		}
		st.close();
	} catch (Exception e) {
		e.printStackTrace();
	}	
	return responsables;	
}


public static int getLaboratoireMembresPermanent(int id_laboratoire){
	
	int ch = 0;
	try {
		
		Statement st = DataBaseSI.getStatment();
		String sql = "select count(*) as membresp from chercheur where id_ch in (select id_chercheur from chercheurl where id_laboratoire = "+ id_laboratoire   + "and type_ch=0)";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			 
			 ch = rs.getInt("membresp");
			 
		}
		st.close();
	} catch (Exception e) {
		e.printStackTrace();
	}	
	return ch;
	
}


	
public static float montantpart(int id_laboratoire, Categorie cat) {
	
				float montantchercheur=0;
				int somme =0;
				ArrayList<Laboratoire> laboratoires =new ArrayList<Laboratoire>();
				laboratoires= Laboratoiresfunctions.getallLabo();
				
				for(Laboratoire lab : laboratoires) {
					
					somme = somme+ getLaboratoireMembresPermanent( lab.getId_laboratoire());
				}
				
				
				montantchercheur= cat.getMontant_categorie()/somme;
				
	
				return montantchercheur*getLaboratoireMembresPermanent( id_laboratoire);
			
}



public static void deletelab(int id_laboratoire) {
	try {
		
		Statement st = DataBaseSI.getStatment();
		String sql = "delete from laboratoire where id_laboratoire =  "+ id_laboratoire +" ";
		ResultSet rs = st.executeQuery(sql);
		
		st.close();
	} catch (Exception e) {
		e.printStackTrace();
	}	
}




}
