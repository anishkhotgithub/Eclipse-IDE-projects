package Servlet;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import other.Email;

@WebServlet(name="Register",urlPatterns = "/Register")
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
			Class.forName("com.mysql.jdbc.Driver");
			//Mention Database url, username and password
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Register1","root","root");
			PreparedStatement ps=con.prepareStatement("insert into register1 values(?,?,?,?)");
			ps.setString(1, username);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, "user");
			ps.executeUpdate();
			
			
			Email em=new Email(email, "Registerd Successfully!!!", "Welcome to Books Website!!!");
			em.sendEmail();
			
			resp.sendRedirect("Home.jsp");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}