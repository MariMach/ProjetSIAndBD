package WEB;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.categoriefunctions;
import DAO.demandefunctions;

/**
 * Servlet implementation class servletmontant
 */
@WebServlet("/servletmontant")
public class servletmontant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletmontant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		

		String action=request.getParameter("action");
		System.out.println(action);
		
		if (action.equals("confirm")){
			
			
			String idcategorie = request.getParameter("idcategorie");
			String montant = request.getParameter("montant");
			String idchercheur = request.getParameter("idchercheur");
			String idlaboratoire = request.getParameter("idlaboratoire");

			 String idl = demandefunctions.firstWord(idcategorie);
	    		int idcategorieint = Integer.parseInt(idl);
			
			int idlaboratoireint = Integer.parseInt(idlaboratoire);
			int idchercheurint = Integer.parseInt(idchercheur);
			float montantfloat = Float.parseFloat(montant);

			
			System.out.println(idchercheurint + " " + idlaboratoireint + " "+ montantfloat + " " + idcategorieint);
			
			categoriefunctions.ajoutermontant(idlaboratoireint,  idchercheurint,  idcategorieint,  montantfloat);
			

			 RequestDispatcher rd = request.getRequestDispatcher("EspaceResponsableLaboratoire.jsp");
	         rd.forward(request, response);


		}

		
		
		
	}

}
