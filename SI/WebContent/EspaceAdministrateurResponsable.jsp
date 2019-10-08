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
    <h5 class="text-center">Administrateur</h5>
</li>



  <li><a  href="EspaceAdmnistrateur.jsp">Bienvenue</a></li>
  <li><a  href="EspaceAdministrateurDirecteur.jsp">Gestion Directeur</a></li>
  <li><a class="active" href="EspaceAdministrateurResponsable.jsp">Gestion Responsables</a></li>
    <li><a   href="EspaceAdministrateurChercheur.jsp">Gestion Chercheurs</a></li>
  <li><a href="EspaceAdministrateurLaboratoire.jsp">Gestion laboratoires</a></li>
  <li><a href="EspaceAdministrateurEquipe.jsp">Gestion Equipes</a></li>
  <li><a href="deconnexion">Deconnexion</a></li>
  



</ul>

<div style="margin-left:20%;padding:50px 16px;height:1000px;">
									      <h4  class="text-center">${errorMessage}</h4>
							

	
	   
	   
				<div class="container">
					  <h1 align="center" style= "padding-bottom: 50px; color:#007BFF;"> Ajouter un Responsable</h1>
					     
				<form  action = "ajoutresponsable" method="post">
				
				
				  <div class="form-row">
				    <div class="form-group col-md-6">
				      <label for="inputEmail4">Nom Responsable</label>
				      <input type="text" class="form-control" name= "nomresponsable" placeholder="Nom">
				    </div>
				    <div class="form-group col-md-6">
				      <label for="inputPassword4">Prenom Responsable </label>
				      <input type="text" class="form-control" name= "prenomresponsable" placeholder="Prenom">
				    </div>
				  </div>
				
				  <div class="form-row">
				   <div class="form-group col-md-6">
				    <label for="inputAddress2">Etablissement</label>
				    <input type="text" class="form-control" name = "etablissementresponsable"placeholder="">
				  </div>
				  <div class="form-group col-md-6">
				    <label for="inputAddress2">Email Directeur</label>
				    <input type="text" class="form-control" name= "emailresponsable" placeholder="xxxx@xxx.xx">
				  </div>
				    </div>
				  
				    <div class="form-row">
				   <div class="form-group col-md-6">
				    <label for="inputAddress2">Telephone </label>
				    <input type="text" class="form-control" name="telephoneresponsable" placeholder="">
				  </div>
				  
				    <div class="form-group col-md-6">
				    <label for="inputAddress2">Adresse  </label>
				    <input type="text" class="form-control" name="adresseresponsable" placeholder="">
				  </div>
				    </div>
				  
				    <div class="form-row">
				    <div class="form-group col-md-6">
				    <label for="inputAddress2">Profession </label>
				    <input type="text" class="form-control" name="professionresponsable" placeholder="">
				  </div>
				  
				    <div class="form-group col-md-6">
				    <label for="inputAddress2">Login</label>
				    <input type="text" class="form-control" name="loginresponsable" placeholder="">
				  </div>
				    </div>
				  
				  
				    <div class="form-row">
				    <div class="form-group col-md-6">
				    <label for="inputAddress2">Mot de passe</label>
				    <input type="text" class="form-control" name="passwordresponsable" placeholder="*******">
				  </div>
				  
				  <div class="form-group col-md-6">
				    <label for="inputAddress2">Sexe</label>
				   <select  class="form-control"  name ="sexeresponsable"> 
				   <option value="femme">Femme </option>
				   <option value="homme">Homme</option>
				   </select>
				  </div>
				    </div>
				    
				  
				  <button type="submit" class="btn btn-primary"> Ajouter </button>
				</form>
				
				
	
             <br/>
            <br/>
        
        
        


					<h1 align="center" style= "padding-bottom: 50px;color:#007BFF;"> Gestion des Responsables</h1>
        <div style=" height:400px;width: 1700px; overflow:auto;" class="container" >
            <br/>
            <br/>
            <br/>
            <br/>
            
            <table border="1" cellspacing="0" bordercolor="gray"  style="vertical-align: middle;color: black ;" class="display" class="table" id="table_with_data">
            <thead style="vertical-align: middle" >

            <tr >
       				
                    <th style="background-color: #D1CECE">Nom Responsable</th>
                    <th style="background-color: #D1CECE">Prenom Responsable</th>
                    <th style="background-color: #D1CECE">Etablissement </th>
                    <th style="background-color: #D1CECE">Telephone </th>
                    
                    <th style="background-color: #D1CECE">Email</th>
                    <th style="background-color: #D1CECE">Profession</th>
                    <th style="background-color: #D1CECE">Sexe</th>
                    <th style="background-color: #D1CECE">Adresse</th>
                    <th style="background-color: #D1CECE">supprimer</th>
                    
                    
            </tr>

                </thead>
                <tbody style="vertical-align: middle" >
	<% 
	
		ArrayList<Responsable> responsables = new ArrayList<Responsable>();
			responsables = Laboratoiresfunctions.getallResponsables();
	   	 
	    %>
	    <% for (Responsable resp : responsables) { %>
                    <tr id="<%=resp.getId_responsable()%>">
                        <td data-target="firstName"><%=resp.getNom_responsable()%></td>
                        <td data-target="lastName"><%=resp.getPrenom_responsable()%></td>
                        <td data-target="salma"><%=resp.getEtab_responsable()%></td>
                        <td data-target="bur"><%=resp.getNum_responsable()%></td>
                        <td data-target="nom_division"><%=resp.getEmail_responsable()%></td>
                        <td data-target="nom_service"><%=resp.getProfession_responsable()%></td>
                         <td data-target="nom_service"><%=resp.getSexe_responsable()%></td>
                          <td data-target="nom_service"><%=resp.getAddress_responsable()%></td>
                          
                          
                           <td  data-target="x">
                   	 <form action="responsablesupp" method="post"> 
                       <button    type="submit" class="btn btn-primary" name="id_responsable" value="<%=resp.getId_responsable()%>">
                      
                      Supprimer </button>
                    </form>
                 	</td>
                        
                  
                        
                          
                         
                    
                        

                    </tr>
               
	<%} %>

                </tbody>
            </table>
            
        </div>



    <!-- Modal -->

    <script>
        var modalConfirm = function(callback){

            $("#btn-confirm").on("click", function(){
                $("#mi-modal").modal('show');
            });

            $("#modal-btn-si").on("click", function(){
                callback(true);
                $("#mi-modal").modal('hide');
            });

            $("#modal-btn-no").on("click", function(){
                callback(false);
                $("#mi-modal").modal('hide');
            });
        };

        modalConfirm(function(confirm){
            if(confirm){
                //Acciones si el usuario confirma
                $("#result").html("confirmé");
            }else{
                //Acciones si el usuario no confirma
                $("#result").html("NO confirmé");
            }
        });
    </script>




    <script src='//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.10.8/jquery.tablesorter.min.js'></script>
    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.10.8/jquery.tablesorter.widgets.min.js'></script>
    <script>
        $(document).ready( function () {
            $('#table').DataTable();
        } );
        $('table').tablesorter({
            theme: 'bootstrap',
            headerTemplate: '{content}{icon}',
            widgets: ['zebra', 'uitheme', 'filter'],

            textExtraction: {
                0: function(node) {
                    // convert hex to decimal
                    return parseInt($(node).attr('data-id'), 16);
                },
                2: function(node) {
                    // convert unicode hex to decimal
                    return parseInt($(node).text().replace(/&#x/, ''), 16);
                }
            }
        });
    </script>




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