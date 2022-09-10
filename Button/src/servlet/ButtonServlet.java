package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name ="ButtonServlet" , urlPatterns ="/ButtonServlet")
public class ButtonServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String a=req.getParameter("name");
		PrintWriter out=resp.getWriter();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","root");
			PreparedStatement ps=con.prepareStatement("insert into button values(?)");
			ps.setString(1, a);
			ps.executeUpdate();
			out.println("<button><a href="+a+">"+a+"</a></button>");
			resp.sendRedirect("button.jsp");
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
		
	}
	
}
