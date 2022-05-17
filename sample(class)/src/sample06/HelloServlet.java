package sample06;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		
		String fruits[] = req.getParameterValues("fruits");
		
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		
		for (String s : fruits) {
			System.out.println("좋아하는 과일:" + s);
		}
		
	//	resp.sendRedirect("world");
		
		// 데이터 모으기
		ObjectDto dto = new ObjectDto(name, age, fruits);
		
		// 짐싸!
		req.setAttribute("myfruits", dto);
		
		RequestDispatcher rd = req.getRequestDispatcher("world");
		rd.forward(req, resp);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}	

}
