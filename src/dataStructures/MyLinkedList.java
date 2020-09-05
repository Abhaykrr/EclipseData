package dataStructures;

public class MyLinkedList {
	
	 class Node{
	int data;
	Node next;
	Node prev;
	
	Node(int data){
		this.data=data;
		next=null;
		prev=null;
	}

	}       
	
	Node head;
	Node head1;
	
	//////////////////////////////////////////////////////////
	void  reversePrint(Node head) {
		if(head==null) {                           //  iterative method
			return;
		}
		
		reversePrint(head.next);
		System.out.println(head.data);
	}
	
	/////////////////////////////////////////////////////////////
	  void getNode(Node head, int positionFromTail) {
		 int m=1;
		 Node p=head;
		 while(p.next!=null){
		 m+=1;
		 p=p.next;}
		 int i=m-positionFromTail;
		 while(i>0){
		     head=head.next;
		     i--;
		 }
		System.out.println(head.data);

		     }
	
	
	/////////////////////////////////////////////////////////
 static Node reverse(Node head) {
	
	Node current=head,next=null,prev=null;
	

		while(current.next!=null) {
     	next=current.next;
     	current.next=prev;
     	prev=current;
     	current=next;
		
		
				
			 }
		next=current.next;
     	current.next=prev;
     	prev=current;
     	current=next;
		
head=prev;
	
	return prev;	 
	}
	//////////////////////////////////////////////////////////////////
	 void remove(int data) {
	    	int i=0;
	    	Node n=head;
	    	for(i=0;i<data-2;i++) {
	 
	    		 n=n.next;
	    	}
	    	n.next=n.next.next;
	    }
	    
	 
	 Node reverseR(Node head) {
		 Node ans=null;
		 if(head==null||head.next==null) {
			 ans=head;
			 return ans;
		 }
	ans= reverseR(head.next);
		 head.next.next=head;
		
		 head.next=null;
			 
		 
		 
		 return ans;
	 }
	void delduplicates(Node head) {
		
		while(head.next!=null) {
			if(head.data==head.next.data) 
				head.next=head.next.next;
			else
				head=head.next;
		}
		
	}
/////////i///////////////////////////////////////////////////////////
	
	
   void add(int data) {
	Node toadd=new Node(data);
	if(head==null) {
		head=toadd;
		return;
	}
	
	else
	{
		Node n1=head;
		while(n1.next!=null) {
			n1=n1.next;
			
		}
		n1.next=toadd;
	}
}

   
   
   /////////////////////////////////////////////////////////////////

   void show() {
   	 Node n1=head;
   	 while(n1.next!=null) {
   		 System.out.println(n1.data);
   		 n1=n1.next;
   	 }
         System.out.println(n1.data);
            }
  
   //////////////////////////////////////////////////////////////////
   void set(int data,int value) {
   	Node n=head;
   	Node n1 =new Node(value);
   	int i=0;
   	for(i=0;i<data-2;i++)
   		n=n.next; 
  n1.next=n.next;
  n.next=n1;
  
   	
   }
   /////////////////////////////////////////////////////////
   //     doubly linkedList        ///////////////
   void addDoubly(int data) {
	   Node toAdd=new Node(data);
	   if(head1==null) {
		   head1=toAdd;
		   return;
	   }
	   Node p1=head1;
	   while(p1.next!=null)
		   p1=p1.next; 
	   p1.next=toAdd;
	   toAdd.prev=p1;

	    
   }
   ////////////////////////////////////////////////////////////////
   void showDoubly() {
	   Node p1=head1;
	   while(p1.next!=null) {
		   System.out.println(p1.data);
		   p1=p1.next;
	   }
	   System.out.println(p1.data);
   }
   
   void reverseDoubly() {
	   Node p1=head1;
	   while(p1.next!=null) {
		   p1=p1.next;
		    }
	    while(p1.prev!=null) {
		   System.out.println(p1.data);
		   p1=p1.prev;
	   }
	   System.out.println(p1.data);
   }
   
   /////////////////////////Stack Implementation////////////////////////////////
   
   void pop() {
	   Node p1=head;
	   while(p1.next.next!=null) {
		   p1=p1.next;
	   }
	   p1.next=null;
   }
   
   
   int  peek() {
	   Node p1=head;
	   while(p1.next!=null) {
		   p1=p1.next;
		   
	   }
	   return p1.data;
   }
   /////////////////////////////////////////////////////////////////
   void  reorder() {
	   
	   Node p1=head;
	   Node p2=head;
	 
	   while(p2!=null&&p2.next!=null&&p2.next.next!=null) {
		    p1=p1.next;
		   p2=p2.next.next;
	   }
	   
	  p2=head;
	 Node p3 =p1.next;
	
	    p1.next=null;
	   // System.out.println(p3.data);
	  Node current=p3;
	   Node next=null;
	   Node prev=null;

while(current!=null) {
	next=current.next;
	current.next=prev;
	prev=current;
	current=next;
	
}
	
p3=prev;
head=p2;
Node nextp3=null; 
next=null;
prev=null;
while(p2!=null) {
	if(p3==null) break;
	next=p2.next;
	nextp3=p3.next;
	p2.next=p3;
	p3.next=next;
	p2=next;
	p3=nextp3;

}

    
    }
   
   //////////////////////////////////////////////////////////////
   boolean ispallindrome() {
	   Node p1=head;
       Node p2=head;
     if(head.next==null)
    	 return true;
       while(p2!=null && p2.next!=null&&p2.next.next!=null){
           p1=p1.next;
           p2=p2.next.next;
           
       }
       p2=head;
       System.out.println(p1.data);
       Node prev=null;
       Node current=p1.next;
       Node next=null;
         p1.next=null;
 
       while(current.next!=null){
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
           
       }
       next=current.next;
       current.next=prev;
       prev=current;
       current=next;
       p1=prev;

        while(p2!=null&&p1!=null){
            if(p2.data!=p1.data)
            return false;
            p1=p1.next;
            p2=p2.next;
        }
      
        return true;
   }
   
   
   void AddOne() {
	   Node p1=head;
	   while(p1.next!=null) {
		   p1.data+=1;
		   p1=p1.next;
	   }
	   
   }
}
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    

