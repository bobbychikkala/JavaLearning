package day3;

public class Problem1 {

	static int hCM(int a, int b)
	{
		int smallerNumber=b ;

		if (a<b)
			smallerNumber=a ;	
		int result =1;
	 for(int i=1;i<=smallerNumber;i++){
		 if(a%i==0 && b%i==0) {
			 result = i ;
		 }
	 }
		return result ;
	}



	static int lCM(int a , int b)
	{
		int greatestNumber=b;
		int result ;
		if(a>b)
			greatestNumber =a;
		
		while(true) {
			if(greatestNumber%a==0 && greatestNumber%b==0) {
				result=greatestNumber;
				break;
			}

			greatestNumber++ ;

		}

		return result ;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 25 ;
		int b = 100 ;
		System.out.printf("HCM of %d and %d is %d ",a,b,hCM(a,b));
		System.out.println();
		System.out.printf("LCM of %d and %d is %d ",a,b,lCM(a,b));

	}


}
