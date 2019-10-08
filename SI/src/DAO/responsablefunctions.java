package DAO;


import java.sql.ResultSet;
import java.sql.Statement;

import BEANS.Responsable;
import DB.DataBaseSI;


/*
 * 
 *     id_responsable INTEGER PRIMARY KEY,
    nom_responsable VARCHAR(100),
    prenom_responsable VARCHAR(100),
    id_laboratoire INTEGER,
    etab_responsable VARCHAR(100) NOT NULL,
    sexe_responsable VARCHAR(50) NOT NULL,
    num_responsable VARCHAR(100) NOT NULL,
    email_responsable VARCHAR(200) NOT NULL,
    address_responsable VARCHAR(200) NOT NULL,
    profession_responsable VARCHAR(200) NOT NULL
 */

public class responsablefunctions {
	
	public static Responsable getResponsable(int id_responsable) {
		Responsable resp = null;
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select * from responsable where id_responsable =  "+ id_responsable +" ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				resp = new Responsable(
				 rs.getInt("id_responsable"), rs.getString("nom_responsable"), rs.getString("prenom_responsable"), 
						 rs.getString("etab_responsable"), rs.getString("sexe_responsable"),
						 rs.getString("num_responsable"), rs.getString("email_responsable"), rs.getString("address_responsable"), 
						 rs.getString("profession_responsable"));
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return resp;
	}
	
	
	// 		responsablefunctions.deleteresp(id_responsableint);
	
	
	
	public static void deleteresp(int id_responsable) {
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "delete from responsable where id_responsable =  "+ id_responsable +" ";
			ResultSet rs = st.executeQuery(sql);
			
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	//  deleteresplogin
	
	public static void deleteresplogin(int id_responsable) {
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "delete from LoginTable where id_login =  "+ id_responsable +" and  logintype = 'b'";
			ResultSet rs = st.executeQuery(sql);
			
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	/*
	 * 

	 */
	
	public static int ajouterResponsable(String nomresponsable, String prenomresponsable, String etablissementresponsable, String
	sexeresponsable, String telephoneresponsable, String emailresponsable, String adresseresponsable,String  professionresponsable) {
		
		int nresponsable = 0;
	
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select count(*) as maax from laboratoire";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				nresponsable = rs.getInt("maax");
			}	
			st.close();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	try {			
			Statement stt = DataBaseSI.getStatment();
			/*
				 * INSERT INTO Responsable( id_responsable, nom_responsable, prenom_responsable,etab_responsable,
				 * sexe_responsable,num_responsable, email_responsable,address_responsable,profession_responsable)


			 */
			nresponsable = nresponsable + 1;

			String sql = "insert into responsable values(" + nresponsable + ", '" + nomresponsable + "',  '" 
			+ prenomresponsable + "',  '" + etablissementresponsable + "', '" + sexeresponsable +"',  '"+   telephoneresponsable  +"',  '" + emailresponsable +  "',  '" + adresseresponsable +
			 "',  '" + professionresponsable +"' )";
			
			ResultSet rss = stt.executeQuery(sql);	

			stt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return nresponsable;
	}
	

	
	

}
