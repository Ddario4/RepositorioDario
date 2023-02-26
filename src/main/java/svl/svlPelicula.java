package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class svlPelicula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public svlPelicula() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void proccesRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		
		if ( id!=null && (id.equals("cartelera") || id.equals("estrenos"))  ) {
			Object data=new dao.PeliculaDAO().getPeliculas(id.equals("cartelera")? 1:2);
			session.setAttribute("id", data == null ? null : "peliculas");
			session.setAttribute("data", data);
		}
			
			
response.sendRedirect("index.jsp");
			
		}
		
		
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		proccesRequest(request, response);	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		proccesRequest(request, response);
	}

}
