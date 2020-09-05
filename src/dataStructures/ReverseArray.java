package dataStructures;

public class ReverseArray {

	public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6,7,8,9,10};
	       ReverseArray(a);
	
	

	}
static int[]  ReverseArray(int[] a){
	int m=1;
	for(int i=0;i<a.length/2;i++) {
		 m=a[i]*a[a.length-i-1];
		 a[i]=m/a[i];
		 a[a.length-i-1]=m/a[a.length-i-1];
		 m=1;
		
	}
	for(int ans:a) 
		System.out.println(ans);
	return a;
	}
	
}
