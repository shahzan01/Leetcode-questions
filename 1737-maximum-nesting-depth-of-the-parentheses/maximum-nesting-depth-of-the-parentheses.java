class Solution {
    public int maxDepth(String s) {
         Stack st = new Stack<>();

         int d = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                d++;
            }
            max = Math.max(max, d);
            if (c == ')') {
                d--;
            }

        }
return max;
    }
}