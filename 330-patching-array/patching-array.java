class Solution {
    public int minPatches(int[] arr, int n) {
         int ans = 0;
        long maxSumAcievabale = 0;
        int i = 0;
        while (maxSumAcievabale < n) {

            if (i < arr.length && maxSumAcievabale + 1 >= arr[i]) {
               maxSumAcievabale += (long)arr[i];
                i++;
            } else {
                maxSumAcievabale += (long)(maxSumAcievabale + 1);
                ans++;
            }
           
        }
return ans;
    }
}