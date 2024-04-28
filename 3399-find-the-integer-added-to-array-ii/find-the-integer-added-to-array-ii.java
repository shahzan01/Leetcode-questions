class Solution {
       static int[] fn(int[] arr, int i, int j, int num1[]) {
        int l = 0;
        for (int k = 0; k < num1.length; k++) {
            if (k == i || k == j) {
                continue;
            }
            arr[l] = num1[k];
            l++;
        }
        return arr;
    }

   

    static int fn2(int arr[], int num2[]) {
        int a = arr[0];
        int b = num2[0];
        int dif = b - a;
        for (int i = 1; i < arr.length; i++) {
            if (num2[i] - arr[i] == dif) {
                continue;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        return dif;

    }
    public int minimumAddedInteger(int[] num1, int[] num2) {
        int n1 = num1.length;
        int n2 = num2.length;

        Arrays.sort(num1);
        Arrays.sort(num2);
        int arr[] = new int[n2];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n1; i++) {
            for (int j = i + 1; j < n1; j++) {
                fn(arr, i, j, num1);

                min = Math.min(min, fn2(arr, num2));
            }
        }return min;
    }
}