package day8;

import java.util.ArrayList;

public class Listsort_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList <Integer> () {{
			add(1);
			add(2);
			add(30);
			add(7);
			add(8);
			add(6);
			add(17);
			add(15);
		}};
		
		sortingList(a);
		System.out.println(a);
		
	}

	static void sortingList(ArrayList<Integer>list) {
		
		for(int i=0;i < list.size();i++) {
		
			for (int j=0;j<list.size()-1-i;j++) {
				if(list.get(j)<list.get(j+1)) {
					int temp = list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1,temp);
				}
			}
		}
	}
}
