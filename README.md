
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
2.	Desarrollar una aplicación con tecnología JEE para gestionar una agenda telefónica en la web.
    Los usuarios pueden registrarse en la aplicación a través de un formulario de creación de cuentas.
    ![image](https://user-images.githubusercontent.com/52549697/81626532-9a01c580-93c1-11ea-8453-7e32b0bb3687.png)
![image](https://user-images.githubusercontent.com/52549697/81626712-18f6fe00-93c2-11ea-96c3-4c32983cbc11.png)
![image](https://user-images.githubusercontent.com/52549697/81626734-2b713780-93c2-11ea-8c8c-97f1c68d91d0.png)

  
  
  ![image](https://user-images.githubusercontent.com/52549697/81626886-82770c80-93c2-11ea-837b-44ab190eef77.png)


    Un usuario puede iniciar sesión usando su correo y contraseña.
    
    
    
    Una vez iniciado sesión el usuario podrá: 
         Registrar, modificar, eliminar, buscar y listar sus teléfonos
         
         
         
         
         
         Listar los números de teléfono de un usuario usando su número de cédula o correo electrónico
         
         
         
         
         Podrá llamar o enviar un correo electrónico desde el sistema usando aplicaciones externas.
         
         
         
         
         
    Patrones DAO
    
    
    
    
    
    
    
    Se debe generar una página con la experiencia e interfaz de usuario apropiada
    
    
    
    
    
    
3.	Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicación.



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



