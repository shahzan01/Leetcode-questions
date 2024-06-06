class Solution {
     static boolean fxn(int arr[], int gs) {
        if (arr.length % gs != 0) {
            return false;
        }
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            tm.put(arr[i], tm.getOrDefault(arr[i], 0) + 1);
        }
        for (Integer i : tm.keySet()) {
            int freq = tm.get(i);
            if (freq == 0) {
                continue;
            }
            while (freq-- > 0) {
                for (int cur = i; cur < i + gs; cur++) {
                      if (tm.getOrDefault(cur, 0) == 0) {
                        return false;
                    }
                    tm.put(cur, tm.get(cur) - 1);
                }
            }

        }

        return true;

    }
    public boolean isPossibleDivide(int[] arr, int k) {
        return fxn(arr,k);
    }
}