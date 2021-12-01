package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.UserDao;
import com.Entity.User;
import com.Helper.ConnectionProvider;

public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public RegisterUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String  username = request.getParameter("username");
		String  password = request.getParameter("password");
		String  gender = request.getParameter("gender");
		
		
		int genderEncode = gender.equals("female")?2:1;
		
		User user = new User(name, username, password, genderEncode);
		UserDao ud = new UserDao(ConnectionProvider.getConnection());
		boolean isSuccess = ud.saveUser(user);
		
		System.out.println(name + " " + username + " " + gender + " " + isSuccess);
		if(isSuccess == true) {
			response.sendRedirect("loginForm.jsp");
		}else {
			response.sendRedirect("userForm.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
