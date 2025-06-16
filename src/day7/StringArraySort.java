package day7;

import java.util.Arrays;

public class StringArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []a = {"John","Bobby","Balu","Smith","ajay"};
		stringSort(a);
		System.out.println(Arrays.toString(a));
		

	}
	
	static void stringSort(String []a) {
		
		for (int i=0; i<a.length;i++) {
			
			for(int j=0 ; j<a.length-i-1; j++) {
				if(a[j].compareToIgnoreCase(a[j+1])<0) {
					String temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		}
	}


