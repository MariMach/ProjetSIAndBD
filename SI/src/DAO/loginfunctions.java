package DAO;


import java.sql.*;

import BEANS.Chercheur;
import DB.DataBaseSI;

public class loginfunctions {
	
	
	/* logintype
	chercheur a
	responsable b
	directeur c
	administrateur d 
	*/
	
	public static String getresponsablelogin(String username){
		String mat = "";
		try {
			Statement st = DataBaseSI.getStatment();
			String sql = "select login from loginTable where login = '" + username + "' and logintype = 'b'";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 mat=rs.getString("login");
			}
			st.close();
		} catch (Exception e) {
			System.out.println(e + " not found");
		}
		return mat;
	}
	
	public static String getmotdepasse(String username) {
		String pass= "";
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select motdepasse from loginTable where login='" + username + "'  and logintype = 'b'";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 pass=rs.getString("motdepasse");
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return pass;
	}
	
	public static int getIdresponsable(String username) {
		int id_responsable = 0;
		
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select id_login from loginTable where login='" + username + "' and logintype = 'b'";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				id_responsable = rs.getInt("id_login");
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		return id_responsable;
	}

	
	public static String getchercheurlogin(String username){
		String mat = "";
		try {
			Statement st = DataBaseSI.getStatment();
			String sql = "select login from loginTable where login = '" + username + "'  and logintype = 'a'";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 mat=rs.getString("login");
			}
			st.close();
		} catch (Exception e) {
			System.out.println(e + " not found");
		}
		return mat;
	}
	
	public static String getmotdepassechercheur(String username) {
		String pass="";
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select motdepasse from loginTable where login='" + username + "'  and logintype = 'a' ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 pass=rs.getString("motdepasse");
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return pass;
	}
	
	public static int getIdChercheur(String username) {
		int id_ch = 0;
		
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select id_login from logintable where login='" + username + "' and logintype = 'a' ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				id_ch = rs.getInt("id_login");
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		return id_ch;
	}
	
	public static String getdirecteurlogin(String username){
		String mat = "";
		try {
			Statement st = DataBaseSI.getStatment();
			String sql = "select login from logintable where login = '" + username + "'  and logintype = 'c'";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 mat=rs.getString("login");
			}
			st.close();
		} catch (Exception e) {
			System.out.println(e + " not found");
		}
		return mat;
	}
	
	public static String getmotdepassedirecteur(String username) {
		String pass="";
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select motdepasse from logintable where login='" + username + "' and logintype = 'c' ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 pass=rs.getString("motdepasse");
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return pass;
	}
	
	public static int getIdDirecteur(String username) {
		int id_directeur = 0;
		
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select id_login from logintable where login='" + username + "' and logintype = 'c' ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				id_directeur = rs.getInt("id_login");
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		return id_directeur;
	}
	
	
	public static String getadministrateurlogin(String username){
		String mat = "";
		try {
			Statement st = DataBaseSI.getStatment();
			String sql = "select login from loginTable where login = '" + username + "' and logintype = 'd' ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 mat=rs.getString("login");
			}
			st.close();
		} catch (Exception e) {
			System.out.println(e + " not found");
		}
		return mat;
	}
	
	public static String getmotdepasseadministrateur(String username) {
		String pass= "";
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select motdepasse from loginTable where login='" + username + "' and logintype = 'd' ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				 pass=rs.getString("motdepasse");
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return pass;
	}
	
	
	public static int getIdAdministrateur(String username) {
		int id_administrateur = 0;
		
		try {
			
			Statement st = DataBaseSI.getStatment();
			String sql = "select id_login from logintable where login='" + username + "' and logintype = 'd' ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				id_administrateur = rs.getInt("id_login");
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		return id_administrateur;
	}
	
	
	
	//loginfunctions.ajoutloginc(logindirecteur, passworddirecteur, id_login);
	
	public static void ajoutloginc(String logindirecteur, String passworddirecteur) {
		
		try {
			
		     	Statement st = DataBaseSI.getStatment();
			    String sql = "insert into logintable values ( '" + logindirecteur + "', '" +  passworddirecteur + "',  'a', 1)";
			    ResultSet rs = st.executeQuery(sql);
			   
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	public static void ajoutloginb(String loginresponsable, String passwordresponsable, int id_responsable) {
		
		try {
			
		     	Statement st = DataBaseSI.getStatment();
			    String sql = "insert into logintable values ( '" + loginresponsable + "', '" +  passwordresponsable + "',  'b',  "  + id_responsable + " )";
			    ResultSet rs = st.executeQuery(sql);
			   
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	public static void ajoutlogina(String loginchercheur, String passwordchercheur, int id_chercheur) {
		
		try {
			
		     	Statement st = DataBaseSI.getStatment();
			    String sql = "insert into logintable values ( '" + loginchercheur + "', '" +  passwordchercheur + "',  'b',  "  + id_chercheur + " )";
			    ResultSet rs = st.executeQuery(sql);
			   
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	
	
	
}
