class Solution {
    public int minDifference(int[] arr) {
     
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        int n = arr.length;
if(n<=4){return 0;}
        for (int i = 0; i <= 3; i++) {
            int low = arr[i];
            for (int j = 0; j <= 3 - i; j++) {
                int high = arr[n - j - 1];
               min=Math.min(min, high-low);
            }
        }
return min;   
    }
}