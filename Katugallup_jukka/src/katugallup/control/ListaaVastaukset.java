package katugallup.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import katugallup.model.Vastaus;
import katugallup.model.dao.VastausDAO;


@WebServlet("/listaa-vastaukset")
public class ListaaVastaukset extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		VastausDAO vastausdao = new VastausDAO();
		ArrayList<Vastaus> vastaukset = vastausdao.findAll();
		ArrayList<Vastaus> vastausLista = new ArrayList<Vastaus>();
		String strID1 = request.getParameter("id1");
		String strID = strID1.substring(5);				
		
		request.setAttribute("kysytty", strID);
		
		
			
		
	 			
		String kysymys_idk = strID1.substring(0, 5);
		int kysymys_id = new Integer(kysymys_idk);
       
		for(int i=0;i<vastaukset.size();i++){
			
			if(vastaukset.get(i).getKysymys_id()==kysymys_id){
				Vastaus vastaus = new Vastaus();
        	
        	vastaus = vastaukset.get(i);
        	vastausLista.add(vastaus);
        	
        }
}
		
		request.setAttribute("vastausLista", vastausLista);
		
		String jsp = "/view/listaa-vastaukset.jsp"; 
		RequestDispatcher dispather = getServletContext().getRequestDispatcher(jsp);
		dispather.forward(request, response);
	
		
	}
	}




