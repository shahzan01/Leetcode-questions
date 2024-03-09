class Solution {

     static int helper(int[] arr1, int[] arr2) {
        if (arr2.length < arr1.length) {
            return helper(arr2, arr1);
        }
        int n = arr1.length;
        int m = arr2.length;
        if (n == 0 || m == 0) {
            return -1;
        }
        if (arr1[0] > arr2[m - 1] || arr1[n - 1] < arr2[0]) {
            return -1;
        }

        for (int i = 0; i < arr1.length; i++) {
            int cur = arr1[i];
                if(cur>arr2[m-1] || cur<arr2[0]){continue;}
            int low = 0;
            int high = m - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (cur == arr2[mid]) {
                    return cur;
                }
                if (arr2[mid] > cur) {
                    high = mid - 1;
                }

                else {
                    low = mid + 1;
                }
            }

        }
        return -1;

    }
    public int getCommon(int[] nums1, int[] nums2) {
      return helper(nums1,nums2);  
    }
}