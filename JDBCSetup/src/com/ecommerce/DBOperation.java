package com.ecommerce;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class DBOperation
 */
public class DBOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBOperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
		
			InputStream in = getServletContext().getResourceAsStream("WEB-INF/config.properties");
			Properties prop = new Properties();
			prop.load(in);
		
			DBConnection conn = new DBConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("password"));
		
			Statement stmt = conn.getConnection().createStatement();
			stmt.executeUpdate("create database mydatabase");
			out.println("Created database: mydatabase<br>");
			stmt.executeUpdate("use mydatabase");
			out.println("Select database: mydatabase<br>");
			stmt.executeUpdate("drop databse mydatabase");
			out.print("Drop Databse: mydatabase<br>");
			
			stmt.close();
			
			conn.closeConnection();
			out.print("</body></html>");
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
