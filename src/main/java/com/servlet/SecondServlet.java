package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("This is servlet using generic servlet");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h3> This is my second servlet using generic servlet</h3>");
	}

}
