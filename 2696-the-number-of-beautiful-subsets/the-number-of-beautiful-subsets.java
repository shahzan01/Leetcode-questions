class Solution {
      static void allsubset(int arr[], int i, ArrayList<ArrayList<Integer>> al, ArrayList<Integer> temp) {

        if (i >= arr.length) {

            al.add(new ArrayList<>(temp));

            return;
        }

        allsubset(arr, i + 1, al, temp);
        temp.add(arr[i]);
        allsubset(arr, i + 1, al, temp);
        temp.remove(temp.size() - 1);
        return;

    }
    public int beautifulSubsets(int[] arr, int k) {
          ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        allsubset(arr, 0, al, temp);
        int ans = 0;
        r: for (ArrayList<Integer> i : al) {
            if (i.size() == 0) {
                continue;
            }
            if (i.size() == 1) {
                ans++;
                continue;
            }
            for (int j = 0; j < i.size(); j++) {
                for (int n = j + 1; n < i.size(); n++) {
                    int dif = Math.abs(i.get(j) - i.get(n));
                    if (dif == k) {
                        continue r;
                    }
                }
            }
            ans++;

        }
return ans;
    }
}