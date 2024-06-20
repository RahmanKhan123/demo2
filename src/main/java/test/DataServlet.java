package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/radio")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
         
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
float b=90;
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("Name");
		int age=Integer.parseInt(request.getParameter("Age"));
		long mobNo=Long.parseLong(request.getParameter("Mobile"));
		String gender=request.getParameter("Gender");
		String[] parameterValues = request.getParameterValues("Hobbies");
		pw.println("Name:"+name);
		pw.println("Age:"+age);
		pw.println("Mobile No:"+mobNo);
		if(gender.equals("Male"))
		pw.println("Gender:"+gender);
		else pw.println("Gender:"+gender);
		for(String hobbies:parameterValues)
		{
			pw.println("Hobbies:"+hobbies);
		}
	}

}
