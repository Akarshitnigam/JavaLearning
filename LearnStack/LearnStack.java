package LearnStack;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		
		//push()
		animals.push("Lion");
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		
		System.out.println("Stack:"+animals);
		
		//peek()
		System.out.println(animals.peek());
		
		System.out.println(animals);
		
		//pop()
		animals.pop();
		System.out.println(animals);
		
		//peek()
		System.out.println(animals.peek());
		
	}
}
