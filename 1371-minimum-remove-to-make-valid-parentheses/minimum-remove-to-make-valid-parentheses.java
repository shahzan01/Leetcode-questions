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
      
        Stack st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = arr[i];
            if (cur == '(') {
                st.push(new info(cur, i));
                continue;
            }
            if (cur == ')') {
                if (st.isEmpty()) {
                    arr[i] = '*';

                    continue;
                }
                info a = (info) st.peek();
                while (!st.isEmpty() && a.c != '(') {
                    a = (info) st.pop();
                    int x = a.idx;
                    arr[x] = '*';
                }
                if (st.isEmpty()) {
                    arr[i] = '*';
                    continue;
                } else {
                    st.pop();
                }

            }

        }
        while (!st.isEmpty()) {
            info a = (info) st.pop();
            arr[a.idx] = '*';
        }
        String ans = "";
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '*') {
                continue;
            }
            ans += arr[i];
        }return ans;
    }
}