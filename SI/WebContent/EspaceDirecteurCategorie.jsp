<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%@ page import="BEANS.*"%>
            <%@ page import="java.util.ArrayList" %>
         
<%@ page import="DAO.*"%>

<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<link rel="stylesheet" href="csslogin.css" />

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="csssidebar.css" /> 
	
		<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mladen Ruzicic">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

	
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
    <link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/stylish-portfolio.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
    <link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet">
    
	<title>Menu</title>
</head>
<body>

<ul>


<li>
 <div class="imgcontainer">
      <img style="width:30%;border-radius:1000px;" src="http://nephrologie.conference2web.com/assets/avatar-bd4e1ae71589eb46f179d8831c4671f0.png" alt="Avatar" class="avatar">
 </div>
    <h5 class="text-center">Directeur</h5>
</li>

  <li><a  href="EspaceDirecteur.jsp">Bienvenue</a></li>
  <li><a  href="EspaceDirecteurCentre.jsp">Centre</a></li>
  <li><a class="active" href="EspaceDirecteurCategorie.jsp">Gestion categories et depenses</a></li>
  <li><a href="EspaceDirecteurDemande.jsp">Demandes</a></li>
      <li><a  href="EspaceDirecteurTableau.jsp">Tableau de bord </a></li>
  <li><a href="deconnexion">Deconnexion</a></li>
  
</ul>

<div style="margin-left:20%;padding:20px 16px;height:1000px;">
																							  <h4  class="text-center">${errorMessage}</h4>
										
	
	
	    <div class = "container" style = "padding-bottom: 20px ;padding-top:100px ; padding-left: 100px ; padding-right: 100px">
    <h1 align="center" style= "padding-bottom: 50px; color:#007BFF;"> Inserer le Montant du Centre</h1>
    
    <form action = "Directeur_Servlet" method = "post">
      <div class="form-group">
    <label for="inputAddress"> Montant </label>
    <input type="number" class="form-control"  name = "montantcentre" placeholder="">
  </div>

  <button name = "action"  value="montantcentre" type="submit" class="btn btn-primary"> Inserer </button>
  </form>
  
  
  </div>									
										
										

  
    <div class = "container" style = "padding-bottom: 50px ;padding-top:100px ; padding-left: 100px ; padding-right: 100px">
    <h1 align="center" style= "padding-bottom: 50px; color:#007BFF;"> Ajouter une Dépense</h1>
    
    <form action = "Directeur_Servlet" method = "post">
      <div class="form-group">
    <label for="inputAddress"> Nom Depense </label>
    <input type="text" class="form-control"  name = "nom_depense" placeholder="">
  </div>
    
    
    <div class="form-group">
    <label for="inputAddress"> description Dépense </label>
    <input type="text" class="form-control"  name="description_depense" placeholder="">
    </div>
   <div class="form-group">
    <label for=""> montant Dépense </label>
    <input type="number" class="form-control" name="montant_depense" placeholder="">
    </div>

  <button name = "action"  value="ajoutdepense" type="submit" class="btn btn-primary"> Ajouter Dépense </button>
  </form>
  
  
  </div>
    
    
    <div class = "container" style = "padding-bottom: 20px ;padding-top:100px ; padding-left: 100px ; padding-right: 100px">
    <h1 align="center" style= "padding-bottom: 50px; color:#007BFF;"> Ajouter une Catégorie </h1>
    
    
    
    <form action = "Directeur_Servlet" method = "post">

      <div class="form-group">
    <label for="inputAddress"> Nom Categorie </label>
    <input type="text" class="form-control"  name = "nom_categorie" placeholder="">
  </div>
    
    
  <div class="form-group">
    <label for="inputAddress"> Description Catégorie </label>
    <input type="text" class="form-control"  name="description_categorie" placeholder="">
  </div>
  
   <div class="form-group">
    <label for=""> montant Catégorie </label>
    <input type="number" class="form-control" name="montant_categorie" placeholder="">
  </div>
  <div class="form-group">
   <label class="control-label">Depense :</label>
   <select  class="form-control" name="depense_id">
        <option value="0">choisir </option>
                                  <% 
	
		ArrayList<Depense> depense = depensefunctions.getDepense();
	   	 
	    %>
	    <% for (Depense dep : depense) { %>
                                        <option> <%=dep.getId_depense()%> :
                                            <%=dep.getNom_depense()%>
                                        </option>
                                       	<%} %>

  </select>
    </div>
  <button name = "action" value="ajoutcategorie" type="submit" class="btn btn-primary"> Ajouter Catégorie </button>
</form>



	</div>
	
	
			
			    <div class = "container" style = "padding-bottom: 20px ;padding-top:100px ; padding-left: 100px ; padding-right: 100px">
		
		
						<h2 class="mb-0">Depenses</h2>
		<table class="table table-bordered">
		  <thead>
		    <tr class="table-secondary">
		      <th scope="col">Nature des depenses</th>
		      <th scope="col">Categorie de depenses</th>
		      <th scope="col">Montant Depense</th>
		     <th scope="col">Montant Categorie</th>
		    </tr>
		  </thead>
		  
		  <tbody>
		  
		 <% ArrayList<Depense> depenses = depensefunctions.getDepense(); %>   
		  
		<%for (Depense dep : depenses)  { %>
		   
		    <tr>
		      <th scope="row" >Depense : <%=dep.getNom_depense() %></th>
		      <% ArrayList<Categorie> categories = depensefunctions.getDepenseCategories(dep.getId_depense()); %>   
		           <%for (Categorie cat : categories)  { %>  
		          
					          <tr>
					          			<th scope="row" ></th>
					          			
									      <td class="table-info"><%=cat.getNom_categorie() %></td>
									      
									      
									      <td ><%=dep.getMontant_depense() %></td>
									      
									    
									      
									      <td ><%=cat.getMontant_categorie() %></td>
									      
									     		 <%} %>
					     </tr>
		   
		    </tr>
		    
		  <%} %>

		  </tbody>
		</table>
		
		
		
</div>
</div>
	
	
	
	
	
	
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>
</html>