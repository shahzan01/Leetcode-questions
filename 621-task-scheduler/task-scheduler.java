class Solution {
    public int leastInterval(char[] tasks, int n) {
         HashMap<Character, Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
        char maxc = 'A';
        for (int i = 0; i < tasks.length; i++) {
            char c = tasks[i];
            hm.put(c, hm.getOrDefault(c, 0) + 1);
            if (max < hm.get(c)) {
                max = hm.get(c);
                maxc = c;
            }

        }
        int blank = (max - 1) * n;

        for (char c : hm.keySet()) {
            if (c != maxc) {
                blank -= Math.min(hm.get(c), max - 1);
            }
        }
         return tasks.length+Math.max(0, blank);
    }

}