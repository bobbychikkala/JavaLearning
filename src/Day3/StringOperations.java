package Day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringOperations {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "Hello Wolrd !";
		 
		
		
		// printing the string length
		
		System.out.println(string.length());
		
		// string iteration
		String reverse="";
		for(int i =string.length()-1; i>=0;i--){
			//System.out.println(string.charAt(i));
			reverse+=string.charAt(i);
		}
		
		//System.out.println(reverse);
		
		System.out.println(isPolidram("Madam"));
		
		System.out.println(reverseWords("Hello Java Program"));

	}
	
	private static boolean isPolidram(String input) {
		
		String reverse="";
		input =input.toLowerCase();
		for (int i=input.length()-1;i>=0;i--) {
			
			reverse += input.charAt(i);
			
		}
		
		return input.equals(reverse);
	
	}
	

	private static String reverseWords(String input) {
		
		String []words = input.split(" ");
		List <String> wordList = Arrays.asList(words);
		
		
		
		Collections.reverse(wordList);
		
		return String.join(" ", wordList);
		
		
		
	}
	
}
