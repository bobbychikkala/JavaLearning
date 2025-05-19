package day2;

public class ConditionalStatemetn {

	public static void main(String[] args) {
		
		//short age = 17;
		
		
		
		String studenGrade = grading(9);
		System.out.println(studenGrade);
	}

	
	public static String grading(int marks) {
		String grade ="F";
		if (marks >= 90) {grade = "A";}
		else if (marks < 90 && marks >=80) 
		{
			grade = "B";
		}
		else if (marks < 80 && marks >=70)
		{
			grade = "C";
		}
		else if (marks < 70 && marks >=60) 
		{
			grade = "D";
		}
		else   {
			grade = "F";
		}
		
	
		return String.format("Grade is '%s' and marks are %d", grade,marks);
	}
	
}
