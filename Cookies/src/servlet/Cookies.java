package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name ="Cookies",urlPatterns ="/Cookies")
public class Cookies extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		try(PrintWriter out=resp.getWriter())
		{
			Cookie firstname=new Cookie("fname", req.getParameter("fname"));
			Cookie lastname=new Cookie("lname", req.getParameter("lname"));
			
			firstname.setMaxAge(60*60*24);
			lastname.setMaxAge(60*60*24);
			
			resp.addCookie(firstname);
			resp.addCookie(lastname);
			
			out.print("<h1>First Name:"+req.getParameter("fname")+"</h1>"
						+"<h1>Last Name:"+req.getParameter("lname")+"</h1>");
		}
		
	}
	
}
