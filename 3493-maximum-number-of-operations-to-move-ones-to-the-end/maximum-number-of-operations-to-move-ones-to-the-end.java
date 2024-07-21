class Solution { static int fxn(String s) {
        int count = 0;
        int ans = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                while (i < s.length() && s.charAt(i) == '1') {
                  
                    i++;
                    count++;
                }
            } else {
                ans += count;

                while (i < s.length() && s.charAt(i) == '0') {
                
                    i++;
                }
            }

        }
        return ans;

    }

    public int maxOperations(String s) {
        return fxn(s);
    }
}