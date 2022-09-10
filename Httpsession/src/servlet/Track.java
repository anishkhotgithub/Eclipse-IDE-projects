package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;
@WebServlet(name ="Track",urlPatterns ="/Track")
public class Track extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession(true);
		Date d1=new Date(session.getCreationTime());
		Date d2=new Date(session.getLastAccessedTime());
		String s="Welcome back to my project";
		Integer visitcount=new Integer(0);
		String visitCountKey=new String("visitcount");
		String userIDKey=new String("userID");
		String userID=new String("Anish Khot");
		if(session.isNew())
		{
			s="Welcome to my website";
			session.setAttribute(userIDKey, userID);
		}
		else
		{
			visitcount=(Integer)session.getAttribute(visitCountKey);
			visitcount=visitcount+1;
			userID=(String)session.getAttribute(userIDKey);
		}
		session.setAttribute(visitCountKey, visitcount);
		out.println("Session id is "+session.getId());
		out.println("\n Creation time is "+d1);
		out.println("\n Time of Las access is "+d2);
		out.println("\n Number of visit is "+visitcount);
	}
	
}
