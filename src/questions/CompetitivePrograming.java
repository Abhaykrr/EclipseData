package questions;
import java.util.*;
import java.math.BigInteger;
class CompetitivePrograming {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int test=x.nextInt();
		int day=1;
		int gram=1;
		int net=0;
		int a=0;
		int count=0;
	while(test>0)
	{
		day=x.nextInt();
	  gram=x.nextInt();
	
		int array[]=new int[day];
		                                             for(int j=0;j<day;j++)
		                              	               array[j]=x.nextInt();
		
		                                                                        net=array[a]-gram;
		                                                                            for(int i=1;i<=day;i++)
		                                {                                           
			                                                                         	if(net>=0)
					                                                                           count++;
			                                                                         	
																										
		                                                                                    if(net<0) {
			                                                                                        System.out.println("NO " + i);
		                                                                                                    	break;    }
	                                                                                                                         	
		
                                                                                             if(i<day)
			                                                                                    net=net+array[i];
		                                                                                     net=net-gram;
			                            	}
	if(count==day)
			System.out.println("YES");
		
		test--;
		
	}
			}
}
