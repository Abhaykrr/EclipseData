package compeitivePrograming;

import java.util.Scanner;

public class Equality {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();    int q=x.nextInt();
		int a[]=new int[n];
	    for(int i=0;i<n;i++) 
		a[i]=x.nextInt();
	while(q>0) {
		
		
		int count=0;
		int countf=0;
		int l=x.nextInt(); 	int r=x.nextInt();
		for(int i=l-1;i<r-1;i++) {
			if(a[i]>a[i+1])
				count++;
			else
				countf++;
		}
		if(countf==count)
			System.out.println("yes");
		else
			System.out.println("no");
	}
q--;}
}
