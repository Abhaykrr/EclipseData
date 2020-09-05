package search;

import java.util.*;

public class Binary_SEARCH {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		 List<Integer> ll=new ArrayList<>();
	        int length=x.nextInt();
	        int ans=0;
	        ll.add(x.nextInt());
	        for(int i=1;i<length;i++){
	            int toAdd=x.nextInt();
	            int size=ll.size();
	                if(ll.get(size-1)>toAdd)
	                ll.add(toAdd);
	        }
	       
	       int q=x.nextInt();
	       for(int j=0;j<q;j++){
	           int item=x.nextInt();
	           System.out.println(search(ll,item));
	       }
	}
	
	
	
public static int search(List<Integer> ll,int data) {
	int left=0;
    int right=ll.size()-1;
int mid;    
    
    if(data<=ll.get(right))
    return ll.size()+1;
    
    if(data>=ll.get(left))
    return 1;
    
    while(true) {
        mid=(right +left)/2;
    
        
        if(data<ll.get(mid)) 
        left=mid+1;
        
        else  if(data>=ll.get(mid)) 
            return mid+1; 
        if(data>ll.get(mid))
            right=mid-1;
    }
}



}
