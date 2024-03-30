class Solution {static int helper(int arr[], int k) {
        int i = 0;
        int j = 0;
        int ans = 0;
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        while (i < n) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);

            while (hm.size() > k) {
                if (hm.get(arr[j]) - 1 == 0) {
                    hm.remove(arr[j]);
                } else {
                    hm.put(arr[j], hm.get(arr[j]) - 1);
                }
                j++;

            }
            ans += i - j + 1;
            i++;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] arr, int k) {
      

           
return helper(arr, k) - helper(arr, k - 1);
    }
}