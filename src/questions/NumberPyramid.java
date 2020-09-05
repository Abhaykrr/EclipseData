package questions;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		System.out.println("enter the terminating point");
		Scanner x= new Scanner(System.in);
		int n=x.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{
		for(int j=i;j<=i;j++)
		{
		System.out.print(" "+i+ " ");
		
		}
		System.out.println();
		
		}
		
	}

}
