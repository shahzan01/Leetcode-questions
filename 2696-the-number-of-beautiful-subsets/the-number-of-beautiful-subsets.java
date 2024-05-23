class Solution {
     static int allsubset(int arr[], int i, ArrayList<Integer> temp, HashMap<Integer, Integer> hm, int k) {

        if (i >= arr.length) {
            if (temp.size() == 0) {
                return 0;
            }
            return 1;
        }
        if (!hm.isEmpty() && hm.containsKey(arr[i])) {
            return allsubset(arr, i + 1, temp, hm, k);
        }

        int ans1 = allsubset(arr, i + 1, temp, hm, k);
        temp.add(arr[i]);
        int a = arr[i] - k;
        int b = arr[i] + k;
        hm.put(a, hm.getOrDefault(a, 0) + 1);
        hm.put(b, hm.getOrDefault(b, 0) + 1);
        int ans2 = allsubset(arr, i + 1, temp, hm, k);
        temp.remove(temp.size() - 1);
        if (hm.get(a) == 1) {
            hm.remove(a);
        } else {
            hm.put(a, hm.get(a) - 1);
        }
        if (hm.get(b) == 1) {
            hm.remove(b);
        } else {
            hm.put(b, hm.get(b) - 1);
        }
        return ans1 + ans2;

    }
    public int beautifulSubsets(int[] arr, int k) {
 ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        return allsubset(arr, 0, temp, hm, k);
    }
}