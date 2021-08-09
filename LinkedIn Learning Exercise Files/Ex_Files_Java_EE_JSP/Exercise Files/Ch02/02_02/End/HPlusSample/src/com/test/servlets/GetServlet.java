package com.test.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetServlet extends HttpServlet{
	
	@Override
	// method for the get request. generate doget and the method will generate in any IDE
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// this statment will fetch data from inside the servlet
		String value = req.getParameter("name");
		// This String will appear on the webpage for the client
		String htmlResponse = "<html><h3>Welcome to Servlets!</h3></html>";
		// This statement will bring the htmlResponse to the webpage. PrintWriter is an API that was made for writing responses on a webpage
		PrintWriter writer = resp.getWriter();
		// the write API will send the htmlResponse and value to the webpage
		writer.write(htmlResponse+" "+value);
		
	}

}
