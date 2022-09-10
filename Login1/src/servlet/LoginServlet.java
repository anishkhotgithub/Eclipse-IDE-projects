package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="LoginServlet",urlPatterns ="/LoginServlet")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String email=req.getParameter("email");
		String password=req.getParameter("pass");
		PrintWriter out=resp.getWriter();
		try
		{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","root");
				PreparedStatement ps=con.prepareStatement("select * from login where email=? and password=?");
				ps.setString(1, "email");
				ps.setString(2, "password");
				ResultSet rs=ps.executeQuery();
				if(email!=null && password!=null)
				{
					out.println("Welcome");
				}
				else
				{
					out.println("error");
				}
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}
}
