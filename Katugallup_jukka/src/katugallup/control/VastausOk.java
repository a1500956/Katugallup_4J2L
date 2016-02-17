package katugallup.control;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/vastaus-ok")
public class VastausOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public VastausOk() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String vastausOk ="Vastauksenne on tallennettu järjestelmäämme. Kiitämme teitä osallistumisesta tutkimukseemme ja toivotamme teille hyvää päivänjatkoa!";
		
		request.setAttribute("vastausOk", vastausOk);
		
		String jsp = "/view/vastaus-ok.jsp"; 
		RequestDispatcher dispather = getServletContext().getRequestDispatcher(jsp);
		dispather.forward(request, response);
		
		
	}
	
}
