package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class TimeDiffBetAlAndLinked {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		List<Integer> ll=new LinkedList<>();
	timeDiff(al);
	timeDiff(ll);

	}
static void timeDiff(List<Integer> List) {
	long start=System.currentTimeMillis();
	for(int i=0;i<100000;i++) {
		List.add(i);
		List.get(i);}
		long end=System.currentTimeMillis();
		
	System.out.println(List.getClass().getName()+ " "+ (end-start));
}
}
