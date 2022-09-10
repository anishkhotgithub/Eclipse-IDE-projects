package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(name="AddTableServlet",urlPatterns ="/AddTableServlet")
@MultipartConfig(maxFileSize = 9999999999L)
public class AddTableServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name=req.getParameter("name");
		Part part=req.getPart("image");
		InputStream is=part.getInputStream();
		PrintWriter out=resp.getWriter();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Table1","root","root");
			PreparedStatement ps=con.prepareStatement("insert into image(name,image) values(?,?)");
			ps.setString(1, name);
			ps.setBlob(2, is);
			ps.executeUpdate();
			out.println(""
					+ "<script>"
					+ "alert('added successfully');"
					+ "window.location='Table.jsp';"
					+ "</script>");

		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
