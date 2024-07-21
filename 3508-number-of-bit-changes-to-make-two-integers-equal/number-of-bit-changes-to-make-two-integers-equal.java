class Solution {  static int fxn(int n, int k) {
        String ns = Integer.toBinaryString(n);
        String ks = Integer.toBinaryString(k);

        if (ks.length() > ns.length()) {
            return -1;
        }
        int ans = 0;
        int i = ns.length() - 1;
        int j = ks.length() - 1;
        while (i >= 0 && j >= 0) {
            if (ns.charAt(i) == ks.charAt(j)) {
                i--;
                j--;
                continue;
            } else if (ns.charAt(i) == '1' && ks.charAt(j) == '0') {
                i--;
                j--;
                ans++;
            } else {
                return -1;
            }

        }

        while (i >= 0) {
            if (ns.charAt(i) == '1') {
                ans++;
            }
            i--;
        }

        return ans;

    }
    public int minChanges(int n, int k) {
     return fxn(n,k) ;  
    }
}