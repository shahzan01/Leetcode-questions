class Solution { 
     static void maxDis(int arr[][], int ignore, int ans[]) {
        int maxsum[] = { Integer.MIN_VALUE, -1 };
        int maxdiff[] = { Integer.MIN_VALUE, -1 };
        int minsum[] = { Integer.MAX_VALUE, -1 };
        int mindiff[] = { Integer.MAX_VALUE, -1 };

        for (int i = 0; i < arr.length; i++) {
            if (i == ignore) {
                continue;
            }
            int sum = arr[i][0] + arr[i][1];
            int diff = arr[i][0] - arr[i][1];

            if (maxsum[0] < sum) {
                maxsum[0] = sum;
                maxsum[1] = i;
            }
            if (maxdiff[0] < diff) {
                maxdiff[0] = diff;
                maxdiff[1] = i;
            }
            if (minsum[0] > sum) {
                minsum[0] = sum;
                minsum[1] = i;
            }
            if (mindiff[0] > diff) {
                mindiff[0] = diff;
                mindiff[1] = i;
            }

        }

        if (maxsum[0] - minsum[0] >= maxdiff[0] - mindiff[0]) {
            ans[0] = maxsum[0] - minsum[0];
            ans[1] = maxsum[1];
            ans[2] = minsum[1];
        } else {
            ans[0] = maxdiff[0] - mindiff[0];
            ans[1] = maxdiff[1];
            ans[2] = mindiff[1];
        }

    }

    public int minimumDistance(int[][] arr) {
     int ans[] = { -1, -1, -1 };
      maxDis(arr, -1, ans);
int i=ans[1],j=ans[2];

maxDis(arr, i, ans);
int a=ans[0];
maxDis(arr, j, ans);
return Math.min(a, ans[0]);
    }
}