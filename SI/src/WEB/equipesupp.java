package WEB;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.equipefunctions;

/**
 * Servlet implementation class equipesupp
 */
@WebServlet("/equipesupp")
public class equipesupp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public equipesupp() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setAttribute("errorMessage", "Equipe supprime");

		 RequestDispatcher rd = request.getRequestDispatcher("EspaceAdministrateurEquipe.jsp");
       rd.forward(request, response);
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		String id_equipe = request.getParameter("id_equipe");

		int m = Integer.parseInt(id_equipe);
		
		
		equipefunctions.deleteeq(m);
	
        
        
	}

}
