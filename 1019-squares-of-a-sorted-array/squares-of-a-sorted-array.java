class Solution {
    public int[] sortedSquares(int[] nums) {


       int sqrnums[] = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                sqrnums[i] = nums[start] * nums[start];
                start++;
            } else {
                sqrnums[i] = nums[end] * nums[end];
                end--;
            }
        }

return sqrnums;


    }
}