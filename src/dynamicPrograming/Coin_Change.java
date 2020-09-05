package dynamicPrograming;
import java.util.Arrays;

public class Coin_Change {

	public static void main(String[] args) {
		int coins[]= {2,4};
		int amount=3;
		int count=0;
		
		int dp[]=new int[amount+1];
		Arrays.fill(dp, amount+1);
		dp[0]=0;
		
		for(int i=0;i<coins.length;i++) 
			for(int j=coins[i];j<amount+1;j++) {
				      dp[j]=Math.min(dp[j], 1+dp[j-coins[i]]);
				      if(j==amount&&dp[j]!=amount+1)
				    	  count++;
			}
		System.out.println(count);
		
		
		if(dp[amount]==amount+1)
			dp[amount]=-1;
		//System.out.println(dp[amount]);
		
	
		
		
	}
	
	// Notes of the Question with example 
	// Time complexity (m*n)
	/*   amount =4; coins=[1,  2,  5];      
	 *    coins   dp[0]  dp[1]  dp[2]  dp[3]   dp[4] 
	 *      1         0        1      2       3        4      
	 *      2         0                1       2        2
	 *      5         0
	 **/
	 

}
