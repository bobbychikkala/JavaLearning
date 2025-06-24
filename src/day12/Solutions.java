package day12;

import java.util.HashSet;

class Solutions {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		String s="aab";
		System.out.println(lengthOfLongestSubstring(s));
		System.out.println(lengthOfLongSubstring(s));
	}
	
public static int lengthOfLongestSubstring(String s) {
     int maxLen=0;
     String k="";
     for (int i=0 ; i<s.length();i++){
        	int counter =0;
        	HashSet <Character>charList = new HashSet<Character>();
            for(int j=i;j<s.length();j++){
                if(charList.contains(s.charAt(j)))break;
                charList.add(s.charAt(j));
                counter ++;
                if(counter>maxLen) k =s.substring(i,j+1);
                maxLen = Math.max(maxLen, counter);
            }
        }
   // if (maxLen==0) return s.length();
    System.out.println(k);
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