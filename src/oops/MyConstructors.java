package oops;
class bike{
	int tyre;
	int headlight=8;
	String color;                            //this.variable is used for specifing the variable
	bike(int tyre)                           //constructors overloading
	{                                            // if there are no constructors then you can call default constructors but if 
	this.tyre=tyre;                          // you have created any of the constructors then default constructors could not be called
	headlight=2;
	}
	bike(int tyre, String color)
	{
		this.tyre=tyre;
		this.color=color;
		headlight=2;
	}
}
public class MyConstructors {

	
	
	public static void main(String[] args) {
	
	bike r15=new bike(2);
	bike b=new bike(3);
	bike c=new bike(4, "red");
	System.out.println(r15.tyre);
	System.out.println(b.headlight);
	System.out.println(c.color);
	System.out.println(c.tyre);
	}

}
