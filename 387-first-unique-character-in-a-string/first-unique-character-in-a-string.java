class Solution {
    public int firstUniqChar(String s) {
int count[] = new int[26];
       
        for (int i = 1; i <=s.length(); i++) {
            int curr = s.charAt(i-1) - 'a';
            if (count[curr] == 0) {
                count[curr] = -i;
            } else {
                count[curr] = i;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (count[i] < 0) {
                ans = Math.min(ans, -count[i]);
            }
        }
 return ans == Integer.MAX_VALUE ? -1 : ans-1;







    }
}