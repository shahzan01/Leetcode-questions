class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
  HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            hm.put(arr2[i], i);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
           return hm.getOrDefault(a,arr1.length+ a) - hm.getOrDefault(b, arr1.length+b);
        });
        for (Integer i : arr1) {
            pq.add(i);
        }
        int idx = 0;
        while (!pq.isEmpty()) {
            arr1[idx] = pq.poll();
            idx++;
        }
  return arr1;
    }
}