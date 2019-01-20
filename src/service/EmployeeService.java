package service;

import java.util.HashSet;

import bean.Employee;
import bean.Skill;
import DAO.SkillMgmt;

public class EmployeeService {
	
	SkillMgmt dao = new SkillMgmt();
	
	public int addEmployee(Employee emp)
	{
		System.out.println("Employee Added------>!!!");
		int i = dao.addEmployee(emp);
		return i;
 	}

	
	public int addSkill(Skill skill)
	{
		System.out.println("Skill Added--------->!!!");
		int i = dao.addSkill(skill);
		return i;
	}
	
	public HashSet<String> getEmpNameForLevel(String technology,String level)
	{
		HashSet<String> hs= new HashSet<String>();
		System.out.println("EmpName Found--------->!!!");
		hs = dao.retrieveEmpNameForLevel(technology, level);
		return hs;
	}
	
}
