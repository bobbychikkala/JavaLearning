package DSA;

import java.util.Stack;

public class PracticeStacksQuie {

	public static void main	(String []args) {
		//System.out.println(0);
		
		Stack <String> stack = new Stack<String>();
		
		stack.push("Badhri");
		stack.push("Balu");
		stack.push("Bobby");
		stack.push("Kumar");
		
		System.out.println(stack);
		var name = stack.peek();
		System.out.println(name);
		var removed = stack.pop();
		System.out.println(removed);
		System.out.println(stack);
		 name = stack.peek();
		System.out.println(name);
		
		stack.add("bb");
	//	stack.clear();
		System.out.println(stack);
		System.out.println(stack.size());
		
		
	}
	
}
