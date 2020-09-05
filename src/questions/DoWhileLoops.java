package questions;

import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner x= new Scanner(System.in);
		int y = x.nextInt();
		int sum=0;
		
		do{
			int lastdigit =y%10;
			y /=10;
			sum +=lastdigit;
		}while(y>0);
	System.out.println("sum of digits =" + sum);
	}

}
