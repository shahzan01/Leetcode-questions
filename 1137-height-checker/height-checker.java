class Solution {
    public int heightChecker(int[] arr) {
             int sortedArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != sortedArr[i]) {
                ans++;
            }
        }return ans;
    }
}