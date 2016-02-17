package katugallup.control;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import katugallup.model.Kysymys;
import katugallup.model.dao.KysymysDAO;

@WebServlet("/lisaa-kysymys")
public class LisaaKysymys extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		
		String jsp = "/view/lisaa-kysymys.jsp"; 
		RequestDispatcher dispather = getServletContext().getRequestDispatcher(jsp);
		dispather.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		try{
			int kid = 0;  
			
			String kysymystekstiStr = request.getParameter("kysymysteksti"); 
			String kysymysteksti = new String(kysymystekstiStr);
			
						Kysymys kysymys = new Kysymys(kid, kysymysteksti);
						KysymysDAO kysymysdao = new KysymysDAO();
						
						kysymysdao.addKysymys(kysymys);
					} catch (SQLException e) {
						
						System.out.println("Sovelluksessa tapahtui virhe "+ e.getMessage());
					}
				
					response.sendRedirect("listaa-kysymykset");
					
	}
}
					
