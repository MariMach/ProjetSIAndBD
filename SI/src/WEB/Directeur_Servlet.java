package WEB;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEANS.Categorie;
import BEANS.Depense;
import DAO.categoriefunctions;
import DAO.demandefunctions;
import DAO.depensefunctions;
import DAO.directeurfunctions;

/**
 * Servlet implementation class Directeur_Servlet
 */
@WebServlet("/Directeur_Servlet")
public class Directeur_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String errms = " ";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Directeur_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        		request.setAttribute("errorMessage", errms);

	      RequestDispatcher rd = request.getRequestDispatcher("EspaceDirecteurCategorie.jsp");
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
		
		if (action.equals("ajoutdepense")){


			String description_depense ,nom_depense ,montant_depense;
			description_depense = request.getParameter("description_depense");
			nom_depense = request.getParameter("nom_depense");
			montant_depense = request.getParameter("montant_depense");	
			
			float i =  Float.parseFloat(montant_depense);
	     
	        
	        


	        Depense dep = new Depense();
	        dep.setDescription_depense(description_depense);
	        dep.setMontant_depense(i);
	        dep.setNom_depense(nom_depense);
	        
	        
	        
	        depensefunctions.AjouterDepense(dep);
	        
             errms = "L'ajout d'une nouvelle Depense : Succès";

	  
   
		}
		
		
		if (action.equals("ajoutcategorie")){

						String description_categorie ,nom_categorie ,montant_categorie,id_depense;
						
						description_categorie = request.getParameter("description_categorie");
						nom_categorie = request.getParameter("nom_categorie");
						montant_categorie = request.getParameter("montant_categorie");	
						id_depense =request.getParameter("depense_id");
						

			    		 String idl = demandefunctions.firstWord(id_depense);
				    		int iddepense = Integer.parseInt(idl);
						
						float i =  Float.parseFloat(montant_categorie);


				        Categorie cat = new Categorie();
			   	        cat.setDescription_categorie(description_categorie);
                        cat.setNom_categorie(nom_categorie);
                        
                        cat.setMontant_categorie(i);
                        cat.setId_depense(iddepense);
                        categoriefunctions.AjouterCategorie(cat);
                          errms = "L'ajout d'une nouvelle Categorie : Succès";
                        
            	       
			    
					}
		
// montantcentre
		
		
		if (action.equals("montantcentre")){

			String montantcentre;
			
			montantcentre = request.getParameter("montantcentre");
			
			
			float i =  Float.parseFloat(montantcentre);
			
			directeurfunctions.ajoutmontant(i);

              errms = "L'ajout du Montant Centre : Succès";
            
	       
    
		}
					
		
	}

}
