package controller;

import java.io.IOException;
import java.util.HashSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Employee;
import bean.Skill;
import service.EmployeeService;

/**
 * Servlet implementation class EmployeeSkillServlet
 */
@WebServlet("/EmployeeSkillServlet")
public class EmployeeSkillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployeeSkillServlet() {
        
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
		doGet(request, response);
		
		EmployeeService empService = new EmployeeService();
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("ADD EMPLOYEE"))
		{
			
			int id=Integer.parseInt(request.getParameter("empId"));
			String name= request.getParameter("empName").toUpperCase();
			String location= request.getParameter("location");
			
			Employee emp =new Employee();
			emp.setEmpID(id);
			emp.setEmpName(name);
			emp.setLocation(location);
			
			int i=empService.addEmployee(emp);
			if(i > 0){
				request.setAttribute("msg","Employee Added Succesfully");
				RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
				rd.forward(request,response);
			}
			else{
				request.setAttribute("msg","Employee ID Already Exist!!!!!");
				RequestDispatcher rd = request.getRequestDispatcher("Failure.jsp");
				rd.forward(request,response);
			}
		}
		else if(action.equalsIgnoreCase("ADD SKILL"))
		{
			
			String skillid=request.getParameter("skillId");
			int id=Integer.parseInt(request.getParameter("empId"));
			String technology= request.getParameter("technology").toUpperCase();
			String skilllevel= request.getParameter("level");
			int experience=Integer.parseInt(request.getParameter("experience"));
			
			Skill skill = new Skill();
			skill.setSkillID(skillid);
			skill.setEmpID(id);
			skill.setTechnology(technology);
			skill.setLevel(skilllevel);
			skill.setExperience(experience);
			
			int i=empService.addSkill(skill);
			
			if(i > 0){
				request.setAttribute("msg","Skill Added Succesfully");
				RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
				rd.forward(request,response);
			}
			else{
				request.setAttribute("msg","Check Your Details!!!!!");
				RequestDispatcher rd = request.getRequestDispatcher("Failure.jsp");
				rd.forward(request,response);
			}
		}
		else if(action.equalsIgnoreCase("FIND EMPLOYEE"))
		{
			String technology =request.getParameter("technology").toUpperCase();
			String skilllevel= request.getParameter("level");
			
			HashSet<String> hs= new HashSet<String>();
			
			hs=empService.getEmpNameForLevel(technology, skilllevel);
			if(hs.isEmpty())
			{
				request.setAttribute("msg", "Employee Not Found!!!!");
				RequestDispatcher rd =request.getRequestDispatcher("Failure.jsp");
				rd.forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Employee Found!!!!");
				request.setAttribute("HashSet", hs);
				RequestDispatcher rd =request.getRequestDispatcher("EmployeeFound.jsp");
				rd.forward(request, response);
					
			}
		}
	}

}
