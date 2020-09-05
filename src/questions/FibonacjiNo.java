package questions;
import java.util.Scanner;

public class FibonacjiNo {

	public static void main(String[] args) {
		System.out.print("enter two numers for fibonachi series");
Scanner x = new Scanner(System.in);
System.out.print("no 1---");
int a=x.nextInt();
System.out.print("no 2---");
int b=x.nextInt();
System.out.print("how often you want to terminate : ");
int n =x.nextInt();

System.out.print(a+" ");
System.out.print(b+" ");

        for(int i=0;i<=n-3;i++) {
        	int c =a+b;
        	
        	System.out.print(c+" ");
        	a=b;
        	b=c;
        }

		
System.out.println("the no is " + a);
	}

}
