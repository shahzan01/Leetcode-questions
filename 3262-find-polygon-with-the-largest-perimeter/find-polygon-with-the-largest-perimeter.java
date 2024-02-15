class Solution {
    public long largestPerimeter(int[] arr) {
        Arrays.sort(arr);

        long prefix[] = new long[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        long ans = -1;

        for (int i = arr.length - 1; i > 0; i--) {
            if (prefix[i - 1] > arr[i]) {
                ans = prefix[i];
                break;
            }

        }
        return ans; 
    }
}