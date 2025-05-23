package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringOperations {


	private static boolean isPolidram(String input) {
		String reverse="";
		for (int i=input.length()-1;i>=0;i--) {
			reverse += input.charAt(i);
		}
		System.out.println(reverse);
		return input.equalsIgnoreCase(reverse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Hello Java Program";
		System.out.println(isPolidram("MadaK"));
		System.out.println(reversWords1(string));
		//System.out.println(string);
		System.out.println(reverseWords(string));
		System.out.println(string);
		reverseString(string);
		System.out.println(string);
	}


	private static String reverseWords(String input) {

		String []words = input.split(" ");
		List <String> wordList = Arrays.asList(words);
		Collections.reverse(wordList);
		return String.join(" ", wordList);
	}

	private static String reversWords1(String input) {
		ArrayList <String> words = new ArrayList<>();
		String temp="";
		input=input+"  " ;
		for (int i =0; i< input.length()-1 ; i++) {

			if (input.charAt(i)==' ') {
				words.add(temp);
				temp="";
				}
			else temp+=input.charAt(i);
		}
		String result="";
		for(var a:words) result=a+" "+result ;
		return result;

	}
	
	
	private static String reverseString(String input) {
		
		char [] wordarray = input.toCharArray();		
		char temp=' ';
		for (int i=0;i<wordarray.length/2-1;i++) {
			temp =wordarray[i];
			wordarray[i] = wordarray[wordarray.length-1-i];
			wordarray[wordarray.length-1-i]=temp;
		}
		return Arrays.toString(wordarray);
		
	}


}
