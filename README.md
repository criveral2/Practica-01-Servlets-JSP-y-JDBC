
 <h1>	PRÁCTICA DE LABORATORIO </h1>

<pre>CARRERA: COMPUTACION	ASIGNATURA: PLATAFORMAS WEB
NRO. PRÁCTICA:	2	TÍTULO PRÁCTICA: Desarrollo de una aplicación JEE basado en Servlets, JSP y JDBC para el intercambio de datos en un modelo de tres capas aplicando los patrones diseño de software MVC y DAO
OBJETIVO ALCANZADO:
Aplicar un patrón de diseño DAO para el desarrollo de una aplicación denominada agenda virtual 
la cual almacenará registros telefónicos, el método aplicado permitirá una mejor organización de 
los archivos Bean y POJOs, separando la lógica de negocio de la lógica para acceder a los datos.
</pre>

<h1> ACTIVIDADES DESARROLLADAS </h1>

1.	Crear un repositorio en GitHub con el nombre “Práctica de laboratorio 01: Servlets, JSP y JDBC”
Creamos un repositorio en la herramienta github para llevar un seguimiento del proceso de construcción de la aplicacion

![image](https://user-images.githubusercontent.com/52549697/81634179-0c7ba100-93d4-11ea-824a-3067233c4c0c.png)


2.	Desarrollar una aplicación con tecnología JEE para gestionar una agenda telefónica en la web.
    Los usuarios pueden registrarse en la aplicación a través de un formulario de creación de cuentas.
    
    A continuación se presenta la interfaz que el usuario podrá visualizar en su ordenador, esta conformada por un formulario que envía los parámetros mediante internet por un método POST a la sección del controlador quien se encargara de registrarlo.
    
    ![image](https://user-images.githubusercontent.com/52549697/81626532-9a01c580-93c1-11ea-8453-7e32b0bb3687.png)
![image](https://user-images.githubusercontent.com/52549697/81626712-18f6fe00-93c2-11ea-96c3-4c32983cbc11.png)
![image](https://user-images.githubusercontent.com/52549697/81626734-2b713780-93c2-11ea-8c8c-97f1c68d91d0.png)

  
  
  ![image](https://user-images.githubusercontent.com/52549697/81626886-82770c80-93c2-11ea-837b-44ab190eef77.png)
![image](https://user-images.githubusercontent.com/52549697/81626959-a9cdd980-93c2-11ea-9318-5cdd790fa131.png)
![image](https://user-images.githubusercontent.com/52549697/81626994-beaa6d00-93c2-11ea-9409-1754db277eb3.png)

Procedemos a crear el servlet que recibirá el parámetro enviado por el formulario de registro y posteriormente a realizar la creación del nuevo usuario.

    Un usuario puede iniciar sesión usando su correo y contraseña.
    
Se presenta el código de la interfaz que el usuario visualizara para el inicio de sesión el cual nuevamente enviara un formulario.

![image](https://user-images.githubusercontent.com/52549697/81627119-18ab3280-93c3-11ea-8ee1-36ea9a389a7f.png)
![image](https://user-images.githubusercontent.com/52549697/81627219-514b0c00-93c3-11ea-8858-d998ee9981a3.png)



![image](https://user-images.githubusercontent.com/52549697/81627573-1d241b00-93c4-11ea-9afa-885be88df0ea.png)
![image](https://user-images.githubusercontent.com/52549697/81627644-3fb63400-93c4-11ea-86c5-57ccf9a4841e.png)


    
    Una vez iniciado sesión el usuario podrá: 
         Registrar, modificar, eliminar, buscar y listar sus teléfonos
         Posteriormente presentamos las funcionalidades del crud que realiza los diferentes servlets que corresponden a nuestro controlador.
         
 ![image](https://user-images.githubusercontent.com/52549697/81628678-ed2a4700-93c6-11ea-8dcc-8c22ced15732.png)
 ![image](https://user-images.githubusercontent.com/52549697/81630568-9d9a4a00-93cb-11ea-9871-fc3c99325a16.png)
 ![image](https://user-images.githubusercontent.com/52549697/81632188-4ac29180-93cf-11ea-9474-e2ac70b74eb3.png)
 
         Registrar

![image](https://user-images.githubusercontent.com/52549697/81632405-c3295280-93cf-11ea-8d29-8495092f6846.png)
![image](https://user-images.githubusercontent.com/52549697/81632436-e5bb6b80-93cf-11ea-8f78-178aed43bdba.png)
         
         Modificar, Eliminar
![image](https://user-images.githubusercontent.com/52549697/81632829-d2f56680-93d0-11ea-832f-01eb65a77a80.png)
![image](https://user-images.githubusercontent.com/52549697/81632868-ea345400-93d0-11ea-85a9-77ad18128812.png)
![image](https://user-images.githubusercontent.com/52549697/81632905-ff10e780-93d0-11ea-9ce7-feabf282968d.png)
         
         Buscar
 
 ![image](https://user-images.githubusercontent.com/52549697/81633023-4f884500-93d1-11ea-910d-558f44ad82cb.png)
![image](https://user-images.githubusercontent.com/52549697/81633057-6333ab80-93d1-11ea-89cc-94361342a83f.png)

         
         
         Listar los números de teléfono de un usuario usando su número de cédula o correo electrónico
![image](https://user-images.githubusercontent.com/52549697/81628015-21046d00-93c5-11ea-80aa-92dbc44fca31.png)
![image](https://user-images.githubusercontent.com/52549697/81628043-36799700-93c5-11ea-9087-378eae01847e.png)
    

         
         
         
         
         Podrá llamar o enviar un correo electrónico desde el sistema usando aplicaciones externas.
![image](https://user-images.githubusercontent.com/52549697/81633234-e228e400-93d1-11ea-81a8-1b040482a7cf.png)
         
         
         Filtro
         Nos permitirá controlar la sesión dependiendo si el usuario a realizado el logeo de lo contrario no podrá posicionarse en las paginas personales, las cuales necesitan de un   logeo.
         
![image](https://user-images.githubusercontent.com/52549697/81633126-9f670c00-93d1-11ea-8272-426076e57776.png)
![image](https://user-images.githubusercontent.com/52549697/81633166-b574cc80-93d1-11ea-9ff6-11282a49d8af.png)
         
         
         
    Patrones DAO
 
 ![image](https://user-images.githubusercontent.com/52549697/81633304-0d133800-93d2-11ea-996f-bac32f4f5ff9.png)

    
    
    
    
    
    
    Se debe generar una página con la experiencia e interfaz de usuario apropiada
    Se presenta la interfaz que el usuario visualizara en su navegador
    
    Index
    
 ![image](https://user-images.githubusercontent.com/52549697/81633608-c07c2c80-93d2-11ea-8dc6-9a5655fb1699.png)
![image](https://user-images.githubusercontent.com/52549697/81633723-020cd780-93d3-11ea-9b09-681e8c2a1819.png)
 ![image](https://user-images.githubusercontent.com/52549697/81633780-27014a80-93d3-11ea-8a0c-2501e8b3edf8.png) 
    
    Login

![image](https://user-images.githubusercontent.com/52549697/81633824-426c5580-93d3-11ea-96b0-fca51f8a6e34.png)



    Agenda
![image](https://user-images.githubusercontent.com/52549697/81633903-63cd4180-93d3-11ea-8b25-0231bb8bc538.png)
![image](https://user-images.githubusercontent.com/52549697/81633948-7ba4c580-93d3-11ea-89e0-ebf17407874c.png)
    
    
3.	Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicación.
A continuación se muestra los diferentes cambio que se realizaron a lo largo del desarrollo del sistema.

![image](https://user-images.githubusercontent.com/52549697/81634118-e7872e00-93d3-11ea-88d6-63d6eb0de44b.png)



<pre>
RESULTADO(S) OBTENIDO(S):
Separar por completo la lógica de negocio de la lógica para acceder a los datos.
Proporcionar al método DAO una conexión a la base de datos MySQL y lo métodos 
necesarios para insertar, actualizar, borrar y consultar la información de la 
base de datos y por otro lado diseñar los diferentes formularios e interfaces 
que ocupara la lógica de negocios.

CONCLUSIONES:
Notamos que la lógica de negocios de nuestra aplicación no se preocupa de donde 
vengan los datos ni como deben de ser guardados en la base, ya que se utilizan 
diferentes métodos que manipularan y convertirán los parámetros a valores aceptados 
por la base como valores que son utilizados internamente en la sección de lógica 
de negocios, para ello se utiliza servlets las cuales funcionan entre intermediarios 
con la sección de lógica de negocios. 

RECOMENDACIONES:
Verificar la zona oraría de la base de datos y del editor java para evitar posibles 
errores de implementación de querys.
Procurar utilizar las ultima versiones de las respectivas herramientas a utilizar 
(Editor java eclipse, base de datos Mysql), ya que estas, están corregidas y optimizadas 
a errores de versiones anteriores.

Nombre de estudiante: ___Christian Rivera__________________________
</pre>



