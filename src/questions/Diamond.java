package questions;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	System.out.println("enter the base to terminate");
	 
	int n=x.nextInt();
	int num=1;
	//for(int a=1;a>=1;a++)
	{
	    for(int i=1;i<=n;i++) {
	   	 for(int j=1;j<=n-i+1;j++) {
	   		 System.out.print(" ");
	   	 }
	   	 for(int j=1;j<=i-1;j++) {
	   		 System.out.print(num+" ");
	   		 num++;
	    }
	   	 System.out.println();

		
	    }	                     for(int i=1;i<=n;i++) {
		                    	 for(int j=1;j<=i-1;j++) {
		                    		 System.out.print(" ");
		                    	 }
		                    	 for(int j=1;j<=n-i+1;j++) {
		                    		 System.out.print("* ");
		                     }
		                    	 System.out.println();
		
		
	    }		

			}
		
		}
	}

