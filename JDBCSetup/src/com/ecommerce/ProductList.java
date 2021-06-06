package com.ecommerce;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductList
 */
public class ProductList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductList() {
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
			Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//			stmt.executeUpdate("use ecommerce");
			stmt.executeUpdate("insert into eproduct (name, price ,date_added) values ('Newproduct', 17000, now())");
			out.print("Executed an insert operation<br>");
			
			stmt.executeUpdate("update eproduct set price=2000 where name='Newproduct'");
			out.print("Executed an update operation<br>");
			
			stmt.executeUpdate("delete from eproduct where name='Newproduct'");
			out.print("Executed an delete operation<br>");
			
			stmt.close();
			
			conn.closeConnection();
			
			out.print("</body></html>");
			
		}catch(ClassNotFoundException e) {
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
