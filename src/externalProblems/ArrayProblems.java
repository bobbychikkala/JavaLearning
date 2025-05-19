package externalProblems;

import java.util.Scanner;

public class ArrayProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ArrayProblems ob =new ArrayProblems();
		ob.signleDimenArray();
		ob.twoDimenArray();
	}	
	@SuppressWarnings("unused")
	private void signleDimenArray() {		
		int [] a =  new int [100];		
		for (int i=0 ; i<a.length;i++)a[i]=2*i ;
		for (int j:a)System.out.println(j);
	}
	
	private void twoDimenArray() {
		Scanner scanner = new Scanner(System.in);	
		println("Enter the number of rows");
		int row = scanner.nextInt();
		println("Enter the number of columns");
		int col = scanner.nextInt();
		int [][] a = new int [row][col] ;
		//System.out.print(a.length);		
		int v=0;
		for(int r=0; r<a.length ;r++) {
			for(int c=0; c<a[r].length;c++) {		
				a[r][c]=++v ;
				print(a[r][c]+"  ");
			}
			println("");
		}
		
	}

	private static void print(Object input) {
		System.out.print(input);
	}
	private static void println(Object input) {
		System.out.println(input);
	}
}
