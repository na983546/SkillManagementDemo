package bean;

public class Skill {
	
	private int empID;
	private int experience;
	private String level;
	private String skillID;
	private String technology;
	public Skill() {
		super();
	}
	public Skill(String skillID,int empID,String technology,String level,int experience) {
		super();
		this.empID = empID;
		this.experience = experience;
		this.level = level;
		this.skillID = skillID;
		this.technology = technology;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getSkillID() {
		return skillID;
	}
	public void setSkillID(String skillID) {
		this.skillID = skillID;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
}
