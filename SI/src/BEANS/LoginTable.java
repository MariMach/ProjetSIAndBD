package BEANS;

public class LoginTable {
	
	
	    private String login;
	    private String motdepasse;
	    private String logintype;
	    private String id_login;
	    
	    
		public LoginTable(String login, String motdepasse, String logintype, String id_login) {
			super();
			this.login = login;
			this.motdepasse = motdepasse;
			this.logintype = logintype;
			this.id_login = id_login;
		}
		
		public LoginTable() {
			super();
		}

		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getMotdepasse() {
			return motdepasse;
		}
		public void setMotdepasse(String motdepasse) {
			this.motdepasse = motdepasse;
		}
		public String getLogintype() {
			return logintype;
		}
		public void setLogintype(String logintype) {
			this.logintype = logintype;
		}
		public String getId_login() {
			return id_login;
		}
		public void setId_login(String id_login) {
			this.id_login = id_login;
		}
	    
	    

}
