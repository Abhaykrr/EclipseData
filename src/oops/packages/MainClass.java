package oops.packages;

import oops.packages.models.*;                              //all class under models will be included
//import oops.packages.models.Teacher;
//import oops.packages.models.Student;
public class MainClass {

	public static void main(String[] args) {
		
		Student obj =new Student("abhay");
		
		
		obj.name="shubham";
		obj.getname("itm");
		obj.getpassword();
		Teacher teacher =new Teacher();
		
	}

}
