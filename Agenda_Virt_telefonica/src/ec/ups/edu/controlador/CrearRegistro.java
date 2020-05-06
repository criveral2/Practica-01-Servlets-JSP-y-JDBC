package ec.ups.edu.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DaoFactory;
import ec.edu.ups.dao.DaoUsuario;
import ec.edu.ups.modelo.Usuario;

/**
 * Servlet implementation class CrearRegistro
 */
@WebServlet(name="CrearRegistro", urlPatterns = {"/CrearRegistro"})
public class CrearRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearRegistro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String cedula = request.getParameter("cedula");
		String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("correo");
        String contra = request.getParameter("contra");
        
        System.out.println(nombre+apellido+cedula+correo+contra);
        
        DaoFactory.getFactory().createTables();
        DaoUsuario usuarioDao = DaoFactory.getFactory().getUsuarioDAO();
        Usuario user = new Usuario(cedula, nombre, apellido, correo, contra);
        
 if (usuarioDao.create(user)) {
	 		System.out.println("Usuario Creado");
            response.sendRedirect("/Agenda_Virt_telefonica/JSPinterfaces/index.jsp");
            
            //System.out.println("nombre: "+nombre+" apellido: "+apellido+" cedula: "+cedula+" mail: "+mail+" pass: "+pass);
        }else{
            System.out.println("Usuario No Creado");
            response.sendRedirect("/Agenda_Virt_telefonica/JSPinterfaces/Registro.jsp");
        }
        
        
        
	}

}
