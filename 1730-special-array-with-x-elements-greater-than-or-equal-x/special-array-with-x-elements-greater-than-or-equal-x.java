class Solution {
       static int binarySearch(int arr[], int k) {
           if (arr.length == 1) {
            if (k >= arr[0]) {
                return -1;
            }
            return 0;
        }
        int low = 0;
        int high = arr.length - 1;
        while (low != high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        if (low == arr.length - 1 && low != 0) {
            return (arr[low] == k) ? low : -1;
        }
        return low;

    }
    public int specialArray(int[] arr) {
       int n=arr.length;
        Arrays.sort(arr);
    
        for (int i = 0; i <= 100; i++) {
       int idx=binarySearch(arr, i);
       if(idx==-1){return -1;}
       if(n-idx==i){return i;}
       
        }
return -1;

    }
}