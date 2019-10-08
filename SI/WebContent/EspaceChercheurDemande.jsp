<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page import="java.util.ArrayList" %>
      <%@ page import="BEANS.*"%>
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

    <!-- Custom CSS -->
    <link href="css/stylish-portfolio.min.css" rel="stylesheet">
	<title>Menu</title>
</head>
<body>

<ul>


<li>
 <div class="imgcontainer">
      <img style="width:30%;border-radius:1000px;" src="http://nephrologie.conference2web.com/assets/avatar-bd4e1ae71589eb46f179d8831c4671f0.png" alt="Avatar" class="avatar">
 </div>
    <h5 class="text-center">Chercheur</h5>
</li>



  <li><a  href="EspaceChercheur.jsp">Bienvenue</a></li>
  <li><a  href="EspaceChercheurEquipe.jsp">Equipes</a></li>
  <li><a href="EspaceChercheurLaboratoire.jsp">Laboratoires</a></li>
  <li><a class="active" href="EspaceChercheurDemande.jsp">Demande</a></li>
  <li><a href="EspaceChercheurHistorique.jsp">Historique des demandes</a></li>
    <li><a href="EspaceChercheurTableau.jsp">Tableau de bord</a></li>
  <li><a href="deconnexion">Deconnexion</a></li>
  
</ul>

<body>

<div style="margin-left:20%;padding:70px 16px;height:1000px;">
		      <h4  class="text-center">${errorMessage}</h4>
		



	  <form  action="demande" method="post">  
	  
	  		<% int id_ch = Integer.parseInt(session.getAttribute("id_ch").toString()); %>
	  		


  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Montant </label>
    <div class="col-sm-8">
      <input type="number" class="form-control" id="inputEmail3" placeholder="Montant" name="montant">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Description Demande :</label>
    <div class="col-sm-8">
      <input type="text"class="form-control" id="inputPassword3" placeholder="Description" name="description">
    </div>
  </div>
 
  <div class="form-group row">
      <label for="inputPassword3" class="col-sm-2 col-form-label">Catégorie : </label>
          <div class="col-sm-8" class="form-control" >
      
      <%  ArrayList<Categorie> cats = categoriefunctions.getCategorie(); %>
      
      <select class="form-control" id="inputPassword3" name="categorie" type="number">
        <option selected>Choisir...</option>
        
         <% for(Categorie cat : cats) { %>
         
        <option><%=cat.getId_categorie() %> Depense : <%=depensefunctions.getDepensebyId(cat.getId_depense()) %>  Catgorie : <%=cat.getNom_categorie() %></option>
        
         <% } %>
      </select>
      
      
      </div>
    </div>
    
      <div class="form-group row">
      <label for="inputPassword3" class="col-sm-2 col-form-label">Nom Structure : </label>
          
          <div class="col-sm-8" class="form-control" >
      <%  ArrayList<Laboratoire> labs = Laboratoiresfunctions.getLaboratoireChercheurs(id_ch);%>
      
      <select class="form-control" id="inputPassword3" name="structure" type="number">
        <option selected>Choisir...</option>
        
         <% for(Laboratoire lab : labs) { %>
         
        <option><%=lab.getId_laboratoire()%> :: <%=lab.getNom_laboratoire()%> </option>
        
         <% } %>
      </select>
      
      
      </div>
    </div>
 
    
  <div class="form-group row"> 
  			      <label for="inputPassword3" class="col-sm-2 col-form-label"></label>   
  	 	 <div class="col-sm-8 text-center"><button type="submit" class="btn btn-primary">Ajouter</button> </div>
  </div>
  
  
</form>


</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
</body>
</html>