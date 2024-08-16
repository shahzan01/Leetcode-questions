class Solution {
    public int maxDistance(List<List<Integer>> arr) {
              Collections.sort(arr, (a, b) -> a.get(0) - b.get(0));
               
        int max = 0;
        int samllest = arr.get(0).get(0);
        int largest = arr.get(0).get(arr.get(0).size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            int curSmallest = arr.get(i).get(0);
            int curLargest = arr.get(i).get(arr.get(i).size() - 1);
              System.out.println(Math.abs(largest - curSmallest)+","+ Math.abs(curLargest - samllest));
            max = Math.max(Math.abs(largest - curSmallest),max);
             max = Math.max(Math.abs(curLargest - samllest),max);
            largest = Math.max(largest, curLargest);
            samllest = Math.min(curSmallest, samllest);

        }
        return max;

    }
}