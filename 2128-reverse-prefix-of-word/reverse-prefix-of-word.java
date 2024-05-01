class Solution {
    public String reversePrefix(String s, char ch) {
        
           StringBuilder sb = new StringBuilder();
        boolean t = true;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == ch && t == true) {
                t = false;
                sb.append(cur);
                sb.reverse();
            } else {
                sb.append(cur);
            }
        }return sb.toString();
    }
}