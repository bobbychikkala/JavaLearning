package day12;

public class RemoveRepeatativeCharacter {
	public static void main(String[] args) {
		String input = "bobbyyy  kummar";
		String result = removeRepeatChar(input);
		System.out.println(result);
	}

	private static String removeRepeatChar(String input) {
		// TODO Auto-generated method stub
		
		
		char temp = input.charAt(0);
		String result =""+input.charAt(0);
		for (int i=1;i<input.length();i++) {
			
			if(input.charAt(i)==temp) {
				continue;
			}
			result = result+ input.charAt(i);
			temp = input.charAt(i);
		}
		
		return result;
	}

}
