package day12;

import java.util.ArrayList;

public class MaximumConsecutiveSeq {

	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,13,4,3,4,5,6,17,18};
		// TODO Auto-generated method stub
		System.out.println(solution(a ));
	}
	
	private static ArrayList<Integer> solution(int []a){
		ArrayList <Integer> list = new ArrayList<Integer>();
		int maxLen=0;
		int start=0;
		int end =0;
		for (int i =1 ; i< a.length ;i++) {
			
			int currentCout=0;
			for (int j=i; j<a.length;j++) {
				if(a[j]-1==a[j-1]) {
					currentCout++;
					if(currentCout>maxLen) {
						maxLen =currentCout;
						start =i-1;
						end =j;
					}
					continue;
				}
				break;
			}
		}
		for(int k = start;k<=end;k++)list.add(a[k]);
		return list;
	}

}
