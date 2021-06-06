package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		PrintWriter out = response.getWriter();
		out.print("<h2> This is config method using init-param tag in servlet1</h2>");
		
		out.print("SQL = "+ config.getInitParameter("SQL"));
		out.print("<br/> Message = " + config.getInitParameter("Message"));
		
		out.print("<h2> This is context method using context-param tag in servlet"+
				" It can be access in all servlet</h2>");
		
		ServletContext context = getServletContext();
		
		out.print("<br/> Driver = "+ context.getInitParameter("Driver"));
		out.print("<br/> url = "+ context.getInitParameter("url"));
		
	}

}
