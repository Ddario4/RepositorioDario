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
		Object data=null;
		if ( id!=null ) {
		
		if ( id.equals("cartelera") || id.equals("estrenos"))   
			
	
			 data=new dao.PeliculaDAO().getPeliculas(id.equals("cartelera")? 1:2,true);
			else data=new dao.PeliculaDAO().getPelicula(id,false);

			
			session.setAttribute("id", data == null ? null : id.equals("cartelera") || id.equals("estrenos")?"peliculas":"pelicula");
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
