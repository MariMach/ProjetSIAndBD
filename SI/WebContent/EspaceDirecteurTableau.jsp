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
  <li><a  href="EspaceDirecteurCategorie.jsp">Gestion categories et depenses</a></li>
  <li><a href="EspaceDirecteurDemande.jsp">Demandes</a></li>
      <li><a class="active" href="EspaceDirecteurTableau.jsp">Tableau de bord </a></li>
  <li><a href="deconnexion">Deconnexion</a></li>
  
</ul>

<div style="margin-left:20%;padding:50px 16px;height:1000px;">



		<form action ="Administrateur_Servlet" method = "post">

					<h1 align="center" style= "padding-bottom: 50px;color:#007BFF;"> Gestion du Budget</h1>
        <div style=" height:900px;width: 1700px; overflow:auto;" class="container" >
            <br/>
            <br/>
            <br/>
            <br/>
            
            <table border="1" cellspacing="0" bordercolor="gray"  style="vertical-align: middle;color: black ;" class="display" class="table" id="table_with_data">
            <thead style="vertical-align: middle" >

            <tr >
       				
                    <th style="background-color: #D1CECE">Structure </th>
                    <th style="background-color: #D1CECE">Depense</th>
                    <th style="background-color: #D1CECE">Categorie</th>
                    <th style="background-color: #D1CECE">Cout Categorie Globale </th>
                    
                    <th style="background-color: #D1CECE">Part Structure</th>
                       
            </tr>

                </thead>
                <tbody style="vertical-align: middle" >
	
	
	
	<%  
		ArrayList<Depense> depenses = new ArrayList<Depense>();
			depenses =  depensefunctions.getDepense();
	   	 
	    %>
	   
	
	    
	    <%  
		ArrayList<Laboratoire> laboratoires = new ArrayList<Laboratoire>();
	    laboratoires  = Laboratoiresfunctions.getallLabo();
	   	 
	    %>
	 
	    
	    <% for (Laboratoire lab : laboratoires) { %>
	    
	   			 <% for ( Depense dep :depenses) { %>
	    
	    		<%  
		ArrayList<Categorie> categories = new ArrayList<Categorie>();
			categories  =depensefunctions.getDepenseCategories(dep.getId_depense()) ;
	   	 
	    %>
	    
	     			<% for ( Categorie cat :categories) { %>
	     			
                    <tr id="<%=lab.getNom_laboratoire()%>">
                   
                    
                     <td data-target="firstName"><%=lab.getNom_laboratoire()%></td>
                      
                    
                        <td data-target="firstName"><%=dep.getNom_depense() %></td>
                         
                        
                         
                        
                        <td data-target="lastName"><%=cat.getNom_categorie()%></td>
                        <td data-target="salma"><%=cat.getMontant_categorie()%></td>
                        <td data-target="bur"><%= Laboratoiresfunctions.montantpart(lab.getId_laboratoire(),  cat) %></td>
                      
                          
                        
                          
                         
                    
                        

                    </tr>
                    <%} %>
                        		<%} %>
               
	<%} %>

                </tbody>
            </table>
                </form>
            
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





	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>
</html>>