package questions;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		System.out.println("enter");
		int result=0;
	
	
	
	
	Scanner x =new Scanner(System.in);
	int a=x.nextInt();
	int b=x.nextInt();
	int c=x.nextInt();
	
	  
		 if(a>b) 
	           {
		    if(b>c) 
		        result =a;
			else
				result =c;
	            } 
		 
		 
	else{
		if(b>c)
		result=b;
		else
			result=c;
	}
	 
	
		
System.out.println("greatest no is "+ result);


	 
  }
}