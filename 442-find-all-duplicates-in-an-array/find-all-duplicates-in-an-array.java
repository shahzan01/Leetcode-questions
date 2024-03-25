class Solution {
    public List<Integer> findDuplicates(int[] arr) {
          List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int idx = (int) Math.abs(arr[i]) - 1;

            int n = arr[idx];
            if (n < 0) {
                ans.add(idx + 1);
            } else {
                arr[idx] = -1 * n;
            }
        }
        return ans;
    }
}