package compeitivePrograming;

import java.util.Scanner;

public class ChefMagic {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int digit=x.nextInt();
		int lim=1;
		for(int i=0;i<digit;i++) 
			lim=10*lim;
		int a=x.nextInt();
		int s=2*lim+a;
		System.out.println(s);
		int b=x.nextInt();
		int c=lim-b;
		System.out.println(c);
		int d=x.nextInt();
		int e=lim-d;
		System.out.println(e);
		 if(s==a+b+c+d+e)
		System.out.println("1");
		else
			System.out.println("-1");
		
		
	
	}

}
