package com.excalibur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		
		httpServletResponse.setContentType("text/html");
		
		try(PrintWriter writer = httpServletResponse.getWriter();) {
			writer.println("<h2>Hi Vsauce! Servlet here!</h2>");
		}
		catch(IOException e) {
			
		}
		
	}
}
