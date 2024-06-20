class Solution {
    public int maxArea(int[] arr) {
       int i = 0;
        int n = arr.length;
        int j = n - 1;
     
        int water = 0;
        while (i < j) {
            water = Math.max(water, Math.min(arr[i], arr[j]) * (j - i));

            if (arr[i] > arr[j]) {
                j--;
            } else {
                i++;
            }

        }return water; 
    }
}