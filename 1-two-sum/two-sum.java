class Solution {
    public int[] twoSum(int[] arr, int sum) {
          int ans[] = new int[2];
       
            // hashmap<Value,Index>
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(sum - arr[i])) {
                ans[0] = i;
                ans[1] = hm.get(sum - arr[i]);
            } else {
                hm.put(arr[i], i);
            }
        }

return ans;

    }
}