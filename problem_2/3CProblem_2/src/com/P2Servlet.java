package com;
// Import required java libraries
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

// Extend HttpServlet class
public class P2Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private String json = "";
	private Account input;
	
  public void init() throws ServletException
  {

  }

  protected void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {

  }
  
  protected void doPost(HttpServletRequest request,
          HttpServletResponse response)
  throws ServletException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
		if(br!=null){
			json = br.readLine();
		}
		//map JSON object in case we want to propagate to a server or something.
		Gson gson = new Gson();
		input = (Account)gson.fromJson(json, Account.class);
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.println(json);
		out.flush();
	}
	  
  
  
  public void destroy()
  {
      // do nothing.
  }
}