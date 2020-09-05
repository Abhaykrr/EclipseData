package rithmalgo;

public class BubbleSort {

	public static void main(String[] args) {
		
		       int a[]= {1,5,3,4};
		       int n=a.length;
		       
		   for(int i=0;i<n-1;i++)
		   {
//		                  boolean sorted=true;
		     for(int j=0;j<n-1-i;j++) {
		    	 if(a[j+1]<a[j]) {                                    //ie if sorted array then it will not enter in the second loop
		    		 int swap=a[j+1];
		    		 a[j+1]=a[j];
		    		 a[j]=swap;
//		    		sorted=false;
		    	
//		    		if(sorted)
//			    		 break;
		    	 }
		    	 
		     }			   }
		for(int answer:a) {
			System.out.print(answer +" ");
											}
		   
	}

}
