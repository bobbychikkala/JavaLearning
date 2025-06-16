package day9;

import java.util.ArrayList;

public class FindNonRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(nonRepeatChar("bobbyKomarykma"));
	}
	
	static char nonRepeatChar(String str) {
		str = str.toLowerCase();
		char [] strAr = str.toCharArray();
		boolean [] isVisited = new boolean[strAr.length];
		ArrayList<Character> charList = new ArrayList<Character>();
		for(int i=0;i<strAr.length;i++) {
			if (isVisited[i]) continue;
			int counter =1 ;
			for(int j=i+1;j<strAr.length;j++) {
				if(strAr[i]==strAr[j]) {	
					isVisited[j]=true;
					counter++;
				}
			}
			if(counter<=1) 
			return(strAr[i]);
			
		}
		
		
		return ' ' ;
	}

}
