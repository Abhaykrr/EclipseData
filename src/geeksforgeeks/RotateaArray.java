package geeksforgeeks;

import java.util.Scanner;
                                                                    //   2
public class RotateaArray {                                // 5 2
                                                                    // 1 2 3 4 5
	public static void main(String[] args) {            // 3 4 5 1 2
		//System.out.println("enter ");                     //
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int al;   //array length
		int ro;  //rotate after
		
		for(int i=1;i<=n;i++)
		{
			al=x.nextInt();
			ro=x.nextInt();
			
			int a[]=new int[al];
			
			for(int y=0;y<al;y++)
			{
				a[y]=x.nextInt();
				
			}
			
			for(int y=ro;y<al;y++) {
				System.out.print(a[y] + " ");
			}
			
			for(int y=0;y<ro;y++)	
			{
				System.out.print(a[y] + " ");
			
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
