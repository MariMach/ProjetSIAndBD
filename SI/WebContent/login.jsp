<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet" href="csslogin.css" />

<title>Insert title here</title>
</head>
<body>

<div>
  
  <form class="modal-content animate" action="loginresp" method="post">  
    <div class="imgcontainer">
      <img src="http://nephrologie.conference2web.com/assets/avatar-bd4e1ae71589eb46f179d8831c4671f0.png" alt="Avatar" class="avatar">
      <h4  class="text-center">${errorMessage}</h4>
    </div>
    
    <div class="container">
    
		     <div class="form-check-inline">
		      <label class="form-check-label" for="chercheur1">
		        <input type="radio" class="form-check-input" id="chercheur1" name="optradio" value="a" checked>Chercheur
		      </label>
		    </div>
		    
		    <div class="form-check-inline">
		      <label class="form-check-label" for="responsable1">
		        <input type="radio" class="form-check-input" id="responsable1" name="optradio" value="b">Responsable
		      </label>
		    </div>
		    
		        <div class="form-check-inline">
		      <label class="form-check-label" for="directeur1">
		        <input type="radio" class="form-check-input" id="directeur1" name="optradio" value="c">Directeur
		      </label>
		    </div>  
		    
		     <div class="form-check-inline">
		      <label class="form-check-label" for="administrateur1">
		        <input type="radio" class="form-check-input" id="administrateur1" name="optradio" value="d">Administrateur
		      </label>
		    </div> 
    
	</div>
	
	
    <div class="container">
      <label for="uname"><b>Nom d'utilisateur</b></label>
      <input type="text" placeholder="Enter Username" name="uname" required>

      <label for="psw"><b>Mot de passe</b></label>
      <input type="password" placeholder="Enter Password" name="psw" required>
        
      <button type="submit" class="btn btn-info">Login</button>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
    </div>
    

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
      <span class="psw">Forgot <a href="#">password?</a></span>
    </div>
  </form>
</div>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  
</body>
</html>