package geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesFromSortedarray {

	public static void main(String[] args) {
		int a[]= {1,1,1,1,2,2,2,4,4,4,5,5,5,7,7,100,100};
		int i=0;
	List<Integer> al=new ArrayList<>();
	while(i<a.length-1) {
		if(a[i]<a[i+1])
				al.add(a[i]);
		i++;
	}
	al.add(a[i]);
	System.out.println(i);
System.out.println(al);
	}

}
