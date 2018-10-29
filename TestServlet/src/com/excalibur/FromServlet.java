package com.excalibur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FromServlet
 */
@WebServlet("/FromServlet")
public class FromServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FromServlet() {
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
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		try(PrintWriter writer = response.getWriter()){
			writer.append("<p>Name: " + request.getParameter("username") + "</p>");
			writer.append("<p>Age: " + request.getParameter("userage") + "</p>");
			writer.append("<p>Gender: " + request.getParameter("usergender") + "</p>");
			writer.append("<p>Country: " + request.getParameter("usercountry") + "</p>");
			writer.append("<h3>Courses</h3><ul>");
			for(String course : request.getParameterValues("courses")) {
				writer.append("<li>" + course + "</li>");
			}
			writer.append("</ul>");
			writer.flush();
		}
		catch(IOException e) {
			
		}
	}

}
