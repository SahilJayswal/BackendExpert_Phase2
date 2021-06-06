package com.flyaway;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.flyaway.DBConnection;


/**
 * Servlet implementation class Change_Password
 */
public class Change_Password extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Change_Password() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
		 	String pass = request.getParameter("password");
		 	out.print("Your New Password is: "+ pass);
		    
		 	try {
				
				InputStream in = getServletContext().getResourceAsStream("WEB-INF/config.properties");
				Properties prop = new Properties();
				prop.load(in);
			
				DBConnection conn = new DBConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("password"));
			
				Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				stmt.executeUpdate("update admin set password= '"+pass+"' where id=1");
		 	}catch(Exception e) {
				e.printStackTrace();
			}
		 	out.print("<br><br><a href='Admin_Login.jsp'>Click Here to Login</a>");
		 	out.print("</body></html>");
	}

}
