class Solution {
        static long[] fn(String s, int k, int[][] queries) {
        int n = s.length();
        int rightMostValidIndex[] = new int[n];
        int oneCount = 0;
        int zeroCount = 0;
        int i = n - 1;
        int j = n - 1;
        while (j >= 0 && i >= j) {

            if (s.charAt(j) == '1') {
                oneCount++;
            } else {
                zeroCount++;
            }
            while (oneCount > k && zeroCount > k && i > j) {
                if (s.charAt(i) == '1') {
                    oneCount--;
                } else {
                    zeroCount--;
                }
                i--;
            }
            rightMostValidIndex[j] = i;
            j--;
        }
        long left[] = new long[n];
        i = 0;
        j = 0;
        oneCount = 0;
        zeroCount = 0;
        while (j < n) {
            if (s.charAt(j) == '1') {
                oneCount++;
            } else {
                zeroCount++;
            }
            while (oneCount > k && zeroCount > k && i < j) {
                if (s.charAt(i) == '1') {
                    oneCount--;
                } else {
                    zeroCount--;
                }
                i++;
            }
            left[j] = (j - i + 1);
            if (j > 0) {
                left[j] += left[j - 1];
            }
            j++;
        }
        long ans[] = new long[queries.length];
        for (i = 0; i < queries.length; i++) {
            int low = queries[i][0];
            int high = queries[i][1];
            int rightvalid = Math.min(rightMostValidIndex[low], high);
            if (rightvalid == high) {
                long len = high - low + 1;
                ans[i] = len * (len + 1) / 2;
            } else {
                long len = rightvalid - low + 1;
                long a = len * (len + 1) / 2;
                a += left[high] - left[rightvalid];

                ans[i] = a;

            }

        }

        return ans;

    }
    public long[] countKConstraintSubstrings(String s, int k, int[][] queries) {
       return fn(s,k,queries);









    }
}