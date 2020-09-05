package questions;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
//		System.out.print("factorial of ");
//		Scanner x= new Scanner(System.in);
//		int y =x.nextInt();	
//		int result =1;
//
//	
//	for(int i=y;i>=1;i--) {
//		
//		result = result*i;
//	}
//		System.out.println("factorial is " +result);
		
		
		
		
		
		System.out.print("enter two numbers a and b so that out comes come to be a^b");
		Scanner x= new Scanner(System.in);
		int a =x.nextInt();	
		int b= x.nextInt();
		int result =1;
	
		
		for(int i=b;b>0;b--) {
			 result *=a;
		}
		System.out.println(result);
}
}