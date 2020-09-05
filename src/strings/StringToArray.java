package strings;

import java.util.Scanner;

public class StringToArray {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
	String s="";
	String h=" ";
		
		for(int i=0;i<=n;i++) {
			String a=x.nextLine();
			a=a+h;
		    s=s+a;
			
		}
		String word1[]=s.split(" ");
		
//		for(String array:word1)
//			System.out.println(array);
		
		for(int j=0;j<n;j++) {
		for(int i=0;i<word1[j].length();i++) {
			
		
		
		}
		}
		
		
	}

}
