class Solution {
       static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void helper(int nums[], int cur, List<List<Integer>> ans) {
        if (cur == nums.length) {
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                al.add(nums[i]);
            }
            ans.add(al);
            return;
        }
        for (int i = cur; i < nums.length; i++) {
            swap(nums, cur, i);
            helper(nums, cur + 1, ans);
            swap(nums, cur, i);
        }

    }
    public List<List<Integer>> permute(int[] nums) {
      
        List<List<Integer>> ans = new LinkedList<>();
        helper(nums, 0, ans);
     return ans;




    }
}