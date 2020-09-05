package questions;

import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
	Scanner x =new Scanner(System.in);
	System.out.println("enter number");
	int n=x.nextInt();
	
	int max=Integer.MIN_VALUE;
	int a[]= {1,-4,-3,-2,4,-5,5,6};
	int s=a.length;
	for(int i=0;i<=s;i++) {
		                            for(int j=i;j<s;j++) 
		                   {
		                                            	int currentsum=0;
	                                                 	for(int k=i;k<=j;k++)
	                                                 	{
			                                                currentsum +=a[k];
	                                                                                      	}
		
	
		if(currentsum>max)
			max=currentsum;
		}
	}
	
	
		System.out.print(max);
	
}
}
