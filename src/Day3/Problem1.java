package Day3;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100 ;
		int b = 64 ;
		System.out.printf("HCM of %d and %d is %d ",a,b,hCM(a,b));
		System.out.println();
		System.out.printf("LCM of %d and %d is %d ",a,b,lCM(a,b));

	}
	
	
	
	static int hCM(int a, int b)
	{
		int smallerNumber ;
		
		if (a<b)
			smallerNumber=a ;
		else
			smallerNumber=b ;
		int result =1;	
	 for(int i=1;i<=smallerNumber;i++) 
	 {
		 
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
}
