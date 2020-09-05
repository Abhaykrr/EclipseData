package arrays;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("enter the no of students");
		int n=x.nextInt();
		int marks[]=new int[n];
		
		System.out.println("enter the marks now");
		for(int i=0;i<n;i++ ) {
			marks[i]=x.nextInt();
		}
		System.out.println("marks of the  students are ");
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		float averagemarks=0;
		for(int i=0;i<n;i++) {
			averagemarks +=marks[i];
			}
		averagemarks /=n;
		System.out.println("average marks of the students is " + averagemarks);
	}

}
