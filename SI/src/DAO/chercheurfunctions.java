package DAO;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import BEANS.Chercheur;
import BEANS.Equipe;
import BEANS.Laboratoire;
import DB.DataBaseSI;

public class chercheurfunctions {
	
	/*
	 *   id_ch INTEGER PRIMARY KEY,
    nom_ch VARCHAR(100) NOT NULL,
    prenom_ch VARCHAR(100) NOT NULL,
    etab_ch VARCHAR(100) NOT NULL,
    num_ch VARCHAR(100) NOT NULL, 
    email_ch VARCHAR(200) NOT NULL,
    address_ch VARCHAR(200) NOT NULL,
    profession_ch VARCHAR(200) NOT NULL,
    sexe_ch VARCHAR(50) NOT NULL
	 */
	
	public static Chercheur getChercheur(int id_ch) {
		Chercheur ch = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from Chercheur where id_ch =  "+ id_ch +" ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 ch = new Chercheur(rs.getInt("id_ch"), rs.getString("nom_ch"), rs.getString("prenom_ch"), rs.getString("etab_ch"),
						 rs.getString("num_ch"), rs.getString("email_ch"),
						 rs.getString("address_ch"), rs.getString("profession_ch"), rs.getString("sexe_ch") );
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return ch;
	}
	
	
	public static ArrayList<Chercheur> getChercheurs() {
		
		ArrayList<Chercheur> chercheurs = new ArrayList<Chercheur>();
		Chercheur chr = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from chercheur";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 
					chr = new Chercheur(rs.getInt("id_ch"), rs.getString("nom_ch"), rs.getString("prenom_ch"), rs.getString("etab_ch"),
						 rs.getString("num_ch"), rs.getString("email_ch"),
						 rs.getString("address_ch"), rs.getString("profession_ch"), rs.getString("sexe_ch") );
					
					chercheurs.add(chr);
				 
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return chercheurs;
		
	}
	
	
	/*
	 * int id_equipe, int id_laboratoire, String description_equipe, String responsable_equipe,
			String nom_equipe, String etablissement_equipe
	 */
	
	
	public static ArrayList<Equipe> getEquipesChercheurs(int id_ch){
		
		ArrayList<Equipe> equipes = new ArrayList<Equipe>();
		Equipe eq = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from Equipe where id_equipe in (select id_equipe from chercheure where id_chercheur = '"+ id_ch   + "')";
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
	
	public static String getTypechercheur(int id_ch, int id_equipe){
		
		int type = 100;
		String type_ch = "non definis";
		
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select type_ch from chercheure where id_equipe ='"+  id_equipe   + "' and id_chercheur ='"+ id_ch   + "' ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				type = 	rs.getInt("type_ch");		
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		if(type == 0) {
			type_ch = "Permanent";
			return type_ch;
		} else if(type == 1){
			type_ch = "Associe";
			return type_ch;
		} else {
			return type_ch;
		}
	} 
	

	public static String getTypechercheurlab(int id_ch, int id_laboratoire){
		
		int type = 100;
		String type_ch = "non definis";
		
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select type_ch from chercheurl where id_laboratoire ='"+  id_laboratoire   + "' and id_chercheur ='"+ id_ch   + "' ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				type = 	rs.getInt("type_ch");		
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		if(type == 0) {
			type_ch = "Permanent";
			return type_ch;
		} else if(type == 1){
			type_ch = "associe";
			return type_ch;
		} else {
			return type_ch;
		}
	} 
	
	
	public static void AjouterChercheur(Chercheur ch) {
		int ma = 0;

		try {
			Statement st = DataBaseSI.getStatment();
			String sql = "select count(*) as maax from chercheur";
			ResultSet rs = st.executeQuery(sql);			
			
			while(rs.next()) {
		     
				ma = rs.getInt("maax");
			}					
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		
		try {
			

		     	Statement st = DataBaseSI.getStatment();
			    String sql = "insert into Chercheur values ( " + ma+1 +", '" + ch.getNom_ch() + "', '" +  ch.getPrenom_ch() + "', '"  + ch.getEtab_ch()
			    + "', '" + ch.getNum_ch() + "', '" + ch.getEmail_ch() + "', '" + ch.getAddress_ch() + "', '" + ch.getProfession_ch() + "', '" + ch.getSexe_ch() + "' )";
			    ResultSet rs = st.executeQuery(sql);
			   
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	public static void deletechr(int id_ch) {
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "delete from chercheur where id_ch =  "+ id_ch +" ";
			ResultSet rs = st.executeQuery(sql);
			
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	//  		chercheurfunctions.deletechrlogin(m);
	
	/*
	 * 
	 * INSERT INTO LoginTable(login, motdepasse, logintype, id_login)
VALUES ('mariammacha', 'chercheur1234', 'a', 1);
	 */

	public static void deletechrlogin(int id_ch) {
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "delete from LoginTable where id_login =  "+ id_ch +" and  logintype = 'a'";
			ResultSet rs = st.executeQuery(sql);
			
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	
	
	
}






