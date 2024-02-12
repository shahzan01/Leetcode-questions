class Solution {
    public List<Integer> majorityElement(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
     
        int n = arr.length / 3;
        List<Integer> ans = new ArrayList<>();
        for (Integer i : hm.keySet()) {

            if (hm.get(i) > n) {
                ans.add(i);
            }
        }
        return ans;
    }
}