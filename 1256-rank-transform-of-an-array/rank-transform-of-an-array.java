class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(arr);
      
        HashMap<Integer, Integer> hm = new HashMap<>();
        int r = 1;
        for (int i = 0; i < arr.length; i++) {

            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], r);
                r++;
            }
        }
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = hm.get(temp[i]);
        }
        return ans;  
    }
}