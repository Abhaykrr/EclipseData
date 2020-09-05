package compeitivePrograming;

import java.util.Scanner;

public class AdditonBinary {

	public static void main(String[] args) {
	     Scanner x=new Scanner(System.in);
	     String a="";
         String b="";
         int answer =0;
        
	     int test=x.nextInt();
	      while(test>0){ 
	    	
           a=x.next();
           x.nextLine();  
           b=x.nextLine();
           
           
            answer=ans(a,b);
		 System.out.println(answer);
		a="";b="";
	    test--;  }
	    
 }
	 
	 
	 
	 
	 
	 static int[] xor(String f,String k,int r) {
		int result[]=new int[2];
		
		System.out.println(f);
		System.out.println(k);
	
		
		
		 String a="";
		 String b="";
	
		 for(int i=0;i<r;i++) {
			 if(f.charAt(i)==k.charAt(i))
				 a=a+"0";
			 else
				 a=a+"1";}
	
		 
	for(int i=0;i<r;i++) {
			if(f.charAt(i)==k.charAt(i)&&f.charAt(i)=='0')
			b=b+"0";
		
		else  if(f.charAt(i)==k.charAt(i))
			b=b+"1";
		else
			b=b+"0";
			
	}
		
   
	Integer i=Integer.parseInt(a,2);
	Integer j=Integer.parseInt(b,2);
	j=j*2;
	result[0]=i;
	result[1]=j;
	                            return result;
	 }
	 
	
	 
	 
	 
	 
	 
	 static int  ans(String z,String v) {
		 String e="";
		 String l="";
		 String g="";
		 int diff=0;
		 int t=0;
		 int greatest=0;
		
		int c=0;
		 c=Integer.parseInt(v,2);
		 
			                      	 
	while(c>0) {
		
		int  x=z.length();
		int y=v.length();
		 //  if(x!=y) {
					if(x>y) {
							diff=x-y;
							l=v;for(int i=0;i<diff;i++)
								e=e.concat("0");
				             g=e+l;
				             v=g;
								greatest=x;}
											else if(x<y) {
											
												diff =y-x;l=z;
											
												for(int i=0;i<diff;i++)
				   									e=e.concat("0");
		   						              g=e+l;
		   						              z=g;
												      greatest=y;}//}
											if(x==y)
												greatest=x;
					
		
		 int[] result	=xor(z,v,greatest);
		System.out.println(result[0]);
		System.out.println(result[1]);
	//	int q=result[0];  changes
		c=result[1];
		z="";
		v="";
		e="";
		z=Integer.toBinaryString(result[0]);
		v=Integer.toBinaryString(c);
		t++;}
		
	
		                                   return t;
	 }
	 
	 
	 
	 
	 
	 
}