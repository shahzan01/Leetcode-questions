class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);

        }

        int max = 0;

        for (Integer in : hs) {
            int count = 0;
            int cur = in;
            if (hs.contains(cur - 1)) {
                continue;
            } else {
                count++;
                while (hs.contains(cur + 1)) {
                    count++;
                    cur++;
                }
                max = Math.max(max, count);

            }
        }
       
        return max; 
    }
}