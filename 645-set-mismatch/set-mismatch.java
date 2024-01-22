class Solution {
    public int[] findErrorNums(int[] arr) {
          HashMap<Integer, Integer> hm = new HashMap<>();
        // value,idx
        int ri = -1;
        int sum = 0;
        int sum2 = (arr.length * (arr.length + 1)) / 2;
    
int ans[]=new int[2];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (hm.containsKey(arr[i])) {
                ri = i  ;
                continue;
            }
            hm.put(arr[i], i);
        }
        int val = sum2 - (sum - arr[ri]);
      ans[0]=arr[ri];
      ans[1]=val;
return ans;
    }
}