package list;


import java.util.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class LinkedL {

	public static void main(String[] args) {
	int a[]= {-1,2,3,-5};
	int length=a.length;
int currentSum=0;
int max=Integer.MIN_VALUE;  
for(int i=0;i<length;i++) {
	currentSum+=a[i];
	if(currentSum>max)
		max=currentSum;
		
		if(currentSum<0)
			currentSum=0;
	
	
	
}

	
	
//	int max=Integer.MIN_VALUE;
//	for(int i=0;i<length;i++) {
//		int current_Sum=0;
//		for(int j=i;j<length;j++) {
//			current_Sum+=a[j];
//			if(current_Sum>max)
//				max=current_Sum;
//		}
//		
//	}
	System.out.println(max);
	
	}

}
