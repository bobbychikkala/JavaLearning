package day12;

import java.util.ArrayList;

public class MaximumSumSubarray {
	public static void main(String[]args) {
		int []a = {-2, -5, 6, -2, -3, 1, 5, -6};
		System.err.println(solution(a));
	}

	private static ArrayList<Integer> solution(int[]nums){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int maxSum = 0,start=0,end=0;
		
		for (int i=0;i<nums.length;i++) {
			int currentSum=0;
			for(int j=i;j <nums.length;j++) {
				
				currentSum+=nums[j];
				if (currentSum >maxSum) {
					maxSum=currentSum;
					start=i;
					end=j;
					}
					
				}
			}
			
		for(int k = start;k<=end ;k++) list.add(nums[k]);
		
		return list;
	}
}
