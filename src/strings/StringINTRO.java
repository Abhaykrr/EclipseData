package strings;

public class StringINTRO {

	public static void main(String[] args) {
		String name="     abhay kumar";
		
		String name2=new String("abhay");
	   
		
		
//		name="kumar";
	
//		String name1="abhay";
//		System.out.println(name.contains("kumar"));
		
									//strings functions 
		
	System.out.println("1-->" +name.charAt(0));
	System.out.println("2-->" +name.length());
	System.out.println("3-->" +name.substring(3));
	System.out.println("4-->" +name.substring(3,5));
	System.out.println("5-->" +name.contains("a"));
	System.out.println("6-->" +name.equals(name2));		
	System.out.println("7-->" +name.isEmpty());
	System.out.println("8-->" +name.concat("sharma"));
	System.out.println("9-->" +name.replace('a','c'));
	System.out.println("10-->" +name.indexOf("ay"));
	System.out.println("11-->" +name.toLowerCase());
	System.out.println("12-->" +name.trim());
	System.out.println(name.indexOf('e'));    //first position of e
	}

}
