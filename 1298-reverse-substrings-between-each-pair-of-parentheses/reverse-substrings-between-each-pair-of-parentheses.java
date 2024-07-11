class Solution {
    public String reverseParentheses(String s) {
              StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(') {
                st.push(cur);
                i++;
                r: while (!st.isEmpty()) {
                    char c = s.charAt(i);
                    if (c == ')') {
                        StringBuilder sb = new StringBuilder();
                        while (st.peek() != '(') {
                            sb.append(st.pop());
                        }
                        st.pop();
                        if (st.isEmpty()) {
                            ans.append(sb);
                            break r;
                        }
                        for (int j = 0; j < sb.length(); j++) {
                            st.push(sb.charAt(j));
                        }

                    } else {
                        st.push(c);
                    }
                    i++;

                }

            }

            else {
                ans.append(cur);
            }

        }return ans.toString();
      
    }
}