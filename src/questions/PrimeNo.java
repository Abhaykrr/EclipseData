package questions;
import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		System.out.println("enter a no to check prime number");
		Scanner x=new Scanner(System.in);
	
//		int n=x.nextInt();
		int count=0;
		
	for(int n=2;n<50;n++)
	{
		for(int i=2;i<n-1;i++) {
			if(n%i==0) 
				count+=1;
		}
		
		if(count>0)
		count=0;
		else
			System.out.println( n+" is prime");
		
	}
		
//	char a='t';
//	for(int i=2;i*i<=n;i++) {
//		if(n%i==0) {
//			a='f';
//			break;
//		}}		
//	System.out.println("is prime " +a);
		
		
	}
}

