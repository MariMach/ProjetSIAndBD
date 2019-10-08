package WEB;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEANS.Chercheur;
import DAO.chercheurfunctions;
import DAO.loginfunctions;

/**
 * Servlet implementation class ajoutchercheur
 */
@WebServlet("/ajoutchercheur")
public class ajoutchercheur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajoutchercheur() {
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
		
		/*
		 * 
		 * 
		 *     id_ch INTEGER PRIMARY KEY,
    nom_ch VARCHAR(100) NOT NULL,
    prenom_ch VARCHAR(100) NOT NULL,
    etab_ch VARCHAR(100) NOT NULL,
    num_ch VARCHAR(100) NOT NULL, 
    email_ch VARCHAR(200) NOT NULL,
    address_ch VARCHAR(200) NOT NULL,
    profession_ch VARCHAR(200) NOT NULL,
    sexe_ch VARCHAR(50) NOT NULL
		 */
		
		String nomc = request.getParameter("nomc");
		String prenomc = request.getParameter("prenomc");
		String etablc = request.getParameter("etablc");
		String numc = request.getParameter("numc");
		String emailc = request.getParameter("emailc");
		
		String adressec = request.getParameter("adressec");
		String professionc = request.getParameter("professionc");
		
		
		String loginchercheur = request.getParameter("loginchercheur");
		String passwordchercheur = request.getParameter("passwordchercheur");
		
		String sexec = request.getParameter("sexec");
		

        Chercheur ch = new Chercheur();
        ch.setEtab_ch(etablc);
        ch.setNom_ch(nomc);
        ch.setPrenom_ch(prenomc);    
        ch.setNum_ch(numc);    
        ch.setEmail_ch(emailc);
        ch.setAddress_ch(adressec);
        ch.setProfession_ch(professionc);
        ch.setSexe_ch(sexec);
        
        
        chercheurfunctions.AjouterChercheur(ch);
        
       loginfunctions.ajoutlogina(loginchercheur, passwordchercheur, ch.getId_ch());
		
		
		  request.setAttribute("errorMessage", "L'ajout d'un nouveau chercheur : Succes");
          RequestDispatcher rd = request.getRequestDispatcher("EspaceAdministrateurChercheur.jsp");
          rd.forward(request, response);

        
	}

}
