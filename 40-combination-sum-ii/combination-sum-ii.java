class Solution {
     static void helper(int arr[], int idx, int sum, int tar, HashSet<List<Integer>> hs, List<Integer> temp) {
        if (tar == sum) {
            hs.add(new ArrayList<>(temp));
            return;
        }
        if (sum > tar) {
            return;
        }
        if (idx >= arr.length || arr[idx] + sum > tar) {
            return;
        }
       int i = 0;
        for (i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] > tar) {
                break;
            }
            idx = i;

            temp.add(arr[idx]);
            helper(arr, idx + 1, sum + arr[idx], tar, hs, temp);
            temp.remove(temp.size() - 1);

        }
        return;

    }
    public List<List<Integer>> combinationSum2(int[] arr, int tar) {
         Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        helper(arr, 0, 0, tar, hs, temp);
      
        for (List<Integer> i : hs) {
            ans.add(i);
        }
        return ans;



    }
}