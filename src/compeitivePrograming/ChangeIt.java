package compeitivePrograming;

import java.util.Scanner;

public class ChangeIt {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int count=1;
	     int countf=0;
	     int test=x.nextInt();
	     while(test>0) {
	      int n=x.nextInt();
		int array[]=new int[n];
					for(int i=0;i<n;i++) {
								array[i]=x.nextInt();
							}
					
			           for(int i=0;i<n;i++) {
	                                   	for(int j=i+1;j<n;j++) {
				                                    if(array[i]==array[j]) {
														count++;
														}
											}
	                                   	if(count>countf) {
	                                   		countf=count;}
	                                    count=1;
		                                }
			          if(countf==1)
			        	  countf=n-1;
			          else
			        	  countf=n-countf;
							System.out.println(countf);
	countf=0;
	count=1;
	     
	     
	     
	     test--;}}

}
