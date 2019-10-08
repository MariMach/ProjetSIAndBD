<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="BEANS.*"%>
<%@ page import="DAO.*"%>
            <%@ page import="java.util.ArrayList" %>

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
    	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    
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
    <h5 class="text-center">Responsable</h5>
</li>

  <li><a href="EspaceResponsable.jsp">Bienvenue</a></li>
  <li><a class="active" href="EspaceResponsableLaboratoire.jsp">Laboratoire</a></li>
  <li><a href="EspaceResponsableDemandes.jsp">Demandes</a></li>
  <li><a href="deconnexion">Deconnexion</a></li>
  
</ul>

<div style="margin-left:20%;padding:50px 16px;height:1000px;">

					                    	<% Responsable resp = (Responsable) session.getAttribute("responsable");	%>
					                    	<% Laboratoire lab = Laboratoiresfunctions.getLaboratoireResponsable(resp.getId_responsable()); %>
					                    	
					                    	
					                    	
					                    	
 <div class="accordion" id="accordionExample">
	    	
		
		  <div class="card">
		    <div class="card-header" id="headingOne">
		      <h2 class="mb-0">
		        <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
		          <%=lab.getNom_laboratoire() %>
		        </button>
		      </h2>
		    </div>
		
		    <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
		      <div class="card-body">
		      
		      
		      	                <div class=" col-md-9 col-lg-9 "> 
	                  <table class="table table-user-information">
	                    <tbody>
	                    	
	                	
		            	<tr>
	                        <td style="font-size: 14px ;"><b>Description Laboratoire: </b></td>
	                        <td style="font-size: 14px ;"><%=lab.getDescription_laboratoire()%></td>
	                      </tr>
	                  
	                   
	                       <tr>
			                     <td style="font-size: 14px ;"><b>Etablissement Laboratoire: </b></td>
			                     <td style="font-size: 14px ;"><%=lab.getEtablissement_laboratoire()%></td>
	                     </tr>
	                      
	                      
	                      <tr>
	                        <td style="font-size: 14px ;"><b>Equipes : </b></td>
	                        <td style="font-size: 14px ;">
	                        <%  ArrayList<Equipe> equipes= Laboratoiresfunctions.getLaboratoireEquipes(lab.getId_laboratoire());%>
	                       <%for(Equipe eq : equipes) { %>
	                       			
	                        		<p> <%=eq.getNom_equipe() %> </p>
	                        		
							<% } %>
							</td>
	                      </tr>
	                     
	                      <tr>
	                        <td style="font-size: 14px ;"><b>Membres : </b></td>
	                        <td style="font-size: 14px ;">
	                        <%  ArrayList<Chercheur> chs= Laboratoiresfunctions.getLaboratoireMembres(lab.getId_laboratoire()); %>
	                       <%for(Chercheur ch : chs) { %>
	                       			
	                        		<p> 
	                        		
	                        		
								<div class="container">
								  <!-- Button to Open the Modal -->
								  
								  <div class="col-md-4 text-center"> 
								  <button type="submit" class="btn btn-primary btn-sm center-block" data-toggle="modal" data-target="#myModal" >
								    <%=ch.getNom_ch() %>  <%=ch.getPrenom_ch() %> 
								  </button>
							</div>
								  <!-- The Modal -->
								  <div class="modal" id="myModal">
								    <div class="modal-dialog">
								      <div class="modal-content">
								      
								        <!-- Modal Header -->
								        <div class="modal-header">
								          <h4 class="modal-title"> Definir Montant par Categorie</h4>
								          <button type="button" class="close" data-dismiss="modal">&times;</button>
								        </div>
								        
								        <!-- Modal body -->
								        <div class="modal-body">
								        
								        
								        
 <form action="servletmontant"  method="post">
  
 <div class="form-group">
                     	
         <select class="form-control" id="inputPassword3"name="idcategorie"  type="number">
        <option selected>Choisir...</option>
        
       <%  ArrayList<Categorie> categories = new ArrayList<Categorie>();
                                  categories = categoriefunctions.getCategorie();
	   	 
	    %>
	    <% for (Categorie cat : categories) { %>
        
      
         
        <option><%=cat.getId_categorie() %> <%=cat.getDescription_categorie() %></option>
        
         <% } %>
      </select>
       
                                                           <input type="hidden" name="idlaboratoire" value="<%=lab.getId_laboratoire() %>" />
                                                           <input type="hidden" name="idchercheur" value="<%=ch.getId_ch() %>" />
      
      </div>
    
                                     
                   <input type="number" class="form-control"  name="montant" placeholder="Montant" >
                   
                   
              <button type="submit" name="action" value = "confirm"class="btn btn-primary"> Confirmer </button>
            
  
 
 
								        
								        
								        </form>
								        
								        
								        </div>
								        
								       
								        
								      </div>
								    </div>
								  </div>
								  
								</div>
	                        		
	                        		</p>
	                        		
	                        		
	                        		
	                        		
	                        		
	                        		
	                        		
							<% } %>
							</td>
	                      </tr>
	                      
	                      <tr>
			                     <td style="font-size: 14px ;"><b>Nombre des chercheurs permanents : </b></td>
			                     <td style="font-size: 14px ;"><%=Laboratoiresfunctions.getLaboratoireMembresPermanent(lab.getId_laboratoire())%></td>
	                     </tr>
	                     
	                     
	
	                     
	                     
	                    </tbody>
	                  </table>
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
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  	
	
</body>
</html>