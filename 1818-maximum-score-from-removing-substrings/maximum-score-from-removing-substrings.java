class Solution {
    public int maximumGain(String s, int x, int y) {
          String s1 = "";
        String s2 = "";
        if (x >= y) {
            s1 = "ab";
            s2 = "ba";
        } else {
            s1 = "ba";
            s2 = "ab";
        }
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        int ans = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (!st.isEmpty() && cur == s1.charAt(1) && st.peek() == s1.charAt(0)) {
                ans += max;
                st.pop();
                continue;
            } else {
                st.push(cur);
            }

        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        s = sb.toString();
        st.setSize(0);
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (!st.isEmpty() && cur == s2.charAt(1) && st.peek() == s2.charAt(0)) {
                ans += min;
                st.pop();
                continue;
            } else {
                st.push(cur);
            }

        }return ans;
    }
}