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
 * Servlet implementation class BuscarUsu
 */
@WebServlet("/BuscarUsu")
public class BuscarUsu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarUsu() {
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
		
	System.out.println("llegue al servlet bUSCAR");
		
		String email= request.getParameter("MAIL");
		String buscar= request.getParameter("busc");
		String correo= request.getParameter("correo");
		
		
		System.out.println(email);
		System.out.println(buscar);
		System.out.println(correo);
	
		
		DaoUsuario userDao = DaoFactory.getFactory().getUsuarioDAO();
		try {
		
			try {
				System.out.println("Busca por cedula");
				Integer.parseInt(email);
				Usuario user = userDao.findById(email);
				 System.out.println(user.toString());
					
				 request.setAttribute("usuario", user);
				 
				 getServletContext().getRequestDispatcher("/Privada/Agenda_Usuarios.jsp").forward(request, response);
	
			} catch (Exception e) {
				System.out.println("Buscar por correo");
				Usuario user = userDao.findBycorreo(email);
				 System.out.println(user.toString());
					
				 request.setAttribute("usuario", user);
				 
				 getServletContext().getRequestDispatcher("/Privada/Agenda_Usuarios.jsp").forward(request, response);
				}
		} catch(Exception e1) {
			System.out.println("No se a encontrado resultados");
		}
		
		
		
		
	}

}
