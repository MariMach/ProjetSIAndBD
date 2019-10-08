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
  <li><a href="EspaceChercheurEquipe.jsp">Equipes</a></li>
  <li><a href="EspaceChercheurLaboratoire.jsp">Laboratoires</a></li>
  <li><a href="EspaceChercheurDemande.jsp">Demande</a></li>
  <li><a class="active" href="EspaceChercheurHistorique.jsp">Historique des demandes</a></li>
    <li><a href="EspaceChercheurTableau.jsp">Tableau de bord</a></li>
  <li><a href="deconnexion">Deconnexion</a></li>
</ul>

<body>

<div style="margin-left:20%;padding:50px 16px;height:1000px;">


 <div style=" height:600px;width: 1700px; overflow:auto;"class="container" >
            <br/>
            <br/>
            <br/>
            <br/>
            
            <table border="1" cellspacing="0" bordercolor="gray"  style="vertical-align: middle;color: black ;" class="display" class="table" id="table_with_data">
            <thead style="vertical-align: middle" >

            <tr >
       				
                    <th style="background-color: #D1CECE">Description Demande</th>
                    <th style="background-color: #D1CECE">Etat Demande</th>
                    <th style="background-color: #D1CECE">Nom Laboratoire</th>
                    <th style="background-color: #D1CECE">Date Demande </th>
                    
                    <th style="background-color: #D1CECE">Categorie</th>
                    <th style="background-color: #D1CECE">Montant Demande</th>
           
                    
                    
            </tr>

                </thead>
                <tbody style="vertical-align: middle" >
                <%
		int id_ch = Integer.parseInt(session.getAttribute("id_ch").toString());
		%>
	<% 
	
		ArrayList<Demande> demandes = new ArrayList<>();
			demandes =  demandefunctions.historiquesDemande(id_ch);
	   	 
	    %>
	    <% for (Demande dem : demandes) { %>
	    
                    <tr>
                    	<td data-target="firstName" > <%=dem.getDescription_demande()%></td>
                        <td data-target="firstName"><%=dem.getEtat_demande()%></td>
                        <td data-target="lastName"><%=Laboratoiresfunctions.getLaboratoire(dem.getId_laboratoire()).getNom_laboratoire() %></td>
                        <td data-target="salma"><%=dem.getDate_demande()%></td>
                           <td data-target="bur"><%=categoriefunctions.getCategoriebyid(dem.getId_categorie()).getDescription_categorie()%></td>
                        <td data-target="bur"><%=dem.getMontant_demande()%></td>
                        
                
             
                        

                    </tr>
               
	<%} %>

                </tbody>
            </table>
        </div>
    </div>
    </form>



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


</body>
</html>