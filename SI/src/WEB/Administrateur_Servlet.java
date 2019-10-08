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

import BEANS.*;
import DAO.*;


/**
 * Servlet implementation class Administrateur_Servlet
 */
@WebServlet("/Administrateur_Servlet")
public class Administrateur_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Administrateur_Servlet() {
        super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
			 	
			String action=request.getParameter("action");
			System.out.println(action);

			/*
		    if (action.equals("ajout")){

			String nom_ch ,prenom_ch ,etab_ch ,num_ch,email_ch,address_ch,profession_ch,sexe_ch , password, sexe;
			nom_ch = request.getParameter("nomc");
			prenom_ch = request.getParameter("prenomc");
	        etab_ch = request.getParameter("etablc");	
	        num_ch = request.getParameter("numc");
	        email_ch = request.getParameter("emailc");
	        address_ch = request.getParameter("adresse");
	        profession_ch = request.getParameter("profession");
	        sexe_ch = request.getParameter("sexe");
	        password = request.getParameter("password");
	        
	        
	


	        Chercheur ch = new Chercheur();
	        ch.setNom_ch(nom_ch);
	        ch.setPrenom_ch(prenom_ch);    
	        ch.setNum_ch(num_ch);    
	        ch.setEtab_ch(etab_ch);
	        ch.setEmail_ch(email_ch);
	        ch.setAddress_ch(address_ch);
	        ch.setProfession_ch(profession_ch);
	        ch.setSexe_ch(sexe_ch);
	        
	        
	        chercheurfunctions.AjouterChercheur(ch);
	        request.setAttribute("errorMessage", "L'ajout d'un nouveau Chercheur : Succès");
    	    RequestDispatcher rd = request.getRequestDispatcher("EspaceAdministrateurChercheur.jsp");
            rd.forward(request, response);
		    }

		    
		    */
		    if (action.equals("ajoutequipe")){
		    	
		   		Equipe eq = new Equipe();
		   		String nom_eq ,description_equipe ,etablissement_equipe ,labo_equipe, respopnsable_equipe;
		   		nom_eq = request.getParameter("nom_equipe");
		   		description_equipe = request.getParameter("description_equipe");
		   		etablissement_equipe = request.getParameter("etablissement_equipe");
		   		labo_equipe = request.getParameter("laboratoire_equipe");
		   		respopnsable_equipe = request.getParameter("responsable_equipe");
		   		
					

	    		 String idl = demandefunctions.firstWord(labo_equipe);
		    		int id_laboratoire = Integer.parseInt(idl);

		   		
		   		System.out.println(labo_equipe);
		   		eq.setNom_equipe(nom_eq);
		   		eq.setId_laboratoire(id_laboratoire);
		   		eq.setDescription_equipe(description_equipe);
		   		eq.setEtablissement_equipe(etablissement_equipe);
		   		eq.setResponsable_equipe(respopnsable_equipe);
		   		equipefunctions.AjouterEquipe(eq);
		   		
		        request.setAttribute("errorMessage", "L'ajout d'une nouvelle Equipe : Succès");
	    	    RequestDispatcher rd = request.getRequestDispatcher("EspaceAdministrateurEquipe.jsp");
	            rd.forward(request, response);
		   		
		          }
		    
	    	    
		    	if (action.equals("ajoutlaboratoire")){
		    	
				   		String nom_laboratoire ,description_laboratoire ,etablissement_laboratoire, responsable_laboratoire;
				   		
				   		nom_laboratoire = request.getParameter("nom_laboratoire");
				   		description_laboratoire = request.getParameter("description_laboratoire");
				   		etablissement_laboratoire = request.getParameter("etablissement_laboratoire");
				   		
				   		responsable_laboratoire = request.getParameter("responsable_laboratoire");
				   		
							
		
				   		String idl = demandefunctions.firstWord(responsable_laboratoire);
				    		int id_responsable = Integer.parseInt(idl);
		
				    			
				    		Laboratoiresfunctions.ajouterLaboratoire(description_laboratoire, nom_laboratoire, etablissement_laboratoire, id_responsable);
				   	
				   		
				        request.setAttribute("errorMessage", "L'ajout d'un nouveau LAboratoire : Succès");
			    	    RequestDispatcher rd = request.getRequestDispatcher("EspaceAdministrateurLaboratoire.jsp");
			            rd.forward(request, response);
		   		
		          }
	    	    
	    		
	    	    
             
	
		
		
		
		

	}
}

