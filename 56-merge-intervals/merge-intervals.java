class Solution {
    public int[][] merge(int[][] arr) {
         Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        List<int[]> li = new ArrayList<>();
        int start = arr[0][0];
        int end = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            } else {
                int temp[] = { start, end };
                li.add(temp);
                start = arr[i][0];
                end = arr[i][1];
            }

        }

        int temp[] = { start, end };
        li.add(temp);
        int ans[][] = new int[li.size()][2];
        int i = 0;
        for (int[] is : li) {
            ans[i][0] = is[0];
            ans[i][1] = is[1];
            i++;
        }return ans;
    }
}