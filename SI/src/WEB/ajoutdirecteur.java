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

/**
 * Servlet implementation class ajoutdirecteur
 */
@WebServlet("/ajoutdirecteur")
public class ajoutdirecteur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajoutdirecteur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String nomdirecteur = request.getParameter("nomdirecteur");
		String prenomdirecteur = request.getParameter("prenomdirecteur");
		String nomcentre = request.getParameter("nomcentre");
		String descriptioncentre = request.getParameter("descriptioncentre");
		String montantcentre = request.getParameter("montantcentre");
		float montantcentrefloat = Float.parseFloat(montantcentre);
		
		String etablissementdirecteur = request.getParameter("etablissementdirecteur");
		String emaildirecteur = request.getParameter("emaildirecteur");
		String telephonedirecteur = request.getParameter("telephonedirecteur");
		String adressedirecteur = request.getParameter("adressedirecteur");
		String professiondirecteur = request.getParameter("professiondirecteur");
		String sexedirecteur = request.getParameter("sexedirecteur");

		
		String logindirecteur = request.getParameter("logindirecteur");
		String passworddirecteur = request.getParameter("passworddirecteur");
		
			
		directeurfunctions.ajouterDirecteur(nomdirecteur, prenomdirecteur, nomcentre, descriptioncentre, montantcentrefloat, etablissementdirecteur, sexedirecteur, telephonedirecteur, emaildirecteur, adressedirecteur, professiondirecteur);
		loginfunctions.ajoutloginc(logindirecteur, passworddirecteur);
		
		
		  request.setAttribute("errorMessage", "L'ajout du Directeur : Succes (Vous avez écrasé l'ancien directeur)");
          RequestDispatcher rd = request.getRequestDispatcher("EspaceAdministrateurDirecteur.jsp");
          rd.forward(request, response);

		
		
		
	}

}
