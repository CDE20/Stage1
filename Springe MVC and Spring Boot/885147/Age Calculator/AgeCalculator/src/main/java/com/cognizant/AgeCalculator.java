package com.cognizant;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgeCalculator
 */
@WebServlet("/AgeCalculator")
public class AgeCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AgeService ageService = new AgeService();

    /**
     * Default constructor. 
     */
    public AgeCalculator() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//add the code as per the requirement
			 String name = request.getParameter("name");
			 String dob = request.getParameter("dob");
			 String result = ageService.calculateAge(dob);
			 
			 request.setAttribute("name", name);
			 request.setAttribute("message", result);
		      request.getRequestDispatcher("index.jsp").forward(request, response);
		 	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
