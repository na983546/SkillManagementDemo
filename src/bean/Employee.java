package bean;

public class Employee {
	
	private int empID;
	private String empName;
	private String location;
	
	public Employee() {
		super();
	}

	public Employee(int empID, String empName, String location) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.location = location;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
