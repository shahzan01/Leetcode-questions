class Solution {
    public String maximumOddBinaryNumber(String s) {
   StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && sb.charAt(i) == '1') {
                i++;

            }
            while (i < j && sb.charAt(j) == '0') {
                j--;

            }
            if (i != j) {
                sb.setCharAt(i, '1');
                sb.setCharAt(j, '0');
            }
        }
        if (sb.charAt(i) == '0') {
            sb.setCharAt(i - 1, '0');
            sb.setCharAt(s.length() - 1, '1');
        }
        return  sb.toString();
    }
}