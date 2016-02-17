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




@WebServlet("/poista-kysymys")
public class PoistaKysymys extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strID1 = request.getParameter("id1");
		String strID = strID1.substring(5);				
		
		request.setAttribute("kysytty", strID);
		String jsp = "/view/poista-kysymys.jsp"; 
		RequestDispatcher dispather = getServletContext().getRequestDispatcher(jsp);
		dispather.forward(request, response);
}
		
		protected void doPost(HttpServletRequest request,
    			HttpServletResponse response) throws ServletException, IOException {
				
			String strID1 = request.getParameter("id1");	
			
			try{

						
				String kysymys_idk = strID1.substring(0, 5);
				int kysymys_id = new Integer(kysymys_idk);
				
				
				
				Kysymys kysymys = new Kysymys (kysymys_id, null);
				KysymysDAO kysymysdao = new KysymysDAO();
							
				kysymysdao.deleteKysymys(kysymys);
				
							
				} catch (SQLException e) {
						
				System.out.println("Sovelluksessa tapahtui virhe "+ e.getMessage());
				}

			response.sendRedirect("poisto-ok");
						
		}
		}
