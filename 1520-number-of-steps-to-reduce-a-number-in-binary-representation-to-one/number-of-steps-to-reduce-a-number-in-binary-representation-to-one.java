class Solution {
     static void addOne(StringBuilder sb) {

        int carry = 1;

        for (int i = sb.length() - 1; i >= 0; i--) {
            if (carry == 0) {
                break;
            }
            char c = sb.charAt(i);
            if (c == '0') {
                sb.replace(i, i + 1, "1");
                carry = 0;
            } else {
                sb.replace(i, i + 1, "0");
            }
        }
        if (carry == 1) {
            sb.insert(0, 1);
        }

    }
    public int numSteps(String s) {
    StringBuilder sb = new StringBuilder(s);

        int ans = 0;

        while (sb.length() != 1 || sb.charAt(sb.length() - 1) != '1') {
            char c = sb.charAt(sb.length() - 1);
            if (c == '1') {
                addOne(sb);
            }

            else {
                sb.delete(sb.length() - 1, sb.length());
             
            }
            ans++;
        }return ans;
    }
}