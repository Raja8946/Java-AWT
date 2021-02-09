package collection_framework_demo_program;

import java.util.Stack;

public class Stack_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack< Object> stack = new Stack<Object>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.search("A"));
		System.out.println(stack.search("Z"));
		stack.pop();
		System.out.println(stack);

	}

}
