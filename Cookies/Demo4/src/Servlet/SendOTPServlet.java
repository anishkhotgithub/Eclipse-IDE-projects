package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import other.Email;

@WebServlet("/SendOTPServlet")
public class SendOTPServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String email=req.getParameter("email");
		PrintWriter out=resp.getWriter();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Register1","root","root");
			PreparedStatement ps=con.prepareStatement("select * from register1 where email=?");
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				Random rd=new Random();
				int randomnumber=rd.nextInt(8888)+1000;
				
				HttpSession hs=req.getSession();
				hs.setAttribute("randomnumber",randomnumber);
				hs.setAttribute("email",email);
				
				
				Email em=new Email(email,"Password Reset?","OTP is"+randomnumber);
				em.sendEmail();
				
				out.println(""
						+ "<script>"
						+ "alert('Otp have been sent to your email account. Please check');"
						+ "window.location='collectotp.jsp';"
						+ "</script>");
			}
			else
			{
				out.println(""
						+ "<script>"
						+ "alert('Email is incorrect');"
						+ "window.location='collectemail.jsp';"
						+ "</script>");
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
