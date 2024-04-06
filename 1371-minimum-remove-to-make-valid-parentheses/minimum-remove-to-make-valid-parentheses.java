class Solution {
      static class info {
        char c;
        int idx;

        info(char ch, int i) {
            this.c = ch;
            this.idx = i;
        }

    }
    public String minRemoveToMakeValid(String s) {
     char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack st = new Stack<>();
        int left = 0;
        int right = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
            }
            if (c == ')') {
                right++;
            }
            if (right > left) {
                right--;
                continue;

            } else {
                st.push(c);
            }

        }
        String ans = "";
        while (!st.isEmpty()) {
            char c = (char) st.pop();
            if (left > right && c == '(') {
                left--;
            } else {
                sb.append(c);
            }

        }return sb.reverse().toString();
    }
}