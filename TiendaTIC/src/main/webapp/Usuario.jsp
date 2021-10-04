<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<title>Tienda TIC</title>
</head>
<body>
<h1> BIENVENIDO A TIENDATIC</h1>
<form action="Usuario" method="get"> 
Usuario:
<input type="text" name= "Usuario" size= "20" maxlength ="50"/><br>
<p></p>
Clave:
<input type="password" name= "Clave" size= "10" maxlength ="50/"> <br>
<p></p>          
<input type="submit" id="botonEntrar" name="botonEntrar" value= "ENTRAR"/>
<input type="submit" id="botonCancelar" name="botonCancelar" value="CANCELAR"/>
<input type="reset" id="botonBorrar" Value="BORRAR"/>

     
</form>
   

</body>
</html>