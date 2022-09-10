package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class check1 extends HttpServlet
{
	
	mybeans.CCBeans obj;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter out=resp.getWriter();
		double amt=Double.parseDouble(req.getParameter("amt"));
		if(req.getParameter("type").equals("r2d"))
		{
			out.println("<h1>"+amt+"Rupees="+obj.r2Dollor(amt)+"Dollars</h1>");
		}
		if(req.getParameter("type").equals("d2r"))
		{
			out.println("<h1>"+amt+"Dolar="+obj.d2Rupees(amt)+"Rupees</h1>");
		}
	}
	
}
