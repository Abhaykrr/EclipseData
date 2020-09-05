package dataStructures;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.add(12);
		q.add(15);
		q.add(16);
		q.add(17);
		q.add(18);
		System.out.println(q.element());
		q.remove();
		System.out.println(q.element());
		
	}

}
/*functions of queue                     return false
 * add                                       offer
 * remove                                   poll
 * element                                   peek
 * 
 * 
 * 
 * 
 * 
 * 
*/
