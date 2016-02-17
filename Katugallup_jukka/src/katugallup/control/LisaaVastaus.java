package katugallup.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import katugallup.model.Vastaus;
import katugallup.model.dao.VastausDAO;


@WebServlet("/LisaaVastaus")
public class LisaaVastaus extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    			String strID1 = request.getParameter("id1");
    			String strID = strID1.substring(5);				
    			
    			request.setAttribute("kysytty", strID);
    			String jsp = "/view/vastaa-kysymys.jsp"; 
    			RequestDispatcher dispather = getServletContext().getRequestDispatcher(jsp);
    			dispather.forward(request, response);
  }
    	protected void doPost(HttpServletRequest request,
    			HttpServletResponse response) throws ServletException, IOException {
    		
    			String strID1 = request.getParameter("id1");	
    		
    		try{

    			
    			int vastaus_id = 0;   			
    			String kysymys_idk = strID1.substring(0, 5);
				int kysymys_id = new Integer(kysymys_idk);
    			String vastaustekstiStr = request.getParameter("vastausteksti"); 
    			String vastausteksti = new String(vastaustekstiStr);
    			String vastaajaStr = request.getParameter("vastaaja"); 
    			String vastaaja = new String(vastaajaStr);
    			String vastausaika = null;
    			
    			Vastaus vastaus = new Vastaus (vastaus_id, kysymys_id, vastausteksti, vastaaja, vastausaika);
    			VastausDAO vastausdao = new VastausDAO();
    						
    			vastausdao.addVastaus(vastaus);
    						
    			} catch (SQLException e) {
    					
    			System.out.println("Sovelluksessa tapahtui virhe "+ e.getMessage());
    			}
    		
    		response.sendRedirect("vastaus-ok");
    					
    	}
    }
    	

