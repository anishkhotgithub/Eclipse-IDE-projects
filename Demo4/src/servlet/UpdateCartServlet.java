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

@WebServlet("/UpdateCartServlet")
public class UpdateCartServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		int cartitemid=Integer.parseInt(req.getParameter("bookid"));
		int qty=Integer.parseInt(req.getParameter("qty"));
		PrintWriter out=resp.getWriter();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Register1","root","root");
			PreparedStatement ps=con.prepareStatement("update cartitems set quantity=? where cartitemid=?");
			ps.setInt(1, qty);
			ps.setInt(2, cartitemid);
			ps.executeUpdate();
			out.println(""
					+ "<script>"
					+ "alert('qunatity added successfully!!!');"
					+ "window.location='cart.jsp';"
					+ "</script>");
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
	}
}

