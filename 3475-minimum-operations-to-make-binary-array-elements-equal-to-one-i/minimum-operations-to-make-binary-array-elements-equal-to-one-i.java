class Solution {
      static boolean flip(int arr[], int idx) {
        int n = arr.length;
        if (idx > n - 3) {
            return false;
        }

        for (int i = idx; i < idx + 3; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return true;
    }

    static int fxn(int arr[]) {
        int ans = 0;
        boolean temp = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                continue;
            } else {
                temp = flip(arr, i);
                if (!temp) {
                    return -1;
                }
                ans++;
            }
        }
        return ans;
    }

    public int minOperations(int[] nums) {
        return fxn(nums);
    }
}