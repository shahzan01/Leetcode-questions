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
         HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int mod = arr[i] % k;
            if (mod < 0) {
                mod += k;
                mod %= k;
                map.computeIfAbsent(mod, n -> new ArrayList<>()).add(arr[i]);

            } else {
                map.computeIfAbsent(mod, n -> new ArrayList<>()).add(arr[i]);
            }
        }

       return helper(map, k);
    }
}