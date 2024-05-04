class Solution {
    public int numRescueBoats(int[] arr, int l) {
    

        int i = 0;
        int j = arr.length - 1;
        Arrays.sort(arr);
        int ans = 0;
        while (i <= j) {
            if (i == j) {
                ans++;
                break;
            }
            if (arr[i] + arr[j] <= l) {
                i++;
                j--;
                ans++;
            } else {
                j--;
                ans++;
            }

        }
     return ans; 
    }
}