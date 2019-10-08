package DAO;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import BEANS.Categorie;
import DB.DataBaseSI;

/*
 * 
 * int id_categorie, int id_depense, String description_categorie, String nom_categorie,
			Float montant_categorie)
 */

public class categoriefunctions {
	
	public static ArrayList<Categorie> getCategorie(){
		
		ArrayList<Categorie> cats = new ArrayList<Categorie>();
		
		Categorie cat = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from categorie ";
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
	
public static Categorie getCategoriebyid(int id_categorie){
		
		
		
		Categorie cat = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from categorie where id_categorie = "+id_categorie + " ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 
				 cat = new Categorie(rs.getInt("id_categorie"), rs.getInt("id_depense"), rs.getString("description_categorie"), rs.getString("nom_categorie"),
						 rs.getFloat("montant_categorie"));
				 
				 
				 
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cat;
	}


public static void AjouterCategorie(Categorie cat) {
	int ma = 0;

	try {
		Statement st = DataBaseSI.getStatment();
		String sql = "select count(*) as maax from categorie";
		ResultSet rs = st.executeQuery(sql);			
		
		while(rs.next()) {
	     
			ma = rs.getInt("maax");
		}					
	} catch (Exception e) {
		e.printStackTrace();
	}	
	
	
	try {

	     	Statement st = DataBaseSI.getStatment();
		    String sql = "insert into categorie values ( " + ma+1 +", '" + cat.getDescription_categorie() + "', '"
	     	+  cat.getNom_categorie() + "', '"  + cat.getId_depense()+"', '" +cat.getMontant_categorie()
		    + "' )";
		    ResultSet rs = st.executeQuery(sql);
		   
		} catch (Exception e) {
			e.printStackTrace();
		}
}
	
//   			categoriefunctions.ajoutermontant(int idlaboratoireint, int idchercheurint, int idcategorieint, float montantfloat);


/*
 * 
 * 
 * id_categorie INTEGER,
    id_laboratoire INTEGER,
    montant_affecte FLOAT,
    montant_restant FLOAT, 
 */

public static void ajoutermontant(int idlaboratoireint, int idchercheurint, int idcategorieint, float montantfloat) {

	try {

	     	Statement st = DataBaseSI.getStatment();
		    String sql = "insert into designerBudgetChercheur values ( " +  idcategorieint + ", "
	     	+  idlaboratoireint + ", "  + idchercheurint +", " + montantfloat  + " , 0)";
		    ResultSet rs = st.executeQuery(sql);
		   
		} catch (Exception e) {
			e.printStackTrace();
		}
}


public static Float getmontantcatch(int idlaboratoireint, int idchercheurint, int idcategorieint) {
	float ma = 0;
	try {

	     	Statement st = DataBaseSI.getStatment();
		    String sql = "select montant_affecte from designerBudgetChercheur where id_categorie =" + idcategorieint + "and id_laboratoire  = " + idlaboratoireint +
		    		"and id_chercheur = " + idchercheurint + " ";
		    ResultSet rs = st.executeQuery(sql);
		    
		    while(rs.next()) {
			     
				ma = rs.getInt("montant_affecte");
			}
		   
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return ma;
}

	public static Float getmontantcatchrest(int idlaboratoireint, int idchercheurint, int idcategorieint) {
		float ma = 0;
		try {
	
		     	Statement st = DataBaseSI.getStatment();
			    String sql = "select montant_restant from designerBudgetChercheur where id_categorie =" + idcategorieint + "and id_laboratoire  = " + idlaboratoireint +
			    		"and id_chercheur = " + idchercheurint + " ";
			    ResultSet rs = st.executeQuery(sql);
			    
			    while(rs.next()) {
				     
					ma = rs.getInt("montant_restant");
				}
			   
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return ma;
	}

	
	

}
