import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name ="ColorServlet",urlPatterns="/ColorServlet")
public class ColorServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String c=req.getParameter("Color");
		PrintWriter out=resp.getWriter();
		if(c.equals("red"))
		{
			out.println("<body BGCOLOR=red>");
		}
		else if (c.equals("green"))
		{
			out.println("<body BGCOLOR=green>");
		}
		else if (c.equals("yellow"))
		{
			out.println("<body BGCOLOR=yellow>");
		}
		else if (c.equals("blue"))
		{
			out.println("<body BGCOLOR=blue>");
		}
	}
	
}
