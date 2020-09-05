package questions;
import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("enter a number to check pallindrome");
		Scanner x= new Scanner(System.in);
		int y = x.nextInt();
		int result;
		int arm=0;
		int n=y;
		
		
//		for(int i=y;i>0;i=y/10) {
//			result=i%10;
//		arm=arm+(result*result*result);
//		i=y/10;
//		
//			System.out.println(arm);
		while(y>0)	{
		result=y%10;
		arm=arm+(result*result*result);	
		y=y/10;
	System.out.println(arm);
			
		}
		if(arm==n)
		System.out.println("number is armstrong");
		else
			System.out.println("number is not armstrong");
		
		
	
	}

}
