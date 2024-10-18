class Solution {
     static void subset(int arr[], int idx, List<Integer> temp, List<Integer> li) {
        if (idx >= arr.length) {
            if (temp.size() == 0) {
                return;
            }
            int or = 0;
            for (int i = 0; i < temp.size(); i++) {
                or |= temp.get(i);
            }
                  max=Math.max(max, or);
            li.add(or);
            return;
        }
        subset(arr, idx + 1, temp, li);
        temp.add(arr[idx]);
        subset(arr, idx + 1, temp, li);
        temp.remove(temp.size() - 1);
        return;

    }
    static int max=0;
    public int countMaxOrSubsets(int[] arr) {
        max=0;
         List<Integer> temp = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        subset(arr, 0, temp, li);
      int ans = 0;
      
      

        for (int i =0;i<li.size();i++) {
           if(li.get(i)==max){ans++;}
        }
        return ans;
    }
}