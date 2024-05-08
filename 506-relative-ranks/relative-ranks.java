class Solution {
    public String[] findRelativeRanks(int[] arr) {
          HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], i);
        }
        Arrays.sort(arr);
          System.out.println(hm);
        String[] ans = new String[arr.length];
        int count = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = hm.get(arr[i]);
            if (count == 1) {
                ans[idx] = "Gold Medal";
            } else if (count == 2) {
                ans[idx] = "Silver Medal";
            } else if (count == 3) {
                ans[idx] = "Bronze Medal";
            } else {
                ans[idx] = Integer.toString(count);
            }
            count++;
        }
        return ans;
    }
}