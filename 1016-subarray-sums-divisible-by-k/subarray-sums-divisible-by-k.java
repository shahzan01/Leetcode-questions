class Solution {
    public int subarraysDivByK(int[] arr, int k) {
            HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
            int mod = (sum % k);
            if (mod < 0) {
                mod = (mod + k) % k;
            }
            if (hm.containsKey(mod)) {

                ans += hm.get(mod);

            }
            hm.put(mod, hm.getOrDefault(mod, 0) + 1);
        
        }
return ans;
    }
}