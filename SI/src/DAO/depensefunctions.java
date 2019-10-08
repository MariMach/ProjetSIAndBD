package DAO;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import BEANS.Categorie;
import BEANS.Depense;
import DB.DataBaseSI;


/*
 * int id_depense, String description_depense, String nom_depense, Float montant_depense
 */

public class depensefunctions {
	
	public static ArrayList<Depense> getDepense(){
		
		ArrayList<Depense> cats = new ArrayList<Depense>();
		
		Depense cat = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from depense ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 
				 cat = new Depense(rs.getInt("id_depense"), rs.getString("description_depense"), rs.getString("nom_depense"), rs.getFloat("montant_depense"));
				 
				 cats.add(cat);
				 
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cats;
	}
	
	public static String getDepensebyId(int id_depense) {
		String nomd = "";
		
		try {
			Statement st = DataBaseSI.getStatment();
			String sql = "select nom_depense from depense where id_depense = " + id_depense + " ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				nomd = rs.getString("nom_depense");
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return nomd;
	}
	
	public static ArrayList<Categorie> getDepenseCategories(int id_depense){
		
		ArrayList<Categorie> cats = new ArrayList<Categorie>();
		
		Categorie cat = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from categorie where id_depense = "+ id_depense + " ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 
				 cat = new Categorie(rs.getInt("id_categorie"), rs.getInt("id_depense"), rs.getString("description_categorie"), rs.getString("nom_categorie"),
						 rs.getFloat("montant_categorie"));
				 
				 cats.add(cat);
				 
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cats;
	}
	
	
	public static Float getMontantByLabCat(int id_laboratoire, int id_categorie) {		
		float montant = 0;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select montant_affecte from designerBudget where id_categorie = "+ id_categorie + " and id_laboratoire =  "+ id_laboratoire +" ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 
				 montant = rs.getFloat("montant_affecte");
			 
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return montant;
	}
	
	public static void AjouterDepense(Depense dep) {
		int ma = 0;

		try {
			Statement st = DataBaseSI.getStatment();
			String sql = "select count(*) as maax from depense";
			ResultSet rs = st.executeQuery(sql);			
			
			while(rs.next()) {
		     
				ma = rs.getInt("maax");
			}					
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		
		try {
			/*
			 * 
			 * 
			 * CREATE TABLE Depense(
    id_depense INTEGER PRIMARY KEY,
    description_depense VARCHAR(200),
    nom_depense VARCHAR(100),
    montant_depense FLOAT
);
			 */
			

		     	Statement st = DataBaseSI.getStatment();
			    String sql = "insert into depense values ( " + ma+1 +", '" + dep.getDescription_depense() + "', '"
		     	+  dep.getNom_depense() + "', '"  + dep.getMontant_depense()
			    + "' )";
			    ResultSet rs = st.executeQuery(sql);
			   
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	

}
