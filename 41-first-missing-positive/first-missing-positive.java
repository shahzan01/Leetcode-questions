class Solution {
      static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int firstMissingPositive(int[] arr) {
          int n = arr.length;
         for (int i = 0; i < n; i++) {
            int num = arr[i];

            while (num > 0 && num <= n && num != arr[num - 1]) {
                swap(arr, i, num - 1);
                num = arr[i];

            }

        }



        for (int i = 0; i < n; i++) {
           if(arr[i]!=i+1){return i+1;}
        }
        return n+1;
    }
}