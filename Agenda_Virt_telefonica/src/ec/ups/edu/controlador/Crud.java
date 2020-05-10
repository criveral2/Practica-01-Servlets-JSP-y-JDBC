package ec.ups.edu.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.ParseInfo;

import ec.edu.ups.dao.DaoFactory;
import ec.edu.ups.dao.DaoTelefono;
import ec.edu.ups.dao.DaoUsuario;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;

/**
 * Servlet implementation class EliminarTel
 */
@WebServlet("/Crud")
public class Crud extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Crud() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("entro al servlet");
		String editar = request.getParameter("EditTel");
		String eliminar = request.getParameter("ElimTel");
		String agregarTel = request.getParameter("agregarTel");
		String url = "";
		
		 DaoTelefono telefonoDao = DaoFactory.getFactory().getTelefonoDAO();
		 
		
		if(editar != null) {
			System.out.println("Entraste a editar");
			System.out.println(editar);
			Telefono telefono = telefonoDao.findById(Integer.parseInt(editar));
			System.out.println("Norecupera "+telefono.toString());
			System.out.println(telefono.getUsuario().getCorreo());
			request.setAttribute("telefono", telefono);
			getServletContext().getRequestDispatcher("/JSPinterfaces/ModificarTelefono.jsp").forward(request, response);
			
		}else {
			if(eliminar != null) {
				
				System.out.println("Entraste a eliminar");
				System.out.println(eliminar);
				Telefono telefono = telefonoDao.findById(Integer.parseInt(eliminar));
			
				request.setAttribute("telefono1", telefono);
				getServletContext().getRequestDispatcher("/JSPinterfaces/EliminarTelefono.jsp").forward(request, response);
			}else{
				if(agregarTel != null) {
					System.out.println("Entraste a agregar");
					System.out.println(agregarTel);
					request.setAttribute("cedula", agregarTel);
					getServletContext().getRequestDispatcher("/JSPinterfaces/AgregarTelefono.jsp").forward(request, response);
				}else {
					response.sendRedirect("/Listar");
				}
			}
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
