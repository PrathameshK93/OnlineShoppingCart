package com.ghostriders.osc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ghostriders.osc.dao.UserDao;
import com.ghostriders.osc.dao.Impl.UserDaoImpl;
import com.ghostriders.osc.entity.User;

/**
 * Servlet implementation class registration
 */
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String mobileno = request.getParameter("mobileno");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");
		String address = request.getParameter("address");
		String username = request.getParameter("username");
		int uid = 1;// this should be auto generated. for temporary use hard-core values.
		System.out.println(firstname+"\n"+lastname+"\n"+mobileno+"\n"+password+"\n"+email+"\n"+dob+"\n"+address+"\n"+username);
		UserDao userdao = new UserDaoImpl();
		User user = new User(firstname, lastname, mobileno, password, email, dob, address, username);
		user.setUid(uid);
		userdao.addUser(user);
	}

}
