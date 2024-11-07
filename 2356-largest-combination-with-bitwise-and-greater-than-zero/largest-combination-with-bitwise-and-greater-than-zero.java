class Solution {
    public int largestCombination(int[] arr) {
          HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            String bit = Integer.toBinaryString(arr[i]);
            int c = 0;
            for (int j = bit.length() - 1; j >= 0; j--) {
                if (bit.charAt(j) == '1') {
                    hm.put(c, hm.getOrDefault(c, 0) + 1);
                    max = Math.max(max, hm.get(c));
                }
                c++;
            }

        }
        return max;}
}