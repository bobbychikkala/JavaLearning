package ExternalProblems;

import java.util.Arrays;

public class ArrayProblems_2 {
	
	public static void main(String []args) {
		
		int[]a = {1,3,4,5,6,7,9,6,8};
		
		reverseArray(a);
		System.out.println(Arrays.toString(a));
		
	}

	private static int[] reverseArray(int[] a) {
		// TODO Auto-generated method stub
		
		int start=0 ;
		int end = a.length-1 ;
		
		while(start<end) {
			
			a[start]=a[start]+a[end];
			a[end]=a[start]-a[end];
			a[start]=a[start]-a[end];		
			start++ ;
			end-- ;
			
		}
		return a;
	}
	
}
