<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="BEANS.*"%>
<%@ page import="DAO.chercheurfunctions"%>
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



   <li><a class="active" href="EspaceChercheur.jsp">Bienvenue</a></li>
  <li><a  href="EspaceChercheurEquipe.jsp">Equipes</a></li>
  <li><a href="EspaceChercheurLaboratoire.jsp">Laboratoires</a></li>
  <li><a  href="EspaceChercheurDemande.jsp">Demande</a></li>
  <li><a href="EspaceChercheurHistorique.jsp">Historique des demandes</a></li>
    <li><a href="EspaceChercheurTableau.jsp">Tableau de bord</a></li>
  <li><a href="deconnexion">Deconnexion</a></li>
  
</ul>

<div style="margin-left:20%;padding:50px 16px;height:1000px;">

	<div class="container">
	      <div class="row">
	
	        <div class="col-lg-offset-4 col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad" >
	   
	   
	          <div class="panel panel-info">
	            <div class="panel-heading">
	              <h2 class="panel-title" style="font-size: 20px ;"><b>Informations personnelles</b></h2>
	            </div>
	            <div class="panel-body">
	              <div class="row">
	
	

						<% Chercheur ch = (Chercheur) session.getAttribute("ch"); %>
					
	
	                <div class=" col-md-9 col-lg-9 "> 
	                  <table class="table table-user-information">
	                    <tbody>
	                    	
	                	
		            	<tr>
	                        <td style="font-size: 14px ;"><b>Nom : </b></td>
	                        <td style="font-size: 14px ;">${ch.getNom_ch()}</td>
	                      </tr>
	                      
	                      <tr>
	                        <td style="font-size: 14px ;"><b>Prenom : </b></td>
	                        <td style="font-size: 14px ;">${ch.getPrenom_ch()}</td>
	                      </tr>
	                   
	                       <tr>
			                     <td style="font-size: 14px ;"><b>Etablissement : </b></td>
			                     <td style="font-size: 14px ;">${ch.getEtab_ch()}</td>
	                     </tr>
	                   	  
	                         <tr>
	                        <td style="font-size: 14px ;"><b>Profession : </b></td>
	                        <td style="font-size: 14px ;">${ch.getProfession_ch()}</td>
	                      </tr>
	                      
	                        <tr>
	                        <td style="font-size: 14px ;"><b>Sexe : </b></td>
	                        <td style="font-size: 14px ;">${ch.getSexe_ch()}</td>
	                      </tr>
	                      
	                      <tr>
			                     <td style="font-size: 14px ;"><b>Adresse : </b></td>
			                     <td style="font-size: 14px ;">${ch.getAddress_ch()}</td>
	                     </tr>
	                      
	                      <tr>
	                        <td style="font-size: 14px ;"><b>Email : </b></td>
	                        <td style="font-size: 14px ;">${ch.getEmail_ch()}</td>
	                      </tr>
	                      
	                      <tr>
	                        <td style="font-size: 14px ;"><b>Telephone : </b></td>
	                        <td style="font-size: 14px ;">${ch.getNum_ch()}<br></td>    
	                      </tr>
	
	                     
	                     
	                    </tbody>
	                  </table>
	                </div>
	              </div>
	            </div>
	                 <div class="panel-footer">
	                  <a href="#" class="btn btn-primary">Modifier</a> 
	          </div>
	            
	          </div>
	        </div>
	      </div>
	    </div>
	</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    

</body>
</html>