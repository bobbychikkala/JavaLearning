package day8;

import java.util.Arrays;

public class ArrayAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 353, 24, 5, 6, 7, 8, 22, 33 };
		Arrays.sort(a);
	System.out.println(Arrays.toString(a));
		int index =indexNumber(a, 33);
		System.out.println("Index of 33 is :"+index);

	}

	private static int indexNumber(int[] arr, int targetNumber) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == targetNumber) {
				System.out.println("Number Found \nIndext of "+targetNumber+" is " + i);
				return i;
			}

		}
		System.out.println("Number not Found");
		return -1;
	}

}
