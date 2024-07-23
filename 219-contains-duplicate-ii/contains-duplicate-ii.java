class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
           HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                if (Math.abs(i - map.get(arr[i])) <= k) {
                   return true;
                }
                  map.put(arr[i], i);
            } else {
                map.put(arr[i], i);
            }
        }
        return false;  
    }
}