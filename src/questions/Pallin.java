package questions;

import java.util.Scanner;

public class Pallin {

	public static void main(String[] args) {
		System.out.println("enter the no to check pallindrome conditions");
		Scanner x = new Scanner(System.in);
		int number = x.nextInt();
		int y=number;
		int reverse=0;
		
		while(y>0) {
			int lastnumber =y%10;
			reverse=reverse*10+lastnumber;
			y /=10;
			System.out.println(reverse);
		}
		if(reverse==number)
		System.out.println("no is pallindrome");
		else
			System.out.println("not a pallindrome");
	}

}
