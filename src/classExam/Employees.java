package classExam;

import java.util.Scanner;

public class Employees {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Input the number of Employees");
		int noEmp = sc.nextInt();
		EmployeDetails [] emps = new EmployeDetails[noEmp] ;
		for(int e=0;e<emps.length;e++) {
			
			emps[e] = new EmployeDetails();
			//int empID = settingEmpId(e);
			//emps[e].setEmpId(empID);
			String fullName =settingName(e);
			emps[e].setFullName(fullName);
		}
		
		for(int e=0;e<emps.length;e++) {
			System.out.println(emps[e].getFullName());
		}

	}
	
	private static String settingName(int e) {
		System.out.println(e+1 +" .Enter the Full Name");
		String name =  sc.next();
		 return name ;
		 
	}
	
	/*
	 * private static int settingEmpId(int e) { // emps[e].empId=
	 * 
	 * }
	 */

}
