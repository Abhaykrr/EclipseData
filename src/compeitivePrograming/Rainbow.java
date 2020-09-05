package compeitivePrograming;

import java.util.Scanner;

public class Rainbow {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int b=x.nextInt();
		int e=x.nextInt();
		
//		int n=x.nextInt();
//		int a[]=new int[n];
//		int count=0;
//		a[0]=x.nextInt();
//		if(a[0]==1) {
//		for(int i=1;i<n/2;i++) {
//			int r=x.nextInt();
//			if(r==a[i-1]||r==a[i-1]+1)
//				a[i]=r;
//		}
//		a[n/2]=x.nextInt();
//		for(int i=n/2+1;i<n;i++)
//			a[i]=x.nextInt();
//		if(a[n/2]==7)	
//		{
//			for(int i=0;i<=n/2;i++)
//			{
//				if(a[i]==a[n-i-1])
//					count++;
//				else {
//					System.out.println("no");
//					break;
//				}
//					
//			}
//		}
//		System.out.println(count);
//		if(count==n/2)
//			System.out.println("yes");
//			
//		}

	}
	fast_exp(int base, int exp) {
	 int    res=1;
	    while(exp>0) {
	       if(exp%2==1) res=(res*base)%MOD;
	       base=(base*base)%MOD;
	       exp/=2;
	    }
	    return res%MOD;
	}
}
