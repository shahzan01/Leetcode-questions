class Solution {
    
    static void allsubset(int arr[], int i, List<List<Integer>> al, ArrayList<Integer> temp) {

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
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> al = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        allsubset(arr, 0, al, temp);
        return al;
    }
}