package ec.ups.edu.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DaoFactory;
import ec.edu.ups.dao.DaoTelefono;
import ec.edu.ups.dao.DaoUsuario;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;

/**
 * Servlet implementation class ActualizarT
 */
@WebServlet("/ActualizarT")
public class ActualizarT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarT() {
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
		
		System.out.println("llegue al servlet actualizar");
		
		String actualid= request.getParameter("actualid");
		String usuarioo= request.getParameter("cedula");
		
		System.out.println(actualid);
		System.out.println(String.valueOf(usuarioo));
	
		 DaoUsuario userDao = DaoFactory.getFactory().getUsuarioDAO();
		 Usuario user = userDao.findById(String.valueOf(usuarioo));
		 
		 System.out.println(user.toString());
		 
		 Telefono tel = new Telefono();
		 tel.setCodigo(Integer.parseInt(actualid));
		 tel.setNumero(request.getParameter("numero"));
		 tel.setOperadora(request.getParameter("operadora"));
		 tel.setTipo(request.getParameter("tipo"));
		 tel.setUsuario(user);
		 
		 System.out.println(tel.toString());
		 
		 DaoTelefono telefono = DaoFactory.getFactory().getTelefonoDAO();
		 telefono.update(tel);
		 
		 response.sendRedirect("/Agenda_Virt_telefonica/Listar");
		
		
		System.out.println("llego siiii"+ actualid);
		System.out.println("llego siiii"+ usuarioo);
		
	}

}
