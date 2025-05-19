package day3;

import java.util.Scanner;

public class StringBuilderOperations {
    private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "Welcome to the JAVA Programming";
		
		
		StringBuilder sb = new StringBuilder(string);
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		
		
		String x = scanner.next();
		
		int number = Integer.parseInt(x);
		
		
	}

}
