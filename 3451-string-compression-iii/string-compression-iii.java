class Solution {
    public String compressedString(String s) {
         int n = s.length();
          if(n==1){
            return "1"+s.charAt(0);
        }
        int c = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            c = 1;
            while (i < s.length() && s.charAt(i - 1) == s.charAt(i)) {
                i++;
                c++;
            }
            while (c > 0) {
                if (c > 9) {
                    sb.append('9');
                    sb.append(s.charAt(i - 1));
                    c -= 9;
                } else {
                    sb.append("" + c);
                    sb.append(s.charAt(i - 1));
                    c = 0;
                }
            }

        }
     
        if (n >= 2 && s.charAt(n - 1) != s.charAt(n - 2)) {
            sb.append("1");
            sb.append(s.charAt(n - 1));
        }
return sb.toString();
    }
}