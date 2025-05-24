package day8;

import java.util.ArrayList;

public class ArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = {1,2,4,5,3,4,6,8,4,3,9,5,2,2};
		arrayFreq(a);
		//ArrayList<Integer> duplicates ;
	}
	
	static void arrayFreq(int []a) {
		ArrayList<Integer> duplicates = new ArrayList<Integer> ();
		boolean [] isVisited =new boolean[a.length];
		for(int i=0; i<a.length;i++) {
			if (isVisited[i]) continue;
			
			int counter=1 ;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					isVisited[j]= true;
					
					counter++ ;
				}
				
			}
			if (counter>1) {
				//System.out.print(a[i]+" ");
				duplicates.add(a[i]);
			}
			//System.out.println(a[i]+" --> "+counter + (counter>1 ?  " times" : " time"));
		}
		System.out.println(duplicates);
		
	
		}
		
	

}
