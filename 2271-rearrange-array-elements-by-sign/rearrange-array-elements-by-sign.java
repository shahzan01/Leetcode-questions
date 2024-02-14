class Solution {
    public int[] rearrangeArray(int[] arr) {
       
             int n = arr.length;
        int ans[] = new int[n];
        int p = 0;
        int ne = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                ans[ne] = arr[i];
                ne += 2;
            } else {
                ans[p] = arr[i];
                p += 2;
            }
        }
        return ans;
    }
}