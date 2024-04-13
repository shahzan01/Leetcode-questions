class Solution {
    public int largestRectangleArea(int[] arr) {
         int n = arr.length;
        int ls[] = new int[n];
        int rs[] = new int[n];

        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for (int i = 0; i < n; i++) {
            int val = arr[i];

            while (st.peek() != -1 && arr[st.peek()] >= val) {
                st.pop();
            }
            ls[i] = st.peek();
            st.push(i);

        }
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        for (int i = n - 1; i >= 0; i--) {
            int val = arr[i];
            while (s.peek() != -1 && arr[s.peek()] >= val) {
                s.pop();
            }
            rs[i] = s.peek() == -1 ? n : s.peek();
            s.push(i);

        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int ar = (rs[i] - ls[i] - 1) * arr[i];
            max = Math.max(max, ar);
        } 
        return max;
    }
}