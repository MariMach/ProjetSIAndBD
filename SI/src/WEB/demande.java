package WEB;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import DAO.demandefunctions;

/**
 * Servlet implementation class demande
 */
@WebServlet("/demande")
public class demande extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demande() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	 	HttpSession session = request.getSession(true);
		
	 	if(session.getAttribute("id_ch").toString() != null) {
	 		

		 	int id_ch = Integer.parseInt(session.getAttribute("id_ch").toString());
	    	    
	    	    
	    		String montant = request.getParameter("montant");
	    		float montant_demande = Float.parseFloat(montant);

	    		String description_demande = request.getParameter("description");
	    		
	    		String categorieoption = request.getParameter("categorie");					
	    		String strutureoption = request.getParameter("structure");					

	    		 String categorie = demandefunctions.firstWord(categorieoption);
	    		int id_categorie = Integer.parseInt(categorie);
	    		
	    		String structure = demandefunctions.firstWord(strutureoption);
	    		int id_laboratoire = Integer.parseInt(structure);

	    		demandefunctions.ajouterDemande(description_demande, id_ch, id_categorie, (float) montant_demande, id_laboratoire);
	    	    
	    		session.setAttribute("id_ch", id_ch);
                request.setAttribute("errorMessage", "L'ajout d'une nouvelle demande : Succès");
	    	    RequestDispatcher rd = request.getRequestDispatcher("EspaceChercheurDemande.jsp");
	            rd.forward(request, response);
		}else {
            response.sendRedirect("login.jsp");
		}

		
		
		

		
	
		
		
	}

}
