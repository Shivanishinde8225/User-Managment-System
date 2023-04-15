package com.acc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acc.dao.UserDao;

/**
 * Servlet implementation class DeleteUserServlets
 */
@WebServlet("/DeleteUserServlets")
public class DeleteUserServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	UserDao userDao ;
    public DeleteUserServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDao userDao = new UserDao();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		boolean status = false;
		int uInteger = Integer.parseInt(request.getParameter("uid"));
		//out.println(uInteger);
		try {
			status = userDao.deleteUser(uInteger);
			if(status) {
				response.sendRedirect("ListUsers.jsp");
			}
			else {
				out.print("No user with requested id :"+uInteger+"in System.");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
			request.getS
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
