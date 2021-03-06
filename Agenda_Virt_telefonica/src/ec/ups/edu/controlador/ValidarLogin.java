package ec.ups.edu.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.dao.DaoFactory;
import ec.edu.ups.dao.DaoUsuario;
import ec.edu.ups.modelo.Usuario;

/**
 * Servlet implementation class ValidarLogin
 */
@WebServlet(name="ValidarLogin", urlPatterns = {"/ValidarLogin"})
public class ValidarLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidarLogin() {
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
		System.out.println("entro por fin");
		String mail = request.getParameter("Usuario");
        String pass = request.getParameter("Contra");
        DaoUsuario userDao = DaoFactory.getFactory().getUsuarioDAO();
        Usuario user = userDao.findUsuario(mail, pass);
        if (user != null) {
            System.out.println("usuario encontrado");
            HttpSession session = request.getSession(true);
            session.setAttribute("sesionID", String.valueOf(session.getId()));
            session.setAttribute("userID", user.getCedula());
            
            response.sendRedirect("/Agenda_Virt_telefonica/Listar");
            
        }else{
        	if(user == null) {
        	System.out.println("se redirige al inicio ");
            response.sendRedirect("/Agenda_Virt_telefonica/JSPinterfaces/index.jsp");
        	}
        }     
	}

}
