package externalProblems;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseNumber(123));
	}
	
	private static int reverseNumber(int input) {	
	
	int result = 0;
	int module;
	
	while(input!=0)
	{
		module =input%10 ;
		input /=10;
		result *=10 ;
		result +=module ;
		
		
	}
	return result ;
	}
	

}
