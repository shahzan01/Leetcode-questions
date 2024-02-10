class Solution {
  static boolean ispalindrome(String st) {
        int l = st.length();
        if (l == 1) {
            return true;
        }
        int i = 0;
        int j = st.length() - 1;
        while (i < j) {
            if (st.charAt(i) != st.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;

    }



    public int countSubstrings(String s) {
      int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));

                if (ispalindrome(sb.toString())) {
                    ans++;
                }
            }

        }    

return ans;



        
    }
}