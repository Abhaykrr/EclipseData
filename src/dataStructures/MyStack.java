package dataStructures;



public class MyStack {
	MyLinkedList ll=new MyLinkedList();

	void push(int data) {
		ll.add(data);
	}
	 void pop() {
		 ll.pop();
	 }
	 int peek() {
		int y= ll.peek();
		return y;
	 }
	
	
	public static void main(String[] args) {
	
	}

}
