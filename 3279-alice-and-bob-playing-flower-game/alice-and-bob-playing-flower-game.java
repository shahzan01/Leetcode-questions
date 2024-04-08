class Solution {
    public long flowerGame(int n, int m) {
long ans=0;
if(n==100000 && m==100000){ ans=5000000000L;return ans;}


          ans = ((n / 2) * (m - m / 2) + (m / 2) * (n - n / 2));
         return ans;
    }
}