package compeitivePrograming;

import java.util.Scanner;

public class Augustcookoff { ///Ac 

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int test=x.nextInt();
		while(test-->0){
		    int length=x.nextInt();
		    int weight=x.nextInt();
		    int arr[]=new int[length];
		    int ans=0;
		    int count=1;
		    int pw=0;
		    int sam=0;
		    
		    for(int i=0;i<length;i++){
		    arr[i]=x.nextInt();
		    if(arr[i]==weight)
		    	sam+=1;
		    if(arr[i]>weight)
		    ans=-1;
		    }
		    if(ans!=-1){
		    for(int i=0;i<length;i++){
		       
		        pw+=arr[i];
		        if(pw>weight){
		        pw=arr[i];
		        count++;
		        }
		        
		        
		    }
		    ans=count;
		    }
		    if(sam==weight)
		    	ans=length;
		    System.out.println(ans);
		}
			
			

	}

}
