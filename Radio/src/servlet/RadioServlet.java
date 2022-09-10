package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name ="RadioServlet",urlPatterns ="/RadioServlet")
public class RadioServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String h1=req.getParameter("h1");
		String h2=req.getParameter("h2");
		String h3=req.getParameter("h3");
		PrintWriter out=resp.getWriter();
		if(h1.equals("3") && h2.equals("1") && h3.equals("3"))
		{
			out.println("<h1>Congratulation you have Passed<h1>");
		}
		else
		{
			out.println("<h1>Better Luck Next Time<h1>");

		}
		
	}
	
}
