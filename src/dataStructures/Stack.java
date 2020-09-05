package dataStructures;

public class Stack {

	public static void main(String[] args) {
		
		MyStack stack=new MyStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		int last=stack.peek();
		System.out.println(last);
	}

}
