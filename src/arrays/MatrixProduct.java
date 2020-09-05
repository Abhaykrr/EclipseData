package arrays;

import java.util.Scanner;

public class MatrixProduct {

	public static void main(String[] args) {
		
Scanner x=new Scanner(System.in);
System.out.println("enter dimensions");
int row=x.nextInt();
int col=x.nextInt();

int a[][]=new int[row][col];
int b[][]=new int[row][col];                   
System.out.println("enter matrix a");
                                                  for(int i=0;i<row;i++) {
                                                	  for(int j=0;j<col;j++) {
                                                		  a[i][j]=x.nextInt();
                                                	                              }}
                                                	  
 System.out.println("enter matrix b");
                                                  for(int i=0;i<row;i++) {
                                                	  for(int j=0;j<col;j++) {
                                                		  b[i][j]=x.nextInt();
                                                	  								}}
System.out.println("matix a");                               
                                                  for(int i=0;i<row;i++) {
                                                	  for(int j=0;j<col;j++) {
                                                		 System.out.print(a[i][j] + " ");
                                                	  												}
                                                	  System.out.println();}
  System.out.println("matix b");                                            	  											
                                                  for(int i=0;i<row;i++) {
                                                	  for(int j=0;j<col;j++) {
                                                		 System.out.print(b[i][j] + " ");
                                                	  												}
                                                	  System.out.println();}
 System.out.println("sum of matrix a and b is ");
 int c[][]=new int[row][col];
 for(int i=0;i<row;i++) {
	  for(int j=0;j<col;j++) {
		  for(int k=0;k<col;k++) {
			 c[i][j] +=a[i][k]*b[k][i]; 
			
		  }
		  System.out.print(c[i][j] + " ");
	  }
	  System.out.println();
 }
 
  }
}