class Solution {
    public int valueAfterKSeconds(int n, int k) {
         int mod = 1000000007;
        int arr[] = new int[n];
        Arrays.fill(arr, 1);
        while (k > 0) {
            for (int i = 1; i < arr.length; i++) {
                arr[i] =  (arr[i] + arr[i - 1])%mod;
            }
            k--;
        }
return arr[n-1]; 
    }
}