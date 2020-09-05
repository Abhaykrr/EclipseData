package questions;

class dog{
int legs;
	
}

public class AApractice {

	public static void main(String[] args) {
		
		dog c=new dog();
		dog d=new dog();
		
		c.legs=4;
		d.legs=5;
//		change(c);
//		System.out.println(c.legs);
//		System.out.println(d.legs);
		swap(c,d);
	
	System.out.println(c.legs + " " + d.legs);
	
		
	}
	static int swap(int a,int b)
	{ 
		int temp=a;
		b=a;
		b=temp;
		return a;
		
	}
 static int swap(dog a,dog b)
 {
	 dog temp=a;
	 a=b;
	 b=temp;
	
	 return 0;
	 
	 
	
 }
 static int change(dog dog1)
 {
	 dog1.legs=10;              // very important
	 return 0;
 }
 
}