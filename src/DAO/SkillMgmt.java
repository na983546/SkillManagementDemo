package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.LinkedHashMap;

import bean.Employee;
import bean.Skill;
import util.DbTransaction;

public class SkillMgmt {
	
	PreparedStatement ps=null;
	
	public int addEmployee(Employee emp){
		int i=0;
		Connection con =null;
		
			try {
				con=DbTransaction.getConnection();
				String sql ="insert into TBL_Employee_1625922 (EmpId,EmpName,EmpLocation) "+" values(?,?,?)";
				PreparedStatement ps =con.prepareStatement(sql);
				ps.setInt(1, emp.getEmpID());
				ps.setString(2, emp.getEmpName());
				ps.setString(3, emp.getLocation());
				i=ps.executeUpdate();
				DbTransaction.closeConnection(con);
				} 
			catch (SQLException e) {
				e.printStackTrace();
			}
			return i;
	}
	
	
	public int addSkill(Skill skill)
	{
		int i=0;
		Connection con =null;
		
			try {
				con=DbTransaction.getConnection();
				String sql ="insert into TBL_Skill_1625922 (SkillID,EmpId,Technology,Skilllevel,Experience) "+" values(?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, skill.getSkillID());
				ps.setInt(2, skill.getEmpID());
				ps.setString(3, skill.getTechnology());
				ps.setString(4, skill.getLevel());
				ps.setInt(5, skill.getExperience());
				i=ps.executeUpdate();
				DbTransaction.closeConnection(con);
				} 
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			return i;
	}
	
	
	public HashSet<String> retrieveEmpNameForLevel(String technology,String level){
		HashSet<String> hs= new HashSet<String>();
		Connection con = null;
	    ResultSet rs = null;

	    try {
	        con = DbTransaction.getConnection();
	        String sql ="select e.EmpName from TBL_Employee_1625922 e inner join TBL_Skill_1625922 s on e.Empid = s.Empid where s.Technology = ? and s.Skilllevel = ? order by e.EmpName";

	        ps = con.prepareStatement(sql);
	        ps.setString(1,technology);
	        ps.setString(2, level);

	        rs = ps.executeQuery();
	        while (rs.next()) {
	            hs.add(rs.getString(1));
	        }
	        DbTransaction.closeConnection(con);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		return hs;
	}
	
	
	public LinkedHashMap<String, Integer>retrieveSkilledResourceCntOnTech(String technology){
		LinkedHashMap<String , Integer> lhm= new LinkedHashMap<String ,Integer>();
		Connection con = null;
		ResultSet rs = null;

		    try {
		        con = DbTransaction.getConnection();
		        String sql = "select s.skilllevel, count(s.EmpId) from TBL_Skill_1625922 s where s.technology = ? group by skilllevel";

		        ps = con.prepareStatement(sql);

		        rs = ps.executeQuery();
		        while (rs.next()) {

		        }
		        DbTransaction.closeConnection(con);
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		return lhm;
	}
	
	
	/*public ArrayList<Employee>retrieveEmpLocForHighExp(){
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		
		return list;
	}
	*/

}
