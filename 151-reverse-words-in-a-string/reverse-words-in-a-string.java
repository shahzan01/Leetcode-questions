class Solution {
    public String reverseWords(String s) {
      StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;

            }
            temp.setLength(0);
            while (i >= 0 && s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
                i--;

            }
            sb.append(temp.reverse());
            if (temp.length() > 0) {
                sb.append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String ans = sb.toString();return ans;
    }
}