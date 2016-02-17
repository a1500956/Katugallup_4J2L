package katugallup.control;


import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import katugallup.model.Kysymys;
import katugallup.model.dao.KysymysDAO;


@WebServlet("/listaa-kysymykset")
public class ListaaKysymykset extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				
			KysymysDAO kysymysdao = new KysymysDAO();
			ArrayList<Kysymys> kysymykset = kysymysdao.findAll();
			
			request.setAttribute("kysymykset", kysymykset);
			
			String jsp = "/view/listaa-kysymykset.jsp"; 
			RequestDispatcher dispather = getServletContext().getRequestDispatcher(jsp);
			dispather.forward(request, response);
		
		}

}