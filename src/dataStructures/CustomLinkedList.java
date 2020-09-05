package dataStructures;

public class CustomLinkedList {
	
	public class Node {
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data=data;
			next=null;
			prev=null;
		}
		
						}
	Node Head;
	
	////////////////////////////////////////////////////////////////////////////////////////////
	
	Node Add(int data) {
		Node toAdd=new Node(data);
		Node P1=Head;
		if(Head==null) {
			Head=toAdd;
			return Head;
			}
		else {
			while(P1.next!=null)
				P1=P1.next;

			P1.next=toAdd;
		}
		
	return Head;
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	void Print(){
		Node P1=Head;
		while(P1.next!=null){
			System.out.println(P1.data);
			P1=P1.next;
		}
		System.out.println(P1.data);
		
	}
	///////////////////////////////////////////////////////////////////////////////////////////////
	
	void Set(int value,int position) {
		Node p1=Head;
		Node toAdd=new Node(value);
	if(position>1) {
		for(int i=0;i<position-2;i++) 
			p1=p1.next;
		
		toAdd.next=p1.next;
		p1.next=toAdd;
	}
	else {
		Head=toAdd;
		toAdd.next=p1;
	}
	}
	///////////////////////////////////////////////////////////////////////////////////////////////
	void revPrint(Node Head) {
		Node p1=Head;
		if(p1.next==null) {
			System.out.println(p1.data);
			return;
			}
		revPrint(p1.next);
		System.out.println(p1.data);
		
	}
	///////////////////////////////////////////////////////////////////////////////
	Node reverse() {   //   loop method
	Node current=Head;
	Node next=null;
	Node prev=null;
	
	while(current.next!=null) {
	next=current.next;
	current.next=prev;
	current.prev=next;
	prev=current;
	current=next;	
	}
	
	current.next=prev;
	current.prev=null;
	Head=current;
	return Head;
		
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	void reverseREc() {
	
	}
		
		
	
/////////////////////////////////////////////////////////////////////////////////////////////
	//Doublely Linked List Methods
	Node AddDouubly(int data) {
		Node p1=Head;
		Node toAdd=new Node(data);
		Node prev=null;
		
		if(Head==null) {
			Head=toAdd;
			return null;
		}
		else {
			while(p1.next!=null) {
				prev=p1;
				p1=p1.next;
			}
			p1.next=toAdd;
		    p1.prev=prev;
		}
		return Head;
	}
	
	void SetDoubly(int data) {
		Node p1=Head; //Added in sorted form
		Node toAdd=new Node(data);
		Node temp=null;
		
		if(p1.data>data) {
			temp=Head;
			Head=toAdd;
			toAdd.next=temp;
			return;
		}
		
		while(p1.next!=null) {
			if(p1.next.data>=data) {
				temp=p1.next;
				p1.next=toAdd;
				toAdd.next=temp;
				toAdd.prev=p1;
				return;
			}
			p1=p1.next;
		}
		p1.next=toAdd;
		toAdd.prev=p1;
		
		
	}
///////////////////////////////////////////////////////////////////////////////////////////////
}