class Solution {

  static int helper(String str1, String str2,int n,int m,int dp[][]){
      for(int i=1;i<n+1;i++){
		for(int j=1;j<m+1;j++){
			if(str1.charAt(i-1)==str2.charAt(j-1)){
				dp[i][j]=dp[i-1][j-1]+1;
			}
			else{
				int ans1=dp[i-1][j];
				int ans2=dp[i][j-1];
				dp[i][j]=Math.max(ans1, ans2);
			}
		}
	   }
	   return dp[n][m];
    }
    public int longestCommonSubsequence(String str1, String str2) {
        
		int dp[][]=new int[str1.length()+1][str2.length()+1];
for(int i=0;i<dp.length;i++){
	for(int j=0;j<dp[0].length;j++){
		if(i==0 || j==0){dp[i][j]=0;}
	}
}
return helper(str1, str2, str1.length(), str2.length(),dp);



    }
}