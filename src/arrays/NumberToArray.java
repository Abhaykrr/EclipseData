package arrays;

import java.util.Scanner;

public class NumberToArray {

	public static void main(String[] args) {
Scanner x=new Scanner(System.in);
int i;
int n=x.nextInt();
int count=0;
int b=n;
while(b>0)
{
	b=b/10;
	count++;
	
}
int array[]=new int[count];

for(i=count-1;i>=0;i--)
{
	array[i]=n%10;
	n=n/10;
	
}
for(i=0;i<7;i++)
{if(array[1]==0)
	{     for(int j=2;j<8;j++) {
			System.out.print(array[j]);}
	     	break;}

       if(array[i]>greaternumber) {
          
    	   greaternumber=array[i];
    	   n=i;
       }
	}



if(array[1]!=0) {
for(i=0;i<=7;i++) {
   if(n==i) {
    continue;}
   System.out.print(array[i]);
}

}




	}

}
