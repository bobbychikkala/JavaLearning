package day8;

import java.util.ArrayList;
import java.util.Collections;

public class Listsort_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList <Integer>(); 
			a.add(1);
			a.add(2);
			a.add(30);
			a.add(7);
			a.add(8);
			a.add(6);
			a.add(17);
			a.add(15);
		
		System.out.println(a);
		//a.sort(null);
		Collections.sort(a);
		//sortingList(a);
		System.out.println(a);
		
	}

	static void sortingList(ArrayList<Integer>list) {
		
		for(int i=0;i < list.size();i++) 
		{
		
			for (int j=0;j<list.size()-1-i;j++) 
			{
				if(list.get(j)<list.get(j+1)) 
				{
					int temp = list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1,temp);
				}
			}
		}
	}
}
