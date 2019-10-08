package DAO;

import java.sql.ResultSet;
import java.sql.Statement;

import BEANS.Administrateur;
import DB.DataBaseSI;

public class administrateurfunctions {
	
	/*
	  			int id_administrateur, String nom_administrateur, String prenom_administrateur,
				String etab_administrateur, String sexe_administrateur, String num_administrateur,
				String email_administrateur, String address_administrateur, String profession_administrateur
	 */
	
	
	public static Administrateur getAdministrateur(int id_administrateur) {
		Administrateur admin = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from administrateur where id_administrateur =  "+ id_administrateur +" ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				admin = new Administrateur(
				 rs.getInt("id_administrateur"), rs.getString("nom_administrateur"), rs.getString("prenom_administrateur"), 
						 rs.getString("etab_administrateur"), rs.getString("sexe_administrateur"),
						 rs.getString("num_administrateur"), rs.getString("email_administrateur"), rs.getString("address_administrateur"), 
						 rs.getString("profession_administrateur"));
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return admin;
	}

}
