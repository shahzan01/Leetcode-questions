class Solution {
      static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int firstMissingPositive(int[] arr) {
          int n = arr.length;
         HashSet<Integer>hs=new HashSet<>();
        for (int i = 0; i < n; i++) {
           hs.add(arr[i]);
        }

for(int i=1;i<n+1;i++){
if(!hs.contains(i)){return i;}
}

        return n+1;
    }
}