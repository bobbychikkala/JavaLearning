package externalProblems;



public class Pattern {

	public static void main(String []args) {
		reverseTrai(6);
		//System.out.println();
		trianglePattern(6);
		//revTraig(5);
		//triag(5);
	}
	
	public static void trianglePattern(int n ) {
	
		
		for(int i=0 ;i<n;i++) {
			
			
			for(int j=0; j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		
		}
	}
	
	static void reverseTrai(int n) {
		
		for (int i=0;i<n;i++) {
			for(int j =0;j<(n-i)*2-1;j++) {
				System.out.print("*");
				
			}
			
			System.out.println();
			if(i==n-1) {break ;}
			for(int k=0;k<i+1;k++) {
				System.out.print(" ");
			}
			
		}
	}
	
	static void triag(int n) {
		
		for (int i=0;i<n;i++) {
			
			for (int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for (int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	static void revTraig(int n) {
		
		for(int i =0 ; i<n;i++) {
			for (int j=0; j<(n-i)*2-1;j++) System.out.print("*");
				System.out.println();
			for (int k=0;k<i+1;k++)	System.out.print(" ");
		}
		
		}
	}

