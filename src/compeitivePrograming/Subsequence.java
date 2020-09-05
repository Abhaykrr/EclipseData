package compeitivePrograming;

import java.util.Scanner;

public class Subsequence {

	public  static String[] findSubsequence(String str) {
		
		if(str.length()==0) {
			String ans[]= {""};
			return ans;
		}
		String smallans[]=findSubsequence(str.substring(1));
		String ans[]=new String [2*smallans.length];
		int k=0;
		for(int i=0;i<smallans.length;i++) {
			ans[k]=smallans[i];
			k++;
		}
		for(int i=0;i<smallans.length;i++) {
			ans[k]=str.charAt(0)+smallans[i];
					k++;
		}
		return ans;
	}
	public static void main(String[] args) {
		int count=1;int c=0;int answ=0;
		Scanner x=new Scanner(System.in);
		int test=x.nextInt();
		
		while(test>0) {
		String str=x.nextLine();
		String ans[]=findSubsequence(str);
		int le=ans.length;
		boolean visited[]=new boolean[le];
		for(int i=1;i<ans.length;i++) {
		System.out.println(ans[i]);
		
		
			for(int j=i+1;j<ans.length;j++) {
			      if(ans[i].equals(ans[j])&& visited[j]==false) {
			    	  visited[j]=true;
			    	count++;  }}
		//	System.out.println(count);
			      answ+=count/2;
     		      count=0;
			
			
		}
		System.out.println(answ);
		answ=0;test--;}
	}

}
