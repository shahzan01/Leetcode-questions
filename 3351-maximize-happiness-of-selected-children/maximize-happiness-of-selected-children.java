class Solution {
    public long maximumHappinessSum(int[] arr, int k) {
         Arrays.sort(arr);

        int i = arr.length - 1;
        long ans = 0;
        int minus = 0;
        while (k > 0) {
          if((arr[i]-minus)>=0){ans+=(arr[i]-minus);}
            minus++;
            i--;
            k--;
        }
        return ans;
    }
}