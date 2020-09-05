package questions;

import java.util.Scanner;

public class ComresstheList {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int good=0;
		int bad=0;
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    array[i]=x.nextInt();
		    
		}
		  for(int i=0;i<n-1;i++)
		   {
		for(int j=0;j<n-1-i;j++){
		    if(array[j+1]==array[j])
		    {
		        int swap=array[j+1];
		        array[j+1]=array[j];
		        array[j]=swap;
		    }
		}
		   }
		for(int i=0;i<n-1;i++)
		{
		    if((array[i+1]-array[i])==2)
		      good++;
		    else
		    	bad++;
		    
		}
	//System.out.println(bad);
	System.out.println(good);
	}

}
