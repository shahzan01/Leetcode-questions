class Solution {
    public void sortColors(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (mid <= high) {
            if (arr[mid] == 0) {
                arr[mid] = arr[low];
                arr[low] = 0;
                low++;
                mid++;

            } else if (arr[mid] == 2) {
                arr[mid] = arr[high];
                arr[high] = 2;
                high--;

            }

            else {
                mid++;
            }

        }
 
    }
}