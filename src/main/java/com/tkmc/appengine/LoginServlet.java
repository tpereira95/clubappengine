package com.tkmc.appengine;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.JSONObject;



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
		 //String userid = (String) req.getParameter(USERID);
		 //String password = (String)req.getParameter(PASSWORD);
		 
		 StringBuilder sb = new StringBuilder();
	        BufferedReader br = req.getReader();
	        String str = null;
	        while ((str = br.readLine()) != null) {
	            sb.append(str);
	        }
	        JSONObject jObj = new JSONObject(sb.toString());
	        String userid = jObj.getString("userID");
	        String password = jObj.getString("password");
		 
		
		 System.out.println("userid is " + userid + " " + password);
		 
		 
		 JSONObject userObj = new JSONObject(); 
		 
		 userObj.put("userid", userid);
		 userObj.put("password", password);
		 resp.setHeader("Access-Control-Allow-Origin", "*");
		 resp.setContentType("application/json"); 
		 resp.getWriter().write(userObj.toString());
		 
		 
		 
		
	 }
	 
	 
	 private boolean validateLogin(String userid, String password){
		 boolean result = false;
		 if(userid.equals("Trevor") && password.equals("pass")){
			 result = true;
		 }
		 return result;
	 }

}
