package katugallup.control;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/muokkaus-ok")
public class MuokkausOK extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public MuokkausOK() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String muokkausOk ="Kysymyksen muokkaus onnistui!";
		
		request.setAttribute("muokkausOk", muokkausOk);
		
		String jsp = "/view/muokkaus-ok.jsp"; 
		RequestDispatcher dispather = getServletContext().getRequestDispatcher(jsp);
		dispather.forward(request, response);
		
		
	}
	
}
