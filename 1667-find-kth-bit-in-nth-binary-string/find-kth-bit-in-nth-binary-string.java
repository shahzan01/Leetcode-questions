class Solution {
        static String invert(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                sb.append('0');
            } else {
                sb.append("1");
            }

        }
        return sb.reverse().toString();
    }
    public char findKthBit(int n, int k) {
                StringBuilder sb = new StringBuilder("0");
        while (n > 1) {
            String temp = invert(sb.toString());
            sb.append("1");
            sb.append(temp);
            n--;
            
        }
        return sb.charAt(k-1);
    }
}