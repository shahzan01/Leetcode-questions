class Solution {
     static boolean twostack(String s) {
        Stack st = new Stack<>();
        Stack st1 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(i);
                continue;
            } else if (c == '*') {
                st1.push(i);
                continue;
            } else {
                if (st.isEmpty() && st1.isEmpty()) {
                    return false;
                }
                if (st.isEmpty()) {
                    st1.pop();
                } else {
                    st.pop();
                }

            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            while (!st.isEmpty() && !st1.isEmpty()) {
                if ((int) st.pop() > (int) st1.pop()) {
                    return false;
                }
                continue;
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        return false;

    }
    public boolean checkValidString(String s) {
        return twostack(s);
    }
}