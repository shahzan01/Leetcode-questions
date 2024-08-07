class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
       
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                if (k == 1) {
                   return arr[i];
                } else {
                    k--;
                }

            }

        }
        return "";
    }
}