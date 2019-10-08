package WEB;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.chercheurfunctions;
import DAO.responsablefunctions;

/**
 * Servlet implementation class chercheursupp
 */
@WebServlet("/chercheursupp")
public class chercheursupp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public chercheursupp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
        request.setAttribute("errorMessage", "Chercheur supprime");

		 RequestDispatcher rd = request.getRequestDispatcher("EspaceAdministrateurChercheur.jsp");
        rd.forward(request, response);
        
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		

		String id_chercheur = request.getParameter("id_chercheur");

		int m = Integer.parseInt(id_chercheur);
		
		
		chercheurfunctions.deletechr(m);
		chercheurfunctions.deletechrlogin(m);
		


        
        /*
         * 
         *  
                           <td  data-target="x">
                   	 <form action="responsablesupp" method="post"> 
                       <button    type="submit" class="btn btn-primary" name="id_responsable" value="<%=resp.getId_responsable()%>">
                      
                      Supprimer </button>
                    </form>
                 	</td>
                        
                  
                        
         */
        
        
		
	}

}

