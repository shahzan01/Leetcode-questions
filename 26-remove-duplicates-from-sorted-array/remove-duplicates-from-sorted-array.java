class Solution {
    public int removeDuplicates(int[] arr) {
            int idx = 1;
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[idx] = arr[i + 1];
                idx++;
                count++;
            }
        }return count;
    }
}