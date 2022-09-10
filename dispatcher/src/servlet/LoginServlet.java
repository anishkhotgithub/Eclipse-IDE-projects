package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="LoginServlet ", urlPatterns ="/LoginServlet")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name=req.getParameter("uname");
		String pass=req.getParameter("password");
		PrintWriter out=resp.getWriter();
		if(name.equals("anish") && pass.equals("password") )
		{
			out.println("Hello " +name);
			System.out.println("in Servlet");
		}
	}
}
