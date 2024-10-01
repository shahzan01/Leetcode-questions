class Solution {
     static boolean helper(HashMap<Integer, List<Integer>> map, int k) {
        if (map.containsKey(0)) {
            if (map.get(0).size() % 2 != 0) {
                return false;
            }
        }
        if (k % 2 == 0) {
            // odd
            for (int i = 1; i < k / 2; i++) {
                int rem = k - i;
                if (map.getOrDefault(i, new ArrayList<>()).size() != map.getOrDefault(rem, new ArrayList<>()).size()) {
                    return false;
                }
            }
            if (map.getOrDefault(k / 2, new ArrayList<>()).size() % 2 != 0) {
                return false;
            }

        } else {
            for (int i = 1; i <= k / 2; i++) {
                int rem = k - i;
                if (map.getOrDefault(i, new ArrayList<>()).size() != map.getOrDefault(rem, new ArrayList<>()).size()) {
                    return false;
                }
            }

        }

        return true;
    }
    public boolean canArrange(int[] arr, int k) {
                int freq[] = new int[k];
        for (int i = 0; i < arr.length; i++) {
            freq[((arr[i] % k) + k) % k]++;
        }
        if(freq[0]%2!=0){return false;}
for(int i=1;i<=k/2;i++){
    if(freq[i]!=freq[k-i]){return false;}
}
    
return true;
    }
}