package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.util.Date;

 
public class FirstServlet implements Servlet{
//	life cycle method of servlet
	ServletConfig conf;
	
	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("Create...");
	}
	
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException{
		System.out.println("Servicing...");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>This is my output from servlet method</h1>");
		out.println("<h3>Today date and this is "+ new Date().toString() +" </h3>");
	}

	public void destroy() {
		System.out.println("going to destroy servlet object..");
	}
	a
//	nonlife cycle method
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getServletInfo() {
		return " this servlet is created by Durgesh Tiwari";
	}
	
}
