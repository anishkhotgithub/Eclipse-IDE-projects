package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		String name=req.getParameter("uname");
		String pass=req.getParameter("password");
		PrintWriter out=resp.getWriter();
		if(name.equals("Anish") && pass.equals("pass@123"))
		{
			resp.sendRedirect("index.jsp");
		}
		else if(name.equals("Salim") && pass.equals("pass@123"))
		{
			resp.sendRedirect("index.jsp");
		}
	}
}
