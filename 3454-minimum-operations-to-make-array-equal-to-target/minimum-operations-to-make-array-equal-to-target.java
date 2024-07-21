class Solution {
    static void change(int arr[], int start, int end, int ch) {
        for (int i = start; i < end; i++) {
            arr[i] += ch;
        }
    }

    public long minimumOperations(int[] arr, int[] tar) {
            int i = 0;
        long ans = 0;
    while (i < arr.length) {
            if (arr[i] == tar[i]) {
                i++;
                continue;
            } else if (arr[i] < tar[i]) {
                int start = i;
                int temp = i;
                int min = tar[i] - arr[i];
                while (temp < arr.length && arr[temp] < tar[temp]) {
                    min = Math.min(min, tar[temp] - arr[temp]);
                    temp++;
                }
                ans += min;
                change(arr, start, temp, min);

            }

            else {
                int start = i;
                int temp = i;
                int min = arr[i] - tar[i];
                while (temp < arr.length && arr[temp] > tar[temp]) {
                    min = Math.min(min, arr[temp] - tar[temp]);
                    temp++;
                }
                change(arr, start, temp, -min);
                ans += min;

            }

        }return ans;
    }
}