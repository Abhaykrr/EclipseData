package arrays;

import java.util.Scanner;

public class DElInst {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=x.nextInt();
		int s=x.nextInt();
		for(int i=s-1;i<n-1;i++) {
			a[i]=a[i+1];
		
		System.out.println(a[i]);}

		
	}

}
