class Solution {
    public long minimumSteps(String s) {
          long ans = 0;
    
        int zerocount = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                zerocount++;
            } else {
                ans += zerocount;
            }
        }
        return ans;
    }
}