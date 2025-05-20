package day2;

import java.util.Scanner;

public class Assignments {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {


		validNumber();

		printEvenNumbers(150,110);


	}

	static void printEvenNumbers(int a, int b)
	{
		int smallNumber =a ;
		int largeNumber =b ;

		if (a>b)
		{
			smallNumber =b ;
			largeNumber =a ;

		}
		while(smallNumber<=largeNumber) {

			/*
			 * if(smallNumber%2==0) { System.out.println(smallNumber); }
			 */
			System.out.println((smallNumber%2==00)? smallNumber :"" );
			smallNumber++;
		}


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




}
