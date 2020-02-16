package com.ghostriders.osc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ghostriders.osc.entity.User;
import com.ghostriders.osc.util.HibernateUtil;

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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		String name=request.getParameter("uname");
		String password=request.getParameter("pswd");
		System.out.println("User name: "+name+"\npassword: "+password);
    HibernateUtil hu=new HibernateUtil();
		User u=new User();
		hu.Hibernate(u);
	}

}
