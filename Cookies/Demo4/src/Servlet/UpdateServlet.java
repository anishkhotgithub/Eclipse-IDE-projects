package Servlet;

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

@WebServlet(name="UpdateServlet",urlPatterns ="/UpdateServlet")
public class UpdateServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int bookid=Integer.parseInt(req.getParameter("bookid"));
		String bookname=req.getParameter("bookname");
		String author=req.getParameter("author");
		float price=Float.parseFloat(req.getParameter("price"));
		String link=req.getParameter("link");
		PrintWriter out =resp.getWriter();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Register1","root","root");
			PreparedStatement ps=con.prepareStatement("update books set bookname=?,author=?,price=?,link=? where bookid=?");
			ps.setString(1, bookname);
			ps.setString(2, author);
			ps.setFloat(3, price);
			ps.setString(4, link);
			ps.setInt(5, bookid);
			ps.executeUpdate();
			out.println(""
					+ "<script>"
					+ "alert('Book Updated Successfully!!!');"
					+ "window.location='BooksDetails.jsp';"
					+ "</script>");
		}
		catch (Exception e) 
		{
			out.println(e);
		}
	}
	
}
