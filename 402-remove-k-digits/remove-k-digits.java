class Solution {
    public String removeKdigits(String s, int k) {
             StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > c) {
                k--;
                st.pop();
            }
            st.push(c);
        }

        while (!st.isEmpty() && k > 0) {
            st.pop();
            k--;
        }

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
           sb.reverse();
     while (sb.length()>1 && sb.charAt(0)=='0') {
            sb.deleteCharAt(0);
        }
return sb.length()>0?sb.toString():"0";

    }
}