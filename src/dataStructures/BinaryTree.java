package dataStructures;

import java.util.Scanner;

public class BinaryTree {

	public static void main(String[] args) {                            
	
		Node ans=Node.CreateT();
		
	}
	
	
}
 
class Node{
	int data;
	Node right,left;
	
	public Node(int data) {
		this.data=data;
	}
	
	static Node CreateT() {
		Scanner sc=new Scanner(System.in);
		Node root=null;
		
		System.out.println("enter data");
		int data=sc.nextInt();
		if(data==-1) return null;
		root=new Node(data);
		
		System.out.println("Left of " +data);
		root.left=CreateT();
		
		System.out.println("Right of " +data);
		root.right=CreateT();
		                           
	return root;
			}
}

