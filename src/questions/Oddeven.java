package questions;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter");
		float y=x.nextFloat();
		
		int a=(int)y;
		if(a==y) {
			if(a%2==0) {
				System.out.println("even");
			}
			else
				System.out.println("odd");
		}
		else
			System.out.println("re enter");
	}

}
