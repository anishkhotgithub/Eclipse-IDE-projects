package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession hs=req.getSession();
		String name=(String)req.getAttribute("nm");
		String email=(String)hs.getAttribute("em");
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("Name "+name+"<Br>");
		out.println("Email "+email+"<br>");
		out.println("<a href='MyServlet3'>Next Page</a>");
	}
}
