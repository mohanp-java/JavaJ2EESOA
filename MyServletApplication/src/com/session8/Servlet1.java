package com.session8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/servlet1")
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.print("Welcome" + userName);
		//Cookie implementation
		Cookie cookie = new Cookie("uName", userName);
		cookie.setMaxAge(60*60);
		response.addCookie(cookie);
		//HttpSession implementation
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("Player", "MSD");
		System.out.println("Session Id : " + httpSession.getId());
		System.out.println("Hidden :: " + request.getParameter("company"));
		out.print("<form action= 'servlet2' method = 'post'>");
		out.print("<input type = 'submit' value= 'go'/>");
		out.print("</form>");
		out.close();
	}

}
