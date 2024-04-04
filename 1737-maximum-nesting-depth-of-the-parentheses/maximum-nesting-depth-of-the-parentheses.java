class Solution {
    public int maxDepth(String s) {
         Stack st = new Stack<>();

        int d = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(c);
            }
            d = Math.max(d, st.size());
            if (c == ')') {
                st.pop();
            }

        }
return d;
    }
}