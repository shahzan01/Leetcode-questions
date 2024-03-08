class Solution {
    public int maxFrequencyElements(int[] arr) {
         HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int f = 0;
        for (Integer i : hm.keySet()) {
            int cur = hm.get(i);
            if (cur > max) {
                f = cur;
                max = cur;
            } else if (cur == max) {
                f += cur;
            } else {
                continue;
            }

        }
return f;

      
    }
}