package questions;

import java.util.Scanner;

public class MatrixProduct {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("enetr length");
			int col=x.nextInt();
			int row =x.nextInt();
			
			int a[][]=new int[row][col];
			int b[][]=new int[row][col];
			System.out.println("matrix a");
			for(int i=0;i<row;i++) {
				for (int j=0;j<col;j++) {
					a[i][j]=x.nextInt();
					
				}
			}
			System.out.println("matrix b");
			for(int i=0;i<row;i++) {
				for (int j=0;j<col;j++) {
					b[i][j]=x.nextInt();
				}
					}
			int c[][]=new int[row][col];
			
			for(int i=0;i<row;i++) {
				for (int j=0;j<col;j++) {	
					
				}
				 }
 	}

}
