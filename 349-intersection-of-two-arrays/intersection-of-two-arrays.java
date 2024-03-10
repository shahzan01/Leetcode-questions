class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
          HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        HashSet<Integer> ans = new HashSet<>();

        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                ans.add(arr2[i]);
            }

        }
        int a[] = new int[ans.size()];
        int i = 0;
        for (Integer e : ans) {
            a[i] = e;
            i++;
        }
        return a;
    }
}