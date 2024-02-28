class Solution {
     static void he(int arr[], int cur, int tar, List<List<Integer>> ans, List<Integer> al) {
        if (cur >= arr.length || tar < 0) {
            return;
        }
        if (tar == 0) {
            System.out.println(al);
            ans.add(new ArrayList<>(al));
            return;
        }
        al.add(arr[cur]);
        he(arr, cur, tar - arr[cur], ans, al);
        al.remove(al.size() - 1);
        he(arr, cur + 1, tar, ans, al);

        return;
    }
    public List<List<Integer>> combinationSum(int[] arr, int tar) {
         List<List<Integer>> ans = new ArrayList<>();
     
    
        List<Integer> al = new ArrayList<>();
        he(arr, 0, tar, ans, al);
        return ans;
    }
}