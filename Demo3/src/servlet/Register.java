package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="Register",urlPatterns ="/Register")
public class Register extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String username=req.getParameter("username");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		try
		{
			
			//Mention SQL software
		    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
			Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=Register;user=Anish;password=sasa");
			PreparedStatement ps=con.prepareStatement("insert into Register values(?,?,?)");

			ps.setString(1, username);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.executeUpdate();
			
			resp.sendRedirect("index1.jsp");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
