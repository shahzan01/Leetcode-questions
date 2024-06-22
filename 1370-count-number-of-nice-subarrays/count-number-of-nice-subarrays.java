class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
         int i = 0;
        int j = 0;
        int ans = 0;
        int count = 0;
        int left = 0;
        int right = 0;

        while (i < arr.length) {
            if (arr[i] % 2 != 0) {
                count++;
            }
            while (j <= i && count == k) {
                if (arr[j] % 2 != 0) {
                   right=0;
                    while (i < arr.length - 1 && arr[i + 1] % 2 == 0) {
                        i++;
                        right++;
                    }

                    ans += (left + 1) * (right + 1);
                    j++;
                    count--;
                    left=0;

                } else {
                    left++;
                    j++;
                }

            }

            i++;

        }return ans;
    }
}