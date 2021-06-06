package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dashboard
 */
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dashboard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie =null;
		Cookie[] cookies = null;
		boolean found = false;
		
		PrintWriter out = response.getWriter();
		cookies = request.getCookies();
		
		if(cookies!=null) {
			for(int i=0; i<cookies.length; i++) {
				cookie = cookies[i];
				if(cookie.getName().contentEquals("userid") && cookie.getValue()!=null) {
					out.print("User read from cookie: " + cookie.getValue() + "<br>");
					found = true;
				}
			}
		}
		if(!found) {
			out.print("No user found in cookie. <br>");
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
