package externalProblems;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseNumber(563847412));
	}

	private static int reverseNumber(int input) {

	double result = 0;
	int module;

	while(input!=0)
	{
		module =input%10 ;
		input /=10;
		result *=10 ;
		result +=module ;
	//int max=	Integer.MAX_VALUE; 
	}
	System.out.println(result < Integer.MIN_VALUE);
	System.out.println(result >Integer.MAX_VALUE);
	
	return (int)result ;
	}
}
