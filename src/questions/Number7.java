package questions;

import java.util.Scanner;

public class Number7 {

	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int m=x.nextInt();
	int count=0;
	int temp=0;
	int net=0;
	int j;
	int i;
	for(i= n;i<=m;i++)

	{
		j=i;
	while(j>0)
	{
		int r=j%10;
		if(r==7) 
			count++;
		else if(r==0) 
			temp++;
		j=j/10;
	}
	
	                     if(count>0&&temp==0) {
                                net++;

		                    System.out.println("magical no");    
	                     }
	                     count=0;
	                 	temp=0;
 }
	System.out.println(net);
	}
}
