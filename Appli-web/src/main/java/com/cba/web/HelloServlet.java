package com.cba.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cba.domain.User;
import com.cba.srv.IUserSrv;
import com.cba.srv.impl.UserImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		IUserSrv userSrv = new UserImpl();

		List<User> users = userSrv.getUsers();
		String usersStr = toJson(users);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Hello World from HelloServlet !!!");
		out.println("<br>---------------------------------<br>");
		out.println(usersStr);
		out.flush();
		out.close();
	}

	private String toJson(List<User> users) {

		String strResult = "";
		ObjectMapper mapper = new ObjectMapper();

		try {
			System.out.println("Users size : " + users != null ? users.size() : 0);
			strResult = mapper.writeValueAsString(users);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return strResult;
	}
}