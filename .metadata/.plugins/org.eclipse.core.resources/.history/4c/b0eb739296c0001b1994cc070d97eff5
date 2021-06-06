package com.flyaway;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Statement;
import java.util.Properties;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flyaway.DBConnection;


/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String id = request.getParameter("userid");
				String pass = request.getParameter("password");
				
				
				PrintWriter out = response.getWriter();
				out.print("<html><body>");
		try {
			
			InputStream in = getServletContext().getResourceAsStream("WEB-INF/config.properties");
			Properties prop = new Properties();
			prop.load(in);
		
			DBConnection conn = new DBConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("password"));
		
			Statement stmt = conn.getConnection().createStatement();
			
			ResultSet rst = stmt.executeQuery("select * from admin");
			while(rst.next()) {
				
				if(id.equals(rst.getString("userid")) && pass.equals(rst.getString("password"))) {
		    		response.sendRedirect("Admin_Dashboard.jsp");
		    		
		    }

        		
        }
						
	        RequestDispatcher rd = null;
	        rd = request.getRequestDispatcher("Admin_Login.jsp");
	        rd.include(request, response);
	        out.print("<center> <h4><span style='color:red; background-color:white' >Invalid credential!!</span></h4></center>");
	        
			 stmt.close();
			 conn.closeConnection();
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		      
		out.print("</body></html>");
	}

}
