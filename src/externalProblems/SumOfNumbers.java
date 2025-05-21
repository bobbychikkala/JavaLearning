package externalProblems;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfNumber();
	}
	
	private static int sumOfNumber() {
		int result =0;
		Scanner sc= new Scanner(System.in);
		String  input ;
		while(true) {
			System.out.println("Enter the input");
			input = sc.nextLine();		
			if(input.equals("x")) {
				break;
			}	
			try {
				result += Integer.parseInt(input);	}
			catch (Exception d){
				System.out.println("Invalid input");
			}
		}
		System.out.println(result);
		return result;
	}

}
