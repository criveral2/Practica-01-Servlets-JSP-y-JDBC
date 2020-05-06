<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/Agenda_Virt_telefonica/CSS/estilos.css">
<title>Registro</title>
</head>
<body>

	<div class="container">
		<div class="row justify-content-center pt-3 mt-3 mr-1">
			<div class="col-md-6 formulario">
				<form method="POST" action="/Agenda_Virt_telefonica/CrearRegistro">

					<div class="form-group text-center pt-3">
						<h1 class="text-light">FORMULARIO DE REGISTRO</h1>
					</div>
					<div class="form-group mx-sm-4 pt-1 ">
						<H6>Ingrese su numero de cedula :</H6>
						<input type="text" class="form-control"
							placeholder="Ingrese su cedula aqui" name="cedula" required>
					</div>
					<div class="form-group mx-sm-4 pt-1">
						<H6>Ingrese su Nombre :</H6>
						<input type="text" class="form-control"
							placeholder="Ingrese un Nombre aqui" name="nombre" required>
					</div>
					<div class="form-group mx-sm-4 pt-1">
						<H6>Ingrese su Apellido :</H6>
						<input type="text" class="form-control"
							placeholder="Ingrese un Apellido aqui" name="apellido" required>
					</div>
					<div class="form-group mx-sm-4 pt-1">
						<H6>Ingrese un Correo Electronico :</H6>
						<input type="text" class="form-control"
							placeholder="Ingrese un Correo aqui" name="correo" required>
					</div>
					<div class="form-group mx-sm-4 pt-1">
						<H6>Cree una contraseña :</H6>
						<input type="text" class="form-control"
							placeholder="Agregar Contraseña aqui" name="contra" required>
					</div>
					<div class="form-group mx-sm-4 pb-2">
						<input type="submit" class=" btn  btn-block ingresar"
							value="REGISTRARSE">
					</div>
					
					<div class="form-group mx-sm-4 pb-2">
							<a class="nav-link " href="/Agenda_Virt_telefonica/JSPinterfaces/index.jsp">REGRESAR</a>
					</div>
				
					
				</form>
				
				
			</div>
		</div>


	</div>
















	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>


</body>
</html>