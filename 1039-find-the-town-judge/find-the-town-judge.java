class Solution {
    public int findJudge(int n, int[][] arr) {
          int trusting[] = new int[n + 1];
        int trusted[] = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            trusting[arr[i][0]]++;
            trusted[arr[i][1]]++;
        }
int ans=-1;
        for (int i = 1; i < trusted.length; i++) {
            if (trusting[i] == 0 && trusted[i] == n - 1) {
              ans=i;
            }
        }return ans;
    }
}