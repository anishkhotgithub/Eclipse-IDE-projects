package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	
@WebServlet(name ="LoginServlet",urlPatterns ="/LoginServlet")
public class LoginServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String a=req.getParameter("username");
		String b=req.getParameter("password");
		PrintWriter out=resp.getWriter();
		if(a.equals("Anish")&& b.equals("anish123"))
		{
			out.println("<h1>Welcome My friend: "+a+"</h1>");
		}
		else
		{
			out.println("<h1>Invalid username and password</h1>");
		}
	}	
	
}
