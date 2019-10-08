package WEB;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEANS.Demande;
import DAO.demandefunctions;

/**
 * Servlet implementation class servletmodifier
 */
@WebServlet("/servletmodifier")
public class servletmodifier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletmodifier() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 RequestDispatcher rd = request.getRequestDispatcher("EspaceDirecteurDemande.jsp");
         rd.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		String action=request.getParameter("action");
		System.out.println(action);
		
		if (action.equals("acceptee")){
			
			
			String iddeamnde = request.getParameter("iddeamnde");
			int id_demande = Integer.parseInt(iddeamnde);
			
			System.out.println(iddeamnde);
			
			demandefunctions.modifierEtatDemande(id_demande, "acceptee");
			
			Demande demande = null;
			demande = demandefunctions.getdemandebyId(id_demande);
			
			demandefunctions.demandeaccepte(demande.getId_laboratoire(), demande.getId_chercheur(), demande.getId_categorie(), demande.getMontant_demande());



		}
		
		
		if (action.equals("refusee")){

			
			String iddeamnde = request.getParameter("iddeamnde");
			int id_demande = Integer.parseInt(iddeamnde);
			
			System.out.println(iddeamnde);


			demandefunctions.modifierEtatDemande(id_demande, "refusee");


		}
	}

}
