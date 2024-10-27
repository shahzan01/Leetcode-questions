class Solution {
    public int countSquares(int[][] mat) {
        
        int n=mat.length;
        int m=mat[0].length;
int dp[][]=new int[n+1][m+1];
for(int i=1;i<dp.length;i++){
    for(int j=1;j<dp[0].length;j++){
        if(mat[i-1][j-1]==0){continue;}
        int min=Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]);
        dp[i][j]=min+1;
    }
}
HashMap<Integer,Integer>hm=new HashMap<>();
for(int i=1;i<dp.length;i++){
    for(int j=1;j<dp[0].length;j++){
     hm.put(dp[i][j], hm.getOrDefault(dp[i][j],0)+1);
    }
}
int ans=0;
for(int i:hm.keySet()){
    ans+=i*hm.get(i);
}


return ans;
    }
}