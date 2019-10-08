package DAO;

import java.sql.ResultSet;
import java.sql.Statement;

import BEANS.Chercheur;
import BEANS.Directeur;
import DB.DataBaseSI;

public class directeurfunctions {
	
	public static Directeur getDirecteur(int id_directeur) {
		Directeur dir = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from directeur where id_directeur =  "+ id_directeur +" ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				dir = new Directeur(rs.getInt("id_directeur"), rs.getString("nom_directeur"), rs.getString("prenom_directeur"), 
						 rs.getString("nom_centre"),
						 rs.getString("description_centre"), rs.getFloat("montant_centre"),
						 rs.getString("etab_centre"), rs.getString("sexe_directeur"), rs.getString("num_directeur"), 
						 rs.getString("email_directeur"), rs.getString("address_directeur"), rs.getString("profession_directeur"));
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace(); 
		}	
		return dir;
	}
	
	
	public static void deletedir(int id_directeur) {
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "delete from directeur where id_directeur =  "+ id_directeur +" ";
			ResultSet rs = st.executeQuery(sql);
			
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	/*
	 * 
	 * id_directeur, nom_directeur, prenom_directeur, nom_centre, description_centre, montant_centre, etab_centre,
    sexe_directeur, num_directeur, email_directeur, address_directeur, profession_directeur)
	 */
	
	// 		directeurfunctions.ajouterDirecteur(nomdirecteur, prenomdirecteur, nomcentre, descriptioncentre, montantcentre, etablissementdirecteur, emaildirecteur, telephonedirecteur, adressedirecteur, professiondirecteur);

	public static void ajouterDirecteur(String nomdirecteur, String prenomdirecteur, String nomcentre, String descriptioncentre,float  montantcentre, 
			String etablissementdirecteur, String sexedirecteur,  String telephonedirecteur, String emaildirecteur, String adressedirecteur, String professiondirecteur) {
			
			
			try {
			     	Statement st = DataBaseSI.getStatment();
				    String sql = "insert into directeur values ( 1, '" + nomdirecteur + "', '" +  prenomdirecteur + "', '"  + nomcentre
				    + "', '" + descriptioncentre + "', " + montantcentre + ", '" + etablissementdirecteur + "', '" +  sexedirecteur + "', '" +  telephonedirecteur + "', '" + adressedirecteur + "', '" + professiondirecteur + "' )";
				    ResultSet rs = st.executeQuery(sql);
				   
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	
	
	// 			directeurfunctions.ajoutmontant(i);

	
		public static void ajoutmontant(float i) {
			try {
				
				Statement st = DataBaseSI.getStatment();
				String sql = "update directeur SET montant_centre = " + i + "	WHERE id_directeur = 1";
				ResultSet rs = st.executeQuery(sql);
			
				st.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	
	
}
