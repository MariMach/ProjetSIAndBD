package WEB;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.directeurfunctions;
import DAO.loginfunctions;
import DAO.responsablefunctions;

/**
 * Servlet implementation class ajoutresponsable
 */
@WebServlet("/ajoutresponsable")
public class ajoutresponsable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajoutresponsable() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		  request.setAttribute("errorMessage", "L'ajout d'un nouveau Responsable : Succes ");
        RequestDispatcher rd = request.getRequestDispatcher("EspaceAdministrateurResponsable.jsp");
        rd.forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		String nomresponsable = request.getParameter("nomresponsable");
		String prenomresponsable = request.getParameter("prenomresponsable");
		String etablissementresponsable = request.getParameter("etablissementresponsable");
		String emailresponsable = request.getParameter("emailresponsable");
		String telephoneresponsable = request.getParameter("telephoneresponsable");

		
		String adresseresponsable = request.getParameter("adresseresponsable");
		String professionresponsable = request.getParameter("professionresponsable");
		String sexeresponsable = request.getParameter("sexeresponsable");
	
/*
 * 
 *     id_responsable INTEGER PRIMARY KEY,
    nom_responsable VARCHAR(100),
    prenom_responsable VARCHAR(100),
    etab_responsable VARCHAR(100) NOT NULL,
    sexe_responsable VARCHAR(50) NOT NULL,
    num_responsable VARCHAR(100) NOT NULL,
    email_responsable VARCHAR(200) NOT NULL,
    address_responsable VARCHAR(200) NOT NULL,
    profession_responsable VARCHAR(200) NOT NULL
 */
		
		String loginresponsable = request.getParameter("loginresponsable");
		String passwordresponsable = request.getParameter("passwordresponsable");
		int i = responsablefunctions.ajouterResponsable(nomresponsable, prenomresponsable, etablissementresponsable, 
				sexeresponsable, telephoneresponsable, emailresponsable, adresseresponsable, professionresponsable);

		
			
		loginfunctions.ajoutloginb(loginresponsable, passwordresponsable, i);
	
		
	}

}
