package questions;

import java.util.Scanner;

public class AdvPattern {

	public static void main(String[] args) {
		System.out.print("enter lenght");
		Scanner x=new Scanner(System.in);
		int n = x.nextInt();
		
		
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i-1;j++) {     // i.e 2*i-1 times spaces are print
					System.out.print("  ");
					}
				
				for(int j=1;j<=n-i+1;j++) {
			System.out.print("* ");
		           }
				System.out.println();
		   }

	
	
	
	
	 }
	}


