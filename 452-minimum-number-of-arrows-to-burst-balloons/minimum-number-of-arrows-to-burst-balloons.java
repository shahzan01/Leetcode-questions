class Solution {
    public int findMinArrowShots(int[][] arr) {
     Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return 0;
            }
            if (a[0] > b[0]) {
                return 1;
            } else {
                return -1;
            }
        });
        int min = Integer.MAX_VALUE;
        int arrow = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp[] = arr[i];
            System.out.println(temp[0] + "sfdf");
            min = Math.min(min, temp[1]);
            System.out.println(min);
            if (temp[0] <= min && min <= temp[1]) {
                continue;
            } else {
                arrow++;
                min = temp[1];
                continue;
            }

        }
        arrow++;
        return arrow;
    }
}