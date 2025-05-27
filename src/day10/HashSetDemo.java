package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet a = new HashSet();
	
		
		List<Integer> list = Arrays.asList(1,2,4,5,6,4,3);
		
		HashSet <Integer> b = new HashSet(list);
		
		System.out.println(b);
		list = new ArrayList(b);
		System.out.println(list);

	}

}
