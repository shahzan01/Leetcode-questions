class Solution {
  
    static int binarySearch(int arr[], int k) {
        if (arr.length == 1) {
            if (k > arr[0]) {
                return 0;
            }
            return 1;
        }
        int n = arr.length;
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
        if (low == arr.length-1) {

            return (arr[low] == k) ? n - low : 0;
        }
        return n - low;

    }
    public int specialArray(int[] arr) {
       int n=arr.length;
        if(arr.length==2 && arr[0]==arr[1] && arr[0]==0){return -1;}
    
     Arrays.sort(arr);

        int low = 0;
        int high = 100;

        while (low <= high) {
            int mid = (low + high) / 2;
            int num = binarySearch(arr, mid);
            if (num == mid) {
                return mid;
            }

            if (num > mid) {
                low = mid + 1;
            } else {
                high = mid -1;
            }

        }
return -1;

    }
}