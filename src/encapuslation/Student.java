package encapuslation;

public class Student {
private int age;
String name;
	public void name(int age) {
		this.age=age;
		System.out.println(age);
	}
	public void setname(int age) {
		if(age>18) {
			System.out.println("you are eligble");
		System.out.println(age);
		}
		else 
		{
		  System.out.println("not eligble");
		System.out.println(age);
		}
	
		
	}
	public void printname()
	{
		System.out.println(age);
	}
}
