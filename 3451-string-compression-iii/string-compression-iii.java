class Solution {
    public String compressedString(String s) {
           
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            char cur = s.charAt(i);
            int count = 0;
            if (!st.isEmpty() && (st.size() == 9 || st.peek() != cur)) {
                char p = st.peek();
                while (!st.isEmpty()) {
                    st.pop();
                    count++;

                }
                sb.append(count);
                sb.append(p);
            }
            st.push(cur);

            i++;

        }
        char p = st.peek();
        int count = 0;
        while (!st.isEmpty()) {
            st.pop();
            count++;

        }
        sb.append(count);
        sb.append(p);
return sb.toString();
    }
}