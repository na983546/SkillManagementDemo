package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SkillManager
 */
@WebServlet("/SkillManager")
public class SkillManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SkillManager() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("ADD EMPLOYEE"))
		{
			response.sendRedirect("AddEmployee.jsp");
		}
		else if(action.equalsIgnoreCase("ADD SKILL"))
		{
			response.sendRedirect("AddSkill.jsp");
		}
		else if(action.equalsIgnoreCase("GET EMPLOYEE"))
		{
			response.sendRedirect("Employee.jsp");
		}
		else if(action.equalsIgnoreCase("GET SKILLS"))
		{
			response.sendRedirect("Skill.jsp");
		}
		else if(action.equalsIgnoreCase("GET LOCATION"))
		{
			response.sendRedirect("Location.jsp");
		}
		else if(action.equalsIgnoreCase("HOME"))
		{
			response.sendRedirect("index.html");
		}
		
	}

}
