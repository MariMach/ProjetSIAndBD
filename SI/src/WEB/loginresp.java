package WEB;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import BEANS.Administrateur;
import BEANS.Chercheur;
import BEANS.Directeur;
import BEANS.Equipe;

import BEANS.Responsable;
import DAO.administrateurfunctions;
import DAO.chercheurfunctions;
import DAO.directeurfunctions;
import DAO.loginfunctions;
import DAO.responsablefunctions;




/**
 * Servlet implementation class login
 */
@WebServlet("/loginresp")
public class loginresp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginresp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String unamme = request.getParameter("uname");
			String pssw = request.getParameter("psw");
			String optradios[] = request.getParameterValues("optradio");
			
			for(String s : optradios) {
				if(s.equals("a")) {
					
					  if((loginfunctions.getchercheurlogin(unamme)).equals(unamme)){
					    	
					    	if((loginfunctions.getmotdepassechercheur(unamme)).equals(pssw)) {
					    		
					    		int id_ch = loginfunctions.getIdChercheur(unamme);	
					    		Chercheur ch = new Chercheur();
								ch =  chercheurfunctions.getChercheur(id_ch);
					    	    HttpSession ssession = request.getSession(true);
					    	    
					    	   
					    	    ssession.setAttribute("id_ch", id_ch);
					    	    
					    	    ssession.setAttribute("ch", ch);
					    	    
					    	    RequestDispatcher rd = request.getRequestDispatcher("EspaceChercheur.jsp");
				                rd.forward(request, response);	   
				                
				                
				                
					    	}else {
				                request.setAttribute("errorMessage", "Mot de passe du chercheur est incorrect");
				                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				                rd.forward(request, response);
					    	}
				    	
				    	}  else {
			    			request.setAttribute("errorMessage", "Nom d'utilisateur du chercheur est incorrect");
				            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				            rd.forward(request, response);
			    		}
					
				}else if(s.equals("b")){
					
					if((loginfunctions.getresponsablelogin(unamme)).equals(unamme)) {
						
				    	if((loginfunctions.getmotdepasse(unamme)).equals(pssw)) {
				    		int id_responsable = loginfunctions.getIdresponsable(unamme);
				    		
				    	    HttpSession ssession = request.getSession(true);
				    	    Responsable responsable =  responsablefunctions.getResponsable(id_responsable);
				    	    
				    	    ;
				    	    
				    	   
				    	    ssession.setAttribute("id_responsable", id_responsable);
				    	    
				    	    ssession.setAttribute("responsable", responsable);
				    	    
				    	    ssession.setAttribute("responsable", responsable);
				    	    RequestDispatcher rd = request.getRequestDispatcher("EspaceResponsable.jsp");
			                rd.forward(request, response);	    	
			                
				    	}else {
			                request.setAttribute("errorMessage", "Mot de passe du responsable est incorrect");
			                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			                rd.forward(request, response);
				    	}
				    	
				    } else {
		    			request.setAttribute("errorMessage", "Nom d'utilisateur du responsable est incorrect");
			            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			            rd.forward(request, response);
		    		}
					
				}else if(s.equals("c")){
					
					 if((loginfunctions.getdirecteurlogin(unamme)).equals(unamme)) {
					    	
					    	if((loginfunctions.getmotdepassedirecteur(unamme)).equals(pssw)) {
					    		int id_directeur= loginfunctions.getIdDirecteur(unamme);
					    		
					    		Directeur dir = new Directeur();
								dir =  directeurfunctions.getDirecteur(id_directeur);
					    		
					    	    HttpSession ssession = request.getSession();
					    	    ssession.setAttribute("dir", dir);
					    	    
					    	    RequestDispatcher rd = request.getRequestDispatcher("EspaceDirecteur.jsp");
				                rd.forward(request, response);	    	
				                
					    	}else {
				                request.setAttribute("errorMessage", "Mot de passe du directeur est incorrect");
				                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				                rd.forward(request, response);
					    	}
		    		
		    		} else {
		    			request.setAttribute("errorMessage", "Nom d'utilisateur du directeur est incorrect");
			            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			            rd.forward(request, response);
		    		}
					
				}else if(s.equals("d")){
					
					 if((loginfunctions.getadministrateurlogin(unamme)).equals(unamme)) {
					    	
					    	if((loginfunctions.getmotdepasseadministrateur(unamme)).equals(pssw)) {
					    		int id_administrateur = loginfunctions.getIdAdministrateur(unamme);

					    		Administrateur admin = new Administrateur();
								admin =  administrateurfunctions.getAdministrateur(id_administrateur);
					    	    HttpSession ssession = request.getSession();
					    	    ssession.setAttribute("admin", admin);
					    	    RequestDispatcher rd = request.getRequestDispatcher("EspaceAdministrateur.jsp");
				                rd.forward(request, response);	    	
				                
					    	}else {
				                request.setAttribute("errorMessage", "Mot de passe de l'Administrateur est incorrect");
				                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				                rd.forward(request, response);
					    	}
		    		
		    		} else {
		    			request.setAttribute("errorMessage", "Nom d'utilisateur de l'Administrateur est incorrect");
			            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			            rd.forward(request, response);
		    		}
				}
			}
	    
	}
}
