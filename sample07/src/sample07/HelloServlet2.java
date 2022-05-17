package sample07;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/displayCookie")
public class DisplayServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println("<html>");
		
		pw.println("<head>");
		pw.println("<title>Hello Servlet</title>");
		pw.println("</head>");
		
		pw.println("<body>");
		
		Cookie cookies[] = req.getCookies();
		if(cookies != null) {
		
			for (int i = 0; i < cookies.length; i++) {
				String value = cookies[i].getValue();
				
				pw.println("<p>");				
				pw.println(cookies[i].getName() + " : " + value);
				pw.println("</p>");
			}
			
		}		
		
		pw.println("</body>");
		
		pw.println("</html>");
		
		pw.close();	
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
}
