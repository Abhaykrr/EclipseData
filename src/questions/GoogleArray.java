package questions;

//import java.util.Scanner;

public class GoogleArray {

	public static void main(String[] args) {
int a[]= {-1,4,10-4,1,3,10,-6};
int n=a.length;                         //defining the length of the array


int max =1;//=Integer.MIN_VALUE;
for(int i=0;i<=n;i++) {
	for(int j=i;j<n;j++) {
	int currentsum=0;
	for(int k=i;k<=j;k++) {
		currentsum +=a[k];
	}
	if(currentsum>max) {
		max=currentsum;
	}
  }
}
		
	System.out.println(max);
		
	}

}

