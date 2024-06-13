class Solution {
    public int minMovesToSeat(int[] s, int[] st) {
        Arrays.sort(s);
        Arrays.sort(st);
int ans=0;
for(int i=0;i<s.length;i++){
ans+=Math.abs(s[i]-st[i]);
}

return ans;


    }
}