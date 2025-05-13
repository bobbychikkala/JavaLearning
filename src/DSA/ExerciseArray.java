package DSA;


import java.util.Arrays;

public class ExerciseArray {
	
	public static void main(String [] args) 
	{
		
		//System.out.print(false);
		
		int[]arr = {4,5,62,67,33,3347,90,628};
		
		int index = linearSearch(arr,9);
		System.out.println(index);
		int maxnumber = findMaxNumber(arr) ;
		System.out.println(maxnumber);
		
		arr.getClass();
		
		Arrays.sort(arr);
		
	}

	private static int findMaxNumber(int[] arr) {
		
		if (arr.length ==0)return -1;
		
		int maxNumber = arr[0];
		for (int i=1;i<arr.length;i++)
		{
			if (maxNumber < arr[i])maxNumber =arr[i] ;
			
		}
		return maxNumber ;
	}

	private static int linearSearch(int[]arr,int targetNumber) {
	
		
		for (int i=0 ; i<arr.length;i++) {
			
			if (arr[i]==targetNumber)  return i ;
		}
		
		
		return -1 ;
			
		
	}



}
