package day10;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer> () {{
			add(5);
			add(3);
			add(4);
			add(3);
			add(10);
			add(5);
			add(4);
			add(5);
		}};
		
		System.out.println(freqEle(list));

	}
	
	static HashMap <Integer,Integer> freqEle(ArrayList <Integer> list){
		
		HashMap <Integer,Integer> map = new HashMap <Integer,Integer>();
		
		for(int a:list) {
			
			if(!map.containsKey(a)) {
				map.put(a, 1);
				continue ;
			}
			map.put(a,map.get(a)+1 );				
		}
		
		for(var key:map.keySet()) {
			String time =map.get(key)>1 ?"times":"time" ;
			System.out.println(key + " : "+ map.get(key)+" "+time);
		}
		
		return map;
	} 

}
