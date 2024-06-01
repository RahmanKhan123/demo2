package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/first")
public class FirstServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("uname");
		String id=req.getParameter("uid");
		PrintWriter pw=res.getWriter();
		pw.println("UserName:"+name);
		pw.println("UserId:"+id);
		
		
	}

}
