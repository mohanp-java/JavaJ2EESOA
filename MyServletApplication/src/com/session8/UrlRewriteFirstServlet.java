package com.session8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UrlRewriteFirstServlet
 */
@WebServlet("/urlRewriteFirstServlet")
public class UrlRewriteFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n=request.getParameter("userName");
		out.print("Welcome "+n);

		out.print("</br>");
		//appending the username in the query string
		out.print("<a href='urlRewriteSecondServlet?uname="+n+"'>visit</a>");
				
		out.close();

	}

}
