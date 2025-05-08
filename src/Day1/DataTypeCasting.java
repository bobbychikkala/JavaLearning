package Day1;

public class DataTypeCasting {
	Object myin = 77;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= (int)45.45 ;
		//System.out.println(a);
		//System.out.print(a);
		
		System.out.println(a);
		short s2 = 136;
		
		byte b2 = (byte)s2;
		
		System.out.println(b2);
		
		
		float  f3 = 333.999f;
		int i3 = (int)Math.ceil(f3);
		System.out.println(i3);
		
		char c ='4';
		int i5 = c;
		System.out.println(i5);

		int num = 1077;  
		Integer objNum = Integer.valueOf(num);  // Convert int to Integer (wrapper)
		System.out.println(objNum);
	
	}


	

}
