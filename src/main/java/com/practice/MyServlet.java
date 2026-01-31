package com.practice;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Date;


public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse resp)throws IOException, ServletException {
		System.out.println("THis is get Method.........");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.print("<h1>This is get method of my server</h1>");
		out.print(new Date().toString());
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		
	}

}
