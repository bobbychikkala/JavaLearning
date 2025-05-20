package externalProblems;

import java.util.Arrays;

public class Array_Problems_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  []a = {2,1,4,5,3,7,9};
		
		reverseArray(a);
		System.out.println(Arrays.toString(a));
		
		
			
		
	}
	
	public static int[] reverseArray(int []a) {
		int temp=0;
		for (int i=0;i<a.length/2-1;i++) {
			
			temp = a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		return a ;
	}

}
