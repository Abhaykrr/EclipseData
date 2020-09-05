package rithmalgo;

public class SelectiveSort {

	public static void main(String[] args) {
		 int a[]= {1,2,-1,4,6,23,10};
		int  n=a.length;
		        for(int i=0;i<n-1;i++) 
		        {
		        	           int startindex=i;
			            		for(int j=i;j<n;j++) 
			            		
			            			{
			            				if(a[j]<a[startindex]) 
			            						startindex=j;
			            			}
			            		
			            					int swap=a[i];
			            					a[i]=a[startindex];                
			            					a[startindex]=swap;
			            					
			            				}
			            				
			
		        
		       
		for( int answer : a) {
			System.out.print(answer + "  ");
					}
		        
	}
}
