class Solution {
    public double minimumAverage(int[] arr) {
        
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            tm.put(arr[i], tm.getOrDefault(arr[i], 0) + 1);

        }
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length / 2; i++) {
            double sum = tm.firstKey() + tm.lastKey();
            sum /= 2;

            if (tm.get(tm.firstKey()) > 1) {
                tm.put(tm.firstKey(), tm.get(tm.firstKey()) - 1);
            } else {
                tm.remove(tm.firstKey());
            }
            if (tm.get(tm.lastKey()) > 1) {
                tm.put(tm.lastKey(), tm.get(tm.lastKey()) - 1);
            } else {
                tm.remove(tm.lastKey());
            }
            min = Math.min(sum, min);

        }return min;
    }
}