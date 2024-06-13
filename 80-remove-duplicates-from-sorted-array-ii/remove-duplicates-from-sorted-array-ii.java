class Solution {
    public int removeDuplicates(int[] arr) {
             int idx = 0;
   
        int count = 2;
        r: for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] != arr[i - 1]) {
                count = 2;

            }
            if (count > 0) {
                arr[idx] = arr[i];
                idx++;
                count--;
            }

        }
        return idx;
    }
}