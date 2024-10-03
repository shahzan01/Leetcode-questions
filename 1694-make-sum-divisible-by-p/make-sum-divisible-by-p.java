class Solution {
        static int helperf(int arr[], int p) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if (sum < p) {
            return -1;
        }
        if (sum == p) {
            return 0;
        }
        if (sum % p == 0) {
            return 0;
        }
        long mod = (long) sum % p;
        
        HashMap<Long, Integer> hm = new HashMap<>();
        hm.put((long) 0, -1);
        long s = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            long curmod = s % p;
            long tarmod = (curmod - mod + p) % p;
            if (hm.containsKey(tarmod)) {
                ans = Math.min(ans, i - hm.get(tarmod));
            }
            hm.put((s % p), i);
        }
if(ans==arr.length){return -1;}
        return ans == Integer.MAX_VALUE ? -1 : ans;

    }
    public int minSubarray(int[] nums, int p) {
 return helperf(nums,p);       
    }
}