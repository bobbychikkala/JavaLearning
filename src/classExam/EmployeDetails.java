package classExam;

public class EmployeDetails {
	public int  empId;
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	
	private String fullName ;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	private int basic;
	private int hRA;
	
	public void setBasic(int basic) {
		this.basic = basic;
	}

	public void sethRA(int hRA) {
		this.hRA = hRA;
	}

	private int salary ;

	public int getSalary() {
		salary= hRA+basic;
		return salary ;
	}

	
	
	

}
