package com.as.samples;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Student  extends HttpServlet{

	    public void doGet(HttpServletRequest request,
	                      HttpServletResponse response)
	        throws IOException, ServletException
	    {
		//Get registration details and set to the EMailAddress
	    	String firstName = request.getParameter("fname");
	    	String lastName = request.getParameter("lname");
	    	String city = request.getParameter("city");
	    	String state = request.getParameter("state");
	    	String pin = request.getParameter("pin");
	    	System.out.println("First Name is " + firstName);
	    	System.out.println("Last Name is " + lastName);
	    	
	    	HttpSession ses= request.getSession();
	    	ses.setAttribute("ofname", firstName);
	    	ses.setAttribute("olname", lastName);
	    	ses.setAttribute("ocity", city);
	    	ses.setAttribute("ostate", state);
	    	ses.setAttribute("opin", pin);
	        response.setContentType("student/html");
			response.sendRedirect("jsp/output.jsp");
	    }

}
