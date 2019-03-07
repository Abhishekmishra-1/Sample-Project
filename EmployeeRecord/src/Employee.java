public class Employee {
	public static void main(String args[]) {
		Manager m = new Manager();
		m.setEmpId(1001);
		m.setEmpName("Manoj");
		m.setDesignation("Operations Manager");
		m.setSalary(55000.00f);
		//Member variable available only for the Manager class
		m.setNoOfReportees(20);
		
		m.applyLeave("12-March-2019");
		
		Trainer t = new Trainer();
		t.setEmpId(5001);
		t.setEmpName("Tarun");
		t.setDesignation("Senior Facilitator");
		t.setSalary(30000.00f);
		//Member variable available only for the Trainer class
		t.setSkillSet("Java, C++, Python");
		
		t.applyLeave("15-March-2019");
		//Member function available only for the Manager class
		m.approveLeave("Tarun","15-March-2019");		
	}
}

class EmployeeRecord {
	
	int empId;
	String empName;
	String designation;
	float salary;
	
	void applyLeave(String date) {
		System.out.println(empName+" has applied for leave on "+date);
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}	
}
//Manager class inherit EmployeeRecord
class Manager extends EmployeeRecord {
	int noOfReportees;
	
	public void approveLeave(String empName, String date) {
		System.out.println("The leave applied by "+empName+" on "+date+" is approved");
	}
	
	public int getNoOfReportees() {
		return noOfReportees;
	}

	public void setNoOfReportees(int noOfReportees) {
		this.noOfReportees = noOfReportees;
	}
}
class Trainer extends EmployeeRecord {
	String skillSet;
	
	public void training() {
		System.out.println(empName+" can train on the "+skillSet+" topics.");
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
}
