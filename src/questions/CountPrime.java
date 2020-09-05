package questions;
import java.util.*;

public class CountPrime {

	public static void main(String[] args) {
		System.out.println("enter the last digit upto to count prime no");
		
	Scanner x=new Scanner(System.in);
		int y = x.nextInt();
		int count =0;
		int count1=0;
		int sum=0;
		for(int i=1;i<=y;i++) { 
			
		
			if(i==1||i==2||i==3||i==5||i==7) {
			System.out.println(i);
			count1+=1;}
		           else if(i%2==0 ||i%3==0  || i%5==0 || i%7==0) {}
			else {
				count+=1;
			}
		}
			
							
		sum=count+count1;		
	
			
	
	
		System.out.println("total no of prime numbers are " +sum);
	
	
	
	
	}
		}
	


