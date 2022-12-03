<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css">
</head>
<body>

	<h2>${errormsg}</h2>
	<div class="Login-form">
	<form> method="post" </form>
	<input type="text" name="userId" class="form-control" placeholder="User ID">
	<input type="password" name="password" class="form-control" placeholder="Password"> 
	<button>
	login
	</button>
	
	</div>
   



</body>
</html>