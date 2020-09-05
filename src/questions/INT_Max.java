package questions;

import java.util.Scanner;

public class INT_Max {

	public static void main(String[] args) {
	Scanner x= new Scanner(System.in);
																						System.out.println("how many numbers to compare");
	int n= x.nextInt();
	int number[]=new int[n];
																				System.out.println("enter the numbers to compare");
	for(int i=0;i<n;i++) {
		number[i]=x.nextInt();
		}
	
		
		int max=1;//Integer.MIN_VALUE;
		int min=1;//Integer.MAX_VALUE;

	
for(int i=0;i<n;i++) {
	if(number[i]>max)
		max=number[i];
		
}	
	for(int i=0;i<n;i++) {
			if(number[i]<min)
	min=number[i];	}
	System.out.println("max is"+ max);
		System.out.println("min is" +min);
	}

}
