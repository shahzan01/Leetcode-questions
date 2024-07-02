class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
           HashMap<Integer, Integer> map1 = new HashMap<>();

        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map1.put(arr1[i], map1.getOrDefault(arr1[i], 0) + 1);
        }

        for (int i = 0; i < arr2.length; i++) {
            map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) + 1);
        }
        int len = 0;
        HashMap<Integer, Integer> a = new HashMap<>();
        for (Integer i : map1.keySet()) {

            if (map2.containsKey(i)) {

                a.put(i, Math.min(map1.get(i), map2.get(i)));
                len += a.get(i);
            }

        }

        int ans[] = new int[len];
        len = 0;
        for (Integer i : a.keySet()) {
            int frq = a.get(i);
            while (frq > 0) {
                ans[len] = i;
                frq--;
                len++;
            }
        }return ans; 
    }
}