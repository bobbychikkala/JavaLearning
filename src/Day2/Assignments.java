package Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignments {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		//validNumber();
		
		//printEvenNumbers(1,50);
		List <Integer> list =printEvenNumbers(150,110);
		System.out.println(list);
		
		
	}
	
	static void validNumber() 

	{
		int number ;
		
		do
		{
			System.out.println("Enter the between 1-10 number");
			number = scanner.nextInt();
		}
		while (number<1 || number >10 );
		
	}

	static List<Integer> printEvenNumbers(int a, int b) 
	{	
		int smallNumber =a ;
		int largeNumber =b ;
		ArrayList<Integer> list = new ArrayList<>();

		if (a>b) 
		{
			smallNumber =b ;
			largeNumber =a ;

		}
		while(smallNumber<=largeNumber) {

			
			  if(smallNumber%2==0)  list.add(smallNumber);
			 
			
			//System.out.println((smallNumber%2==00)? smallNumber :"" );
			smallNumber++;
		}

		return list ;
	}
}
