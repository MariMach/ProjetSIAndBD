package DAO;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import BEANS.Equipe;
import BEANS.Chercheur;
import DB.DataBaseSI;

public class equipefunctions {
	
	public static Equipe getEquipe(int id_equipe) {
		Equipe eq = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from equipe where id_equipe =  "+ id_equipe +" ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				eq = new Equipe(rs.getInt("id_equipe"), rs.getInt("id_laboratoire"), rs.getString("description_equipe"), rs.getString("responsable_equipe"),
						 rs.getString("nom_equipe"), rs.getString("etablissement_equipe"));
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return eq;
	}
	
	
	public static ArrayList<Chercheur> getEquipeMembres(int id_equipe){
		
		ArrayList<Chercheur> chs = new ArrayList<Chercheur>();
		Chercheur ch = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from chercheur where id_ch in (select id_chercheur from chercheure where id_equipe = '"+ id_equipe   + "')";
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
	
	
	public static ArrayList<Equipe> getallEquipes(){
		
		ArrayList<Equipe> equipes = new ArrayList<Equipe>();
		Equipe eq = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from equipe";
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
	

	/*
	 * 
	 * (id_equipe, id_laboratoire, description_equipe, responsable_equipe, nom_equipe, etablissement_equipe
	 */
	
	public static void AjouterEquipe(Equipe eq) {
		int ma = 0;

		try {
			Statement st = DataBaseSI.getStatment();
			String sql = "select count(*) as maax from equipe";
			ResultSet rs = st.executeQuery(sql);			
			
			while(rs.next()) {
		     
				ma = rs.getInt("maax");
			}					
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		
		try {

		     	Statement st = DataBaseSI.getStatment();
			    String sql = "insert into equipe values ( " + ma+1 + ", " +  eq.getId_laboratoire() + ", '"  +eq.getDescription_equipe()
			    + "', '" + eq.getResponsable_equipe()+ "', '"  + eq.getNom_equipe() + "', '" + eq.getEtablissement_equipe()+ "' )";
			    ResultSet rs = st.executeQuery(sql);
			   
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	public static void deleteeq(int id_equipe) {
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "delete from equipe where id_equipe =  "+ id_equipe +" ";
			ResultSet rs = st.executeQuery(sql);
			
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
