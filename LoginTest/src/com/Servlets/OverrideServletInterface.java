package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class OverrideServletInterface implements Servlet{

	ServletConfig config=null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("Initialization complete");
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pwriter = res.getWriter();
		pwriter.print("<html>");
		pwriter.print("<body>");
		pwriter.print("<h1>Implemeting Servlet Interface Example Program</h1>");
		pwriter.print("</body>");
		pwriter.print("</html>");
	}

	@Override
	public String getServletInfo() {
		return "Servlet by implemeting Servlet interface";
	}

	@Override
	public void destroy() {
		System.out.println("Servlet life cycle finished");
	}
	
}
