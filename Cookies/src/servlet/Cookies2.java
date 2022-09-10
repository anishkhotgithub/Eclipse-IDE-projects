package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name ="Cookies2",urlPatterns ="/Cookies2")
public class Cookies2 extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		try(PrintWriter out=resp.getWriter())
		{
			Cookie c1=null;
			Cookie[]c2=null;
			
			c2=req.getCookies();
			if(c2!=null)
			{
				out.print("<h1>Cookie Name and Value Found</h1>");
				for(int i=0;i<c2.length;i++)
				{
					c1=c2[i];
					out.print("Name:"+c1.getName()+",");
					out.print("Value:"+c1.getValue()+"<br/>");
				}
			}
			else
			{
				out.print("<h2>No cookies founds</h2>");
			}
		}
	
	}
	
}
