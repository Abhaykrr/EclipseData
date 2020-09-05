package arrays;

import java.util.Scanner;

public class SubbarrayWithGivenArray {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int s=x.nextInt();
		int sum=0;
		int temp=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++) 
			a[i]=x.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				sum+=a[j];
				
				if(sum==s) {
					System.out.println(i+1 + " "+ (j+1));
					break;
				}}
			if(sum==s) 
				break;
	
					
			temp=sum;
			sum=0;}
		if(temp!=s) 
			System.out.println(-1);
		//142 112 54 69 148 45
	
	}

}
