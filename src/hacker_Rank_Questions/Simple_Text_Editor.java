package hacker_Rank_Questions;

import java.util.Scanner;
import java.util.*;

public class Simple_Text_Editor {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		Stack<String> Stack=new Stack<>();
	
		int test=x.nextInt();
		String update="";
		String toAdd;
		
		while(test>0)	{
	int con=x.nextInt();
	switch(con) {
	
			
	case 1:{
		 toAdd=x.next();
	     update=update+toAdd;
	String pop=	Stack.push(update);
	
	System.out.println(pop);
	break;
	}
	
	case 2:
	{
		int del=x.nextInt();
		String new1="";
		for(int i=0;i<update.length()-del;i++) {
			
			new1=new1+update.charAt(i);
			
		}
		update=new1;
		Stack.push(update);
			System.out.println(update);
	
		break;
	}
	case 3:{
		int print=x.nextInt();
		print-=1;
		System.out.println(update.charAt(print));
	break;
	}
	
	
	case 4 :{
		Stack.pop();
		update=Stack.peek();
		System.out.println(update);
		break;
	}
	
	
	
	
	
	
	}
		test--;
		}
		
	
	
			
			
			
			
		
		}
		
		
	}


