package compeitivePrograming;

import java.util.Scanner;

public class ThatsMyScore {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int test =x.nextInt();
	
		int m1=0;int m2=0;int m3=0;int m4=0;int m5=0;int m6=0;int m7=0;int m8=0;int m9=0;int m10=0;int m11=0;
		
		
		while(test>0) {
		int n=x.nextInt();
	for(int i=0;i<n;i++) {
		int s=x.nextInt();
		
		int a=x.nextInt();

		switch(s) {
		case 1:{
		if(a>m1)
			m1=a;
		break;
			}
		case 2:{
			if(a>m2)
				m2=a;
			break;
				}
		case 3:{
			if(a>m3)
				m3=a;
			break;
				}
		case 4:{
			if(a>m4)
				m4=a;
			break;
				}
		case 5:{
			if(a>m5)
				m5=a;
			break;
				}
		case 6:{
			if(a>m6)
				m7=a;
			break;
				}
		case 7:{
			if(a>m7)
				m7=a;
			break;
				}
		case 8:{
			if(a>m8)
				m8=a;
			break;
				}
		case 9:{
			m9=0;
			break;
				}
		case 10:{
				m10=0;
			break;
				}
		case 11:{
				m11=0;
			break;
				}
			
		}
		}//for loop

	System.out.println(m1+m2+m3+m5+m6+m7+m8+m10+m11+m9);
	 m1=0;m2=0; m3=0;m4=0; m5=0; m6=0; m7=0; m8=0;m9=0; m10=0; m11=0;
	 n=0;
	 test--;
		}	
	}

}
