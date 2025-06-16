package externalProblems;

import java.util.HashMap;

public class RepeatationOfElements {

	public static void main(String []args) {
		
		HashMap <String,Integer>hasmap = new HashMap<String,Integer>();
		System.out.println(hasmap);
		int [] arr = {2,3,2,3,1,3,4,3,5,2,6,4};
		boolean[] isAvailable = new boolean[arr.length];
		int counter=0 ;
		for (int i =0 ; i<arr.length;i++) {
			
			if (isAvailable[i]) continue;
			counter=1;
			for (int j=1+i ; j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					counter++ ;
					isAvailable[j]=true;		
				}
				
			}
			System.out.println(arr[i]+"--->"+ counter);
			
		}
		}
		
	}
	
	
	

