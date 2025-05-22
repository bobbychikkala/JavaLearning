package externalProblems;



public class Pattern {

	public static void main(String []args) {
		reverseTrai(6);
		
		trianglePattern(6);
		
		
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
		// first for loop for number of lines
		for (int i=0;i<n;i++) {
			//second for loop printing '*'  with logic
			for(int j =0;j<(n-i)*2-1;j++) {
				System.out.print("*");
				
			}
			
			System.out.println();
			if(i==n-1) {break ;}
			//3rd for loop printing spaces
			for(int k=0;k<i+1;k++) {
				System.out.print(" ");
			}
			
		}
	}
	
		
	}

