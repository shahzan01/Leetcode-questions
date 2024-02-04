class Solution {
    public int minimumTimeToInitialState(String s, int k) {
           int n = s.length();
     

        for (int i = k; i < n; i += k) {

            if (s.substring(0, n - i).equals(s.substring(i, n))) {

              return i/k;
            }
        }

return (n+k-1)/k;













    }

}