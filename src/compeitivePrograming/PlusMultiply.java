package compeitivePrograming;

import java.util.Scanner;

public class PlusMultiply {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int test=x.nextInt();
		while(test>0) {
		int temp;
		int count=0;int cout=0;int ans=0;
		int n=x.nextInt();
		for(int i=0;i<n;i++){
		   temp=x.nextInt();
	   if(temp==2)
   count++;
		   if(temp==0)
		   cout++;
		}
		count=count-1;cout=cout-1;
		ans=(count*count+count)/2+(cout*cout+cout)/2;
		System.out.println(ans);
		ans=0;cout=0;count=0;
		test--;
		}
	}

}
