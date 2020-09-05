package strings;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
	    String a="abhaykumar1";
		String b="kumarabhay1";
		int count=0;
	char c='a';
	int q=(int) c;
	System.out.println(q);
		int d[]=new int[a.length()];
	
	        	for(int i=0;i<a.length();i++) {
		        for(int j=0;j<b.length();j++) {
		    	  if(a.charAt(i)==b.charAt(j)&&d[j]!=1) {
		    		  d[j]=1;
		    		 count+=1;
		    		 break;
		    		}
		   }
		     
		}	   
		System.out.print(count+" matched ->");
		      if(count==a.length())
		    	  System.out.println("String is anagram");
		 
		      else
		    	  System.out.println("string is not anagram");
		      
		      
		      // Alternative Solution
		      
		     
		                
	}

}
