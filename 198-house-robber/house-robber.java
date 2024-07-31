class Solution {
  static int hel(int arr[],int cur,boolean rob){
 int dp[]=new int[arr.length+2];
 dp[0]=0;dp[1]=0;
 for(int i=2;i<dp.length;i++){
    dp[i]=Math.max(dp[i-1], dp[i-2]+arr[i-2]);
 }
return dp[dp.length-1];


 }

    public int rob(int[] nums) {
  return hel(nums,0,true);      
    }
}