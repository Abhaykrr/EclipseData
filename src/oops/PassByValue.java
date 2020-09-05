package oops;

public class PassByValue {
class dog{
	int legs;
	

}
	public static void main(String[] args) {
		dog a=new dog();
		a.legs=5;
		dogsswap();
	}


	void dogswap(dog a, dog b)  
	
	{
		dog temp=a;
		a=b;
		b=temp;                      
	}
}
  
