package dataStructures;




public class MyQueue {
	
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
			
		}
		
	}
	Node head,rear;
	
	public void enqueue(int data) {
		Node toAdd=new Node(data);
	if(head==null) {
		head=rear=toAdd;
		return ;
	}
		rear.next=toAdd;
		rear=rear.next;
				
		
	}
	
	public int dequeue() {
		if(head==null) {
			return 0;
		}
		Node temp=head;
		head=head.next;
		if(head==null) {
			rear=null;
		}
		
		return temp.data;
	}
	
	
}