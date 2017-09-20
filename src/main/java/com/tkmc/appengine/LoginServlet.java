package com.tkmc.appengine;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "loginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1987078263988244115L;
	private static final String USERID = "userID";
	private static final String PASSWORD = "password";
	
	 @Override
	  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
	      IOException {
		 String userid = (String) req.getParameter(USERID);
		 String password = (String)req.getParameter(PASSWORD);
		 
		 if(validateLogin(userid, password)){
			 req.getServletContext().getRequestDispatcher("/welcome.html").forward(req, resp);
		 }
		 
		
	 }
	 
	 
	 private boolean validateLogin(String userid, String password){
		 boolean result = false;
		 if(userid.equals("Trevor") && password.equals("pass")){
			 result = true;
		 }
		 return result;
	 }

}
