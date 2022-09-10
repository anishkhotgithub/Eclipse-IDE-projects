package Filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Loginfilter
 */
@WebFilter("/LoginServlet")
public class Loginfilter implements Filter 
{

    
	public void destroy() 
	{
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse resp=(HttpServletResponse)response;
		
		String name=req.getParameter("uname");
		String pass=req.getParameter("password");
		PrintWriter out=resp.getWriter();
		if(name.equals("Lavanya") && pass.equals("pass123") )
		{
			out.println("Hello " +name);
			System.out.println("in Filter");
		}
		chain.doFilter(request, response);
	}


	public void init(FilterConfig fConfig) throws ServletException 
	{
		
	}

}
