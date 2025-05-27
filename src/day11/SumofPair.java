package day11;

import java.util.ArrayList;

public class SumofPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {-3,1,2,3,4,6,5,10,8,-1,-2,9};
		
		ArrayList<ArrayList<Integer>> pairsList =SumofPairs(a,11);
	System.out.println(pairsList);
	
	for(ArrayList<Integer> pair:pairsList)System.out.println(pair);
		
	}
	static ArrayList<ArrayList<Integer>> SumofPairs(int[]a, int targetNumber) {
		
		ArrayList<ArrayList<Integer>> listOfList = new ArrayList<ArrayList<Integer>>();
		
		for (int i=0 ; i<a.length;i++) {
			for (int j=i+1 ; j<a.length;j++) {
				if(a[i]+a[j]==targetNumber) {
					ArrayList<Integer>subList = new ArrayList<Integer>();
					subList.add(a[i]);
					subList.add(a[j]);
					listOfList.add(subList);
				}
			}
		}
		return listOfList ;
	}
	

}
