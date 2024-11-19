class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
          if (arr.length < k) {
return 0L;
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        long ans = 0;
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        int i = 0;
        int j = k;
        if (hm.size() == k) {
            ans = Math.max(ans, sum);
        }

        while (j < arr.length) {
            sum -= arr[i];
            if (hm.get(arr[i]) == 1) {
                hm.remove(arr[i]);
            } else {
                hm.put(arr[i], hm.get(arr[i]) - 1);
            }
            hm.put(arr[j], hm.getOrDefault(arr[j], 0) + 1);
            sum += arr[j];
            i++;
            j++;
            if (hm.size() == k) {
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
}