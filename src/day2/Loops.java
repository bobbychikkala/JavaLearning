package day2;

public class Loops {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		reverseTable(7);

	}



	static void reverseTable(final int inputNumber) {


		for(int i=10;i>0;i--)
		{
			System.out.println(String.format("%d  * %d = %d ",i,inputNumber,i*inputNumber));

		}
	}
}




