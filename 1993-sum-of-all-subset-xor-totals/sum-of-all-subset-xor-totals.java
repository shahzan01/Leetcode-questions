class Solution {
        static void allsubset(int arr[], int i, ArrayList<ArrayList<Integer>> al, ArrayList<Integer> temp) {

        if (i >= arr.length) {
            ArrayList<Integer> n = new ArrayList<>(temp);
            al.add(n);
            return;

        }

        allsubset(arr, i + 1, al, temp);
        temp.add(arr[i]);
        allsubset(arr, i + 1, al, temp);
        temp.remove(temp.size() - 1);
        return;

    }

    public int subsetXORSum(int[] arr) {
       int ans = 0;

        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        allsubset(arr, 0, al, temp);
        for (ArrayList<Integer> i : al) {
            int t = 0;
            for (int j = 0; j < i.size(); j++) {
                t = t ^ i.get(j);
            }
            ans += t;
        }return ans;  
    }
}