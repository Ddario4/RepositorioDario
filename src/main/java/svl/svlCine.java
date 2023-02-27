package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class svlCine
 */
public class svlCine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public svlCine() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void proccesRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		
		dao.CineDao daocine=new dao.CineDao();
		
		if ( id!=null&& (id.equals("cine") ) ||id.equals("cines") ) {
		
	
			
		}
			
			
		response.sendRedirect("index.jsp");
			
		}
		
		
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		proccesRequest(request, response);	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		proccesRequest(request, response);
	}

}
