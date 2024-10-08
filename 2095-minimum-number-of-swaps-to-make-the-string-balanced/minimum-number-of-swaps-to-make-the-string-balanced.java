class Solution {
    public int minSwaps(String s) {
         StringBuilder sb = new StringBuilder(s);
        int ans = 0;
        int openCount = 0;
        int closeCount = 0;

        List<Integer> openIdx = new ArrayList<>();
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '[') {
                openIdx.add(i);
            }
        }
        int last = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '[') {
                openCount++;
            } else {
                closeCount++;
            }
            if (closeCount > openCount) {

                sb.replace(openIdx.get(last), openIdx.get(last) + 1, "]");
                closeCount--;
                openCount++;
                last++;
                ans++;
            }

        }
return ans;
    }
}