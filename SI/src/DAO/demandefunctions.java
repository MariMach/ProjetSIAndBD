package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import BEANS.Categorie;
import BEANS.Demande;
import DB.DataBaseSI;

public class demandefunctions {
	
	/*
	 * int id_demande, String description_demande, int id_chercheur, int id_categorie, Date date_demande,
			String etat_demande, Float montant_demande)
	 */
	
	public static int ajouterDemande(String description_demande, int id_chercheur, int id_categorie, float montant_demande, int id_laboratoire) {
				
		int ndemande = 0;
		String etat_demande="en cours";
		
		Date date_demande = new Date();
		String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date_demande);
		
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select count(*) as maax from demande";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 ndemande = rs.getInt("maax");
			}	
			st.close();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	try {			
			Statement stt = DataBaseSI.getStatment();
			ndemande = ndemande + 1;
			String sql = "insert into demande values(" + ndemande + ", '" + description_demande + "',  " + id_chercheur + ", " + 
			 id_categorie + ", '"+ modifiedDate + "',  '" + etat_demande + "',  " + montant_demande + "," + id_laboratoire +")";
			
			ResultSet rss = stt.executeQuery(sql);			
			stt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return ndemande;
	}
	
	
	
	
	public static String firstWord(String input) {
	    String result = input;  // if no space found later, input is the first word

	    for(int i = 0; i < input.length(); i++)
	    {
	        if(input.charAt(i) == ' ')
	        {
	            result = input.substring(0, i);
	            break;
	        }
	    }

	    return result; 
	}
	
	/*
	 * 
	 * int id_demande, String description_demande, int id_chercheur, int id_categorie, Date date_demande,
			String etat_demande, Float montant_demande, int id_laboratoire
	 */
	

	
	
	public static ArrayList<Demande> historiquesDemandes(int id_chercheur, int id_laboratoire, int id_categorie){
		ArrayList<Demande> demandes = new ArrayList<Demande>();
		
		Demande dem = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from demande where id_chercheur = "+ id_chercheur + " and id_laboratoire =  " + id_laboratoire + " and id_categorie = " + id_categorie + " ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 
				 dem = new Demande(rs.getInt("id_demande"), rs.getString("description_demande"), rs.getInt("id_chercheur"),  rs.getInt("id_categorie"),
						 rs.getString("date_demande"), rs.getString("etat_demande"),
						 rs.getFloat("montant_demande"), rs.getInt("id_laboratoire"));
				 
				 demandes.add(dem);
				 
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return demandes;
	}
	
	public static ArrayList<Demande> historiquesDemande(int id_chercheur){
		ArrayList<Demande> demandes = new ArrayList<Demande>();
		
		Demande dem = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from demande where id_chercheur = "+ id_chercheur + " ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 
				 dem = new Demande(rs.getInt("id_demande"), rs.getString("description_demande"), rs.getInt("id_chercheur"),  rs.getInt("id_categorie"),
						 rs.getString("date_demande"), rs.getString("etat_demande"),
						 rs.getFloat("montant_demande"), rs.getInt("id_laboratoire"));
				 
				 demandes.add(dem);
				 
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return demandes;
	}
	
	
	public static ArrayList<Demande> historiquesDemandeLaboratoire(int id_laboratoire){
		ArrayList<Demande> demandes = new ArrayList<Demande>();
		
		Demande dem = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from demande where id_laboratoire = "+ id_laboratoire + " ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 
				 dem = new Demande(rs.getInt("id_demande"), rs.getString("description_demande"), rs.getInt("id_chercheur"),  rs.getInt("id_categorie"),
						 rs.getString("date_demande"), rs.getString("etat_demande"),
						 rs.getFloat("montant_demande"), rs.getInt("id_laboratoire"));
				 
				 demandes.add(dem);
				 
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return demandes;
	}
	
	

	
	
	public static ArrayList<Demande> historiquesDemandes(){
		ArrayList<Demande> demandes = new ArrayList<Demande>();
		
		Demande dem = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from demande";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 
				 dem = new Demande(rs.getInt("id_demande"), rs.getString("description_demande"), rs.getInt("id_chercheur"),  rs.getInt("id_categorie"),
						 rs.getString("date_demande"), rs.getString("etat_demande"),
						 rs.getFloat("montant_demande"), rs.getInt("id_laboratoire"));
				 
				 demandes.add(dem);
				 
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return demandes;
	}
	
	
	public static float montantdepenseCH (int id_chercheur, int id_laboratoire, int id_categorie){
		
		float dem = 0;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from demande where id_chercheur = "+ id_chercheur + " and id_laboratoire =  " + id_laboratoire + " and id_categorie = " + 
			id_categorie + " and etat_demande = 'acceptee' ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 
				 dem = dem + rs.getFloat("montant_demande");
		 
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dem;
	}
	
	//
	
	public static void modifierEtatDemande(int id_demande, String newEtat) {
		
try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "UPDATE demande SET etat_demande = '" + newEtat + "'	WHERE id_demande = " + id_demande + " ";
			ResultSet rs = st.executeQuery(sql);
		
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void demandeaccepte(int idlaboratoireint, int idchercheurint, int idcategorieint, float montant_demande) {
		float montex = 0; 
		try {

	     	Statement st = DataBaseSI.getStatment();
		    String sql = "select  montant_restant from designerBudgetChercheur where id_categorie =" + idcategorieint + "and id_laboratoire  = " + idlaboratoireint +
		    		"and id_chercheur = " + idchercheurint + " ";
		    ResultSet rs = st.executeQuery(sql);
		    
		    while(rs.next()) {
			     
		    	montex = rs.getInt("montant_restant");
			}
		   
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		montex = montex - montant_demande;
		
		try {

		     	Statement st = DataBaseSI.getStatment();
			    String sql = "update designerBudgetChercheur set montant_restant =" + montex +"  where id_categorie =" + idcategorieint + "and id_laboratoire  = " + idlaboratoireint +
			    		"and id_chercheur = " + idchercheurint + " ";
			    ResultSet rs = st.executeQuery(sql);
	   
			} catch (Exception e) {
				e.printStackTrace();
			}
	
	}
	
	// 			demande = demandefunctions.getdemandebyId(id_demande);
	
	
	public static Demande getdemandebyId(int id_demande){
		
		Demande dem = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from demande where id_demande = "+ id_demande + " ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 
				 dem = new Demande(rs.getInt("id_demande"), rs.getString("description_demande"), rs.getInt("id_chercheur"),  rs.getInt("id_categorie"),
						 rs.getString("date_demande"), rs.getString("etat_demande"),
						 rs.getFloat("montant_demande"), rs.getInt("id_laboratoire"));
				 				 
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dem;
	}

	

}
