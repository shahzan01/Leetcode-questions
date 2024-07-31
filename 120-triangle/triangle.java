class Solution {
        static int hel(List<List<Integer>> triangle ,int dp[][],int row,int idx) {
       if(row>=triangle.size() || idx>=triangle.get(row).size()){return 0;}
       if(dp[row][idx]!=100000){return dp[row][idx];}
int ans1=hel(triangle, dp, row+1, idx);
int ans2=hel(triangle, dp, row+1, idx+1);
return dp[row][idx]= Math.min(ans1, ans2)+triangle.get(row).get(idx);







    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][]=new int[triangle.size()][triangle.get(triangle.size()-1).size()];
        for (int[] is : dp) {
            Arrays.fill(is, 100000);
        }
        return hel(triangle,dp,0,0);
    }
}