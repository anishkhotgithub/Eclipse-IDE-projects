package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name ="CalcServlet",urlPatterns="/CalcServlet")
public class CalcServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String a=req.getParameter("num1");
		String b=req.getParameter("num2");
		String opt=req.getParameter("opt");
		PrintWriter out=resp.getWriter();
		if(opt.equals("add"))
		{
			out.println(Integer.parseInt(a) + Integer.parseInt(b));
		}
		else if (opt.equals("sub")) 
		{
			out.println(Integer.parseInt(a) - Integer.parseInt(b));
		}
		else if (opt.equals("multiply")) 
		{
			out.println(Integer.parseInt(a) * Integer.parseInt(b));
		}
		else if (opt.equals("divide")) 
		{
			out.println(Integer.parseInt(a) / Integer.parseInt(b));
		}
		
	}
	
}
