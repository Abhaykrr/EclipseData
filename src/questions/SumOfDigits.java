package questions;
import java.util.*;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner x= new Scanner(System.in);
		int y = x.nextInt();
		int sum=0;
		int pallindrome=0;
		
		
		for(int i=y;i>0;i=i/10) {
			 int result=i%10;
			 sum =  sum + result;
			 pallindrome=(result*10);
			 System.out.println(pallindrome);
			 
		}
		System.out.println(pallindrome);
		System.out.println("sum of the digits is " + sum);    //sum of the digits
		if(pallindrome==y)
			System.out.println("the no is pallindrome");
		else
			System.out.println("the no is not a pallindrome");
		
	}

}
