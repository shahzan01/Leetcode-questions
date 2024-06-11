class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
            HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
        }
        int idx = 0;
        for (int i = 0; i < arr2.length; i++) {
            int cur = arr2[i];
            int curfreq = freq.get(cur);

            while (curfreq > 0) {
                arr1[idx] = cur;
                idx++;
                curfreq--;
            }

            freq.remove(cur);

        }
        int temp = idx;
        for (Integer i : freq.keySet()) {
            int cur = freq.get(i);
            while (cur > 0) {
                arr1[idx] = i;
                cur--;
                idx++;
            }
        }
        Arrays.sort(arr1, temp, arr1.length);
  return arr1;
    }
}