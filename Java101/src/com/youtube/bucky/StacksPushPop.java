package com.youtube.bucky;

import java.util.Stack;


public class StacksPushPop {


	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("bottom");
		printStack(stack);
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
	}
	
	private static void printStack(Stack<String> s){
		if(s.isEmpty()){
			System.out.println("you have nothing on your stack");
		}else{
			System.out.printf("%s TOP\n", s);
		}
		
		
	}
	
	
}
