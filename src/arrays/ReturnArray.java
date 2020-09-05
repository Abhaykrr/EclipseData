package arrays;

import java.util.*;

public class ReturnArray {

	public static void main(String[] arg) {
		Scanner x=new Scanner(System.in);
	    String s1=x.next();
	    String ans="";
	    boolean isFound=false;
	    
	    for(int i=0;i<s1.length()-1;i++) {
	    	if(s1.charAt(i)=='x')
	    		isFound=true;
	    	if(isFound==true)
	    	ans+=s1.charAt(i+1);
	    }
	    System.out.println(ans);
	    
	   
	}
	
  
}
 