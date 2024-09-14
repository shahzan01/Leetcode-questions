class Solution {
    public int longestSubarray(int[] arr) {
      int i = 0;
        int max = 0;
        int ans = 0;
      while (i < arr.length) {
            if (arr[i] > max) {
                int count = 0;
                max = arr[i];
                while (i < arr.length && arr[i] == max) {
                    count++;
                    i++;
                }
                ans = count;
            } else if (arr[i] == max) {
                int count = 0;
                while (i < arr.length && arr[i] == max) {
                    count++;
                    i++;
                }
                ans = Math.max(ans, count);
            }

            else {
                i++;
                continue;
            }

        }
return ans;
    }
}