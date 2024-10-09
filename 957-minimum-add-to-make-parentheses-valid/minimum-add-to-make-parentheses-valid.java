class Solution {
    public int minAddToMakeValid(String s) {
         int ob = 0;
        int cb = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                ob++;
            } else {
                if (ob > 0) {
                    ob--;
                } else {
                    cb++;
                }
            }
        }
        return ob+cb;
    }
}