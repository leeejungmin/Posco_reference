package sample01;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.*;

/**
 * Servlet implementation class HelloServlett
 */
@WebServlet("/Hello")
public class HelloServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	 
	/**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = request.getParameter("id");
		int pw = request.getParameter("pw");
		int hb = request.getAttribute("hb");
		int age = request.getParameter("age");
		int mes = request.getParameter("mes");
				
		

	     System.out.println("전송된정보" );
	     System.out.println("아이디 :" + id);
	     System.out.println("패스워드 :" + pq);
	     System.out.println("취미 :" + hb);
	     System.out.println("나이 :" + age);
	     System.out.println("상세내역 :" + mes);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	system.out.println(data[0].name+" "+data[1].location+" "+data[2].age)

}
