package Servlet;

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

@WebServlet(name = "RegisterName",urlPatterns ="/RegisterName")
public class RegisterName extends HttpServlet 
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hello","root","root");
			PreparedStatement ps=con.prepareStatement("insert into Person values(?,?)");
			ps.setString(1,name);
			ps.setString(2,email);
			ps.executeUpdate();
			resp.sendRedirect("Table.jsp");
		} 
		catch (Exception e)
		{
			PrintWriter out=resp.getWriter();
			out.println(e);
		}
	}
	
}
