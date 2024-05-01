class Solution {
    public String reversePrefix(String s, char ch) {
        
          StringBuilder sb = new StringBuilder();
        boolean t = true;
        int idx = -1;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == ch ) {
                              idx = i;
                              break;
            }
        }

        if (idx == -1) {
            return s;
        } else {
            sb.append(s.substring(0, idx + 1));
            sb.reverse();
            sb.append(s.substring(idx + 1));
        }
       return sb.toString();
    }
}