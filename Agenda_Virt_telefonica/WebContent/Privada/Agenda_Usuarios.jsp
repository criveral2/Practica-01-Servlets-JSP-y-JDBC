<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
	
<link rel="stylesheet"
	href="/Agenda_Virt_telefonica/CSS/estilos-agenda.css">
	 
	
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  
  
  <script src='https://kit.fontawesome.com/a076d05399.js'></script>
  
  
  
<title>Agenda Telefonica</title>
</head>
<body>
<c:set var = "usuario" value = "${requestScope['usuario']}" />

	<div class="container">
	
		<div class="page-header text-right">
		
		
		<button class="btn btn-dark" type="button"><a class="nav-link"  href="/Agenda_Virt_telefonica/Listar" >Regresar</a></button>
		
		
		</div>
		
		<div class="page-header p-3 text-center">
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark justify-content-center">
				<!-- Brand/logo -->
				<a class="navbar-brand"  href="#"> <img class="rounded" src="/Agenda_Virt_telefonica/img/logo.png" alt="logo"
					style="width: 60px;">
				</a>
				<h1>Registro De Numeros</h1>
				
					
	  				

			</nav>
		</div>
		
	</div>
	
	<!-- ------------------------------------------------------------------------------------------------- -->
	<div>





<c:choose>
<c:when test="${usuario.telefono.size() > 0 }">
<!--  <p> ${usuario}</p>-->
<div>
<h3 class="ui top attached header">
  Agenda
</h3>
<div class="ui attached segment">
  
<table class="table table-striped table-responsive-md btn-table">

<thead>
  <tr>
    <th>#</th>
    <th>Numero</th>
    <th>Tipo</th>
    <th>Operadora</th>
    <th>Opciones</th>
  </tr>
</thead>

<tbody>

<c:set var = "i" value = "${0}" />

<c:forEach var="telefono" items="${usuario.telefono}">
<c:set var = "i" value = "${i+1}" />


  <tr>
    <th scope="row">${i}</th>
   
    <td>${telefono.numero}</td>
    <td>${telefono.tipo}</td>
    <td>${telefono.operadora}</td>
    <td>
   
     
   
    </td>
    
  </tr>
 
  
</c:forEach>
  
</tbody>



</table>
</div>

</div>

</c:when>
</c:choose>

</div>
	
	<!-- -------------------------------------------------------------------------------------------------- -->
	

	
	<div class="container">
	 <table class="table table-striped">
   
      <tr>
        <th class="text-center"><h1>Informacion </h1>
             <p>
      Cedula:  ${usuario.cedula}
      </p>
      <p>
      Nombre: ${usuario.nombre} ${usuario.apellido}
      </p>
       <p>
      Correo: ${usuario.correo}
      </p>
        <p>  <button class="btn btn-dark" type="button"><a class="nav-link"  href="mailto:${usuario.cedula}"  >Enviar E-mail</a></button></p>  </th>
        <th class="text-center"><img class="rounded" src="/Agenda_Virt_telefonica/img/usuario.png" alt="usuario"style="width: 230px;"></th>
      
      </tr>
  	</table>
	</div>
	
	
<!--------------------------------------------- Footer ------------------------------------------------------------------------->
<footer class="page-footer font-small stylish-color-dark pt-4">

  <!-- Footer Links -->
  <div class="text-center text-md-left bg-dark text-primary">

    <!-- Grid row -->
    <div class="row">

      <!-- Grid column -->
      <div class="col-md-4 mx-auto">

        <!-- Content -->
        <h5 class="font-weight-bold text-uppercase mt-3 mb-4">Agenda Virtual</h5>
        <p>Somos una empresa que ayuda a personas que por diferentes motivos no tienen el tiempo necesario de tener una organizacion adecuada de sus contactos por lo que 
         en esta aplicacion emos desarrollado un ambiente amigable e iterativo para que usted como usuario tenga la mejor experiencia 
         y despreocupacion de poder obtener y manipulas informacion de sus contactos.</p>

      </div>
      <!-- Grid column -->

      <hr class="clearfix w-100 d-md-none">

      <!-- Grid column -->
      <div class="col-md-2 mx-auto">

        <!-- Links -->
        <h5 class="font-weight-bold text-uppercase mt-3 mb-4">Informacion</h5>

        <ul class="list-unstyled">
          <li>
          <h6>Desarrollado por :</h6>
           <p>Christian Rivera</p>
          </li>
          <li>
           <h6>Mas informacion:</h6>
           <p>criveral2@est.ups.edu.ec</p>
          </li>
          <li>
             <h6>Direccion :</h6>
           <p>Av.Americas y calle vieja </p>
          </li>
          <li>
           
          </li>
        </ul>

      </div>
      <!-- Grid column -->

      <hr class="clearfix w-100 d-md-none">

     

  </div>
  <!-- Footer Links -->



  <!-- Social buttons -->
  <ul class="list-unstyled list-inline text-center">
    <li class="list-inline-item">
      <a class="btn-floating btn-fb mx-1">
        <i class="fab fa-facebook-f"> </i>
      </a>
    </li>
    <li class="list-inline-item">
      <a class="btn-floating btn-tw mx-1">
        <i class="fab fa-twitter"> </i>
      </a>
    </li>
    <li class="list-inline-item">
      <a class="btn-floating btn-gplus mx-1">
        <i class="fab fa-google-plus-g"> </i>
      </a>
    </li>
    <li class="list-inline-item">
      <a class="btn-floating btn-li mx-1">
        <i class="fab fa-linkedin-in"> </i>
      </a>
    </li>
    <li class="list-inline-item">
      <a class="btn-floating btn-dribbble mx-1">
        <i class="fab fa-dribbble"> </i>
      </a>
    </li>
  </ul>
  <!-- Social buttons -->

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3"> Todos los derechos reservados © 2020 Copyright:
    
  </div>
  <!-- Copyright -->

</footer>
<!-- Footer -->


























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