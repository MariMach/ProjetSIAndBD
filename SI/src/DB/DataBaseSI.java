package DB;

import java.sql.*;

import DAO.loginfunctions;


public class DataBaseSI {
	
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:siworkspace";
	public static final String USER = "c##meriem";
	public static final String PASSWORD = "123456789";
	public static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
	
	public static Statement getStatment() throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER_CLASS);
		Statement ps;
		Connection dbcon=(Connection) DriverManager.getConnection(URL, USER, PASSWORD);
		ps=dbcon.createStatement();
		return ps;
    }
	
	public static void main(String[] args) {
		loginfunctions.getresponsablelogin("ahmed1234");
		loginfunctions.getmotdepasse("ahmed1234");
	}
	
}
	 
