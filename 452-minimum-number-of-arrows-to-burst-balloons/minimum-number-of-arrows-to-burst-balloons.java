class Solution {
    public int findMinArrowShots(int[][] arr) {
     Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int arrows = 0;
        int end = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= end) {
                end = Math.min(end, arr[i][1]);
            } else {
                arrows++;
                end = arr[i][1];
            }
        }
        arrows++;
        return arrows;
    }
}