class Solution {
     static double median(int[] arr1, int arr2[]) {
        if (arr2.length < arr1.length) {
            return median(arr2, arr1);
        }

        int req = (arr1.length + arr2.length + 1) / 2;
        int low = 0;
        int high = arr1.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            int mid2 = req - mid;
            int l1 = (mid  > 0 ? arr1[mid - 1] : Integer.MIN_VALUE);
            int l2 = (mid2 > 0 ? arr2[mid2 - 1] : Integer.MIN_VALUE);
            int r1 = (mid < arr1.length) ? arr1[mid] : Integer.MAX_VALUE;
            int r2 = (mid2 < arr2.length) ? arr2[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if ((arr1.length + arr2.length) % 2 == 0) {
                    return (double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
                } else {
                    return Math.max(l1, l2);
                }

            } else if (l1 > r2) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return (double) -1;
    }
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {

return median(arr1, arr2);




    }
}