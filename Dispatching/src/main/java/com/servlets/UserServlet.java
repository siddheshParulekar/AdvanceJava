package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.UserImpl;
import com.pojo.User;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request comes in get");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		String userAciton = request.getParameter("act");
		UserImpl impl=new UserImpl();
		HttpSession session=request.getSession();
		System.out.println("Request comes in post");
		if(userAciton.equalsIgnoreCase("registerAction")) {
		String name=request.getParameter("myName");	
		int age=Integer.parseInt(request.getParameter("age"));
		long contact=Long.parseLong(request.getParameter("contact"));
		String emailId=request.getParameter("emailid");
		String username=request.getParameter("uname");
		String password=request.getParameter("pass");
		String gender=request.getParameter("gender");
		String location=request.getParameter("loc");
		String interestedCourses[]=request.getParameterValues("course");
	 	List<String> courseList=  Arrays.asList(interestedCourses);
		
		User user=new User();
		user.setAge(age); user.setContact(contact);
		user.setCourseList(courseList);
		user.setEmailId(emailId);user.setGender(gender);
		user.setLocation(location);user.setName(name);
		user.setPassword(password); user.setUsername(username);	
		System.out.println(user);
		
		boolean b=impl.register(user);
		if(b) {
			
			session.setAttribute("firstName",name );
			session.setAttribute("username", username);
			response.sendRedirect("WelcomeServlet2"); // new fresh req generated (get req)
		}
		else 
			response.sendRedirect("ErrorPages/Error.html");
	}
		else if(userAciton.equalsIgnoreCase("loginAction")) {
			String username=request.getParameter("username");
			String password=request.getParameter("pass");
			
			String name=impl.login(username,password);
			if(name != null) {
//				pw.print("Logged in Successfully --> Welcome" + name
				//response.sendRedirect("Succsess.html");
				RequestDispatcher dispatcher= request.getRequestDispatcher("WelcomeServlet");
				request.setAttribute("firstName", name);
				dispatcher.forward(request, response);
				pw.print("welcome" + name);
			}
			else {
			 pw.print("Something went wrong...");
				//response.sendRedirect("Error.html");
			}
			
			
			}
		}
	}

