class Solution {
// tabulation code O(n^2) sc-O(n)
//          static int hel(int arr[]) {
//         int max=1;
//         int dp[] = new int[arr.length];
//         Arrays.fill(dp, 1);

//         for (int i = 1; i < arr.length; i++) {
//             for (int j = i - 1; j >= 0; j--) {
//                 if (arr[j] < arr[i]) {
//                     dp[i] = Math.max(dp[i], dp[j] + 1); }
//                 max=Math.max(max, dp[i]); } }
// return max; }

 static int lower_bound(List<Integer> li, int val) {
        int ans = -1;
        int low = 0;
        int high = li.size() - 1;
        while (low <= high) {
            int mid = high - (high - low) / 2;
            if (li.get(mid) == val) {
                return mid;
            }

            if (li.get(mid) > val) {
                ans = mid;
                high = mid - 1;

            } else {
                low = mid + 1;
            }

        }
        return ans;
    }

    static int hel(int arr[]) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int idx=lower_bound(li, arr[i]);
            if(idx==-1){
                li.add(arr[i]);
            }
            else{
                li.set(idx, arr[i]);
            }
        }

        return li.size();
    }
    public int lengthOfLIS(int[] nums) {
        return hel(nums);
    }
}