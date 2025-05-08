package Day2;

public class Loops {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		table(6);

	}



	static void table(final int inputNumber) {

		
		for(int i=1;i<=10;i++)
		{
			System.out.println(String.format("%d  * %d = %d ",i,inputNumber,i*inputNumber));
			
		}
	}
}




