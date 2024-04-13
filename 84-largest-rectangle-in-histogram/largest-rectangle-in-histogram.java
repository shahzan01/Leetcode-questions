class Solution {
    public int largestRectangleArea(int[] arr) {
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
}