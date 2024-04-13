class Solution {
     static int maxrectangle(int arr[]) {
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxA = 0;
        for (int i = 0; i <= n; i++) {
            int val = i == n ? -1 : arr[i];

            while (st.peek() != -1 && arr[st.peek()] > val) {
                int h = arr[st.peek()];
                st.pop();

                maxA = Math.max(maxA, (i - st.peek() - 1) * h);
            }
            st.push(i);

        }
        return maxA;
    }
    public int maximalRectangle(char[][] arr) {
         int n = arr.length;
        int maxA = 0;
        int m = arr[0].length;
        int dp[] = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == '1') {
                    dp[j]++;
                } else {
                    dp[j] = 0;
                }
            }
           
            int area = maxrectangle(dp);
            maxA = Math.max(maxA, area);

        }
return maxA;
    }
}