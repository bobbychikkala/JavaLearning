package day8;

public class ArrayAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 22, 33 };
	
		int index =indexNumber(a, 33);

	}

	private static int indexNumber(int[] arr, int targetNumber) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == targetNumber) {
				System.out.println("Number Found \nIndext of Number is " + i);
				return i;
			}

		}
		System.out.println("Number not Found");
		return -1;
	}

}
