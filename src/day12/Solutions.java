package day12;

import java.util.ArrayList;
import java.util.HashSet;

class Solutions {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("pwwkewxpw"));
		System.out.println(lengthOfLongSubstring("pwwkewxpw"));
	}
	
public static int lengthOfLongestSubstring(String s) {
     int maxLen=0;
     for (int i=0 ; i<s.length();i++){
        	int counter =1;
        	HashSet <Character>charList = new HashSet<Character>();
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    maxLen = Math.max(maxLen, j-i);
                   break;
                }  
                counter ++;
                if(charList.contains(s.charAt(j)))break;
                charList.add(s.charAt(j));
                maxLen = Math.max(maxLen, counter);
            }
        }
    if (maxLen==0) return s.length();
    return maxLen ;
    }
private static int lengthOfLongSubstring(String s) {
	
	int maxLen =0;
	int left=0;
	String result="";
	HashSet<Character> hashSet = new HashSet<Character>();
	for(int right=0;right<s.length();right++) {
		
		while(hashSet.contains(s.charAt(right))) {
			hashSet.remove(s.charAt(left));
			left++;
			
		}
		hashSet.add(s.charAt(right));
		
		if(maxLen<right-left+1) result = s.substring(left,right+1);
		
		maxLen = Math.max(maxLen, right-left+1);
		
	}
	System.out.println(result);
	return maxLen;
}
}