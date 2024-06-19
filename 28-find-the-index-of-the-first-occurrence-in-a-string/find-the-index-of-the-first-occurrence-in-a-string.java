class Solution {
    public int strStr(String s, String n) {
          int l = n.length();

      
        for (int i = 0; i <= s.length() - l; i++) {
            if (s.substring(i, i + l).equals(n)) {
                return i;
            }

        }
        return -1;
    }
}