class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
         int ans[] = { -1, -1 };
     
        double min = Integer.MAX_VALUE;
        PriorityQueue<double[]> pq = new PriorityQueue<>(Comparator.comparingDouble((double[] a) -> (double) a[0]));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                pq.add(new double[] { (double) arr[i] / arr[j], arr[i], arr[j] });
            }
        }
        while (!pq.isEmpty() && k > 1) {
            pq.poll();
            k--;

        }

        double ar[] = pq.poll();
      
        ans[0] = (int) ar[1];
        ans[1] = (int) ar[2];
        return ans;
    }
}