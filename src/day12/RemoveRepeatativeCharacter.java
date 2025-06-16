package day12;

public class RemoveRepeatativeCharacter {
	public static void main(String[] args) {
		String input = "bobbyyy  kummar";
		String result = removeRepeatChar(input);
		System.out.println(result);
	}

	private static String removeRepeatChar(String input) {
		// TODO Auto-generated method stub
		char[]charArray =input.toCharArray();
		
		char temp = charArray[0];
		String result =""+temp;
		for (int i=1;i<charArray.length;i++) {
			
			if(charArray[i]==temp) {
				continue;
			}
			result = result+ charArray[i];
			temp =charArray[i];
		}
		
		return result;
	}

}
