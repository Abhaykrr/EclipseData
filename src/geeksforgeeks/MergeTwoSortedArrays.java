package geeksforgeeks;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int a[]= {6,7,8,9,11};
		int b[]= {1,2,3,4,10,11};
		int i=0,j=0,k=0;
		int res[]=new int[a.length+b.length];
		
		while(i<a.length&&j<b.length) {
			if(a[i]>b[j]) {
				res[k]=b[j];
		       	j++;k++;}
			else {
			res[k]=a[i];
				i++;k++;	}}
		while(i<a.length) {
			res[k]=a[i];
		k++;i++;}
		while(j<b.length) {
			res[k]=b[j];
			k++;j++;
		}

			
			
		for(int q: res)
			System.out.print(q+ " ");
		
		
	
	}

}
