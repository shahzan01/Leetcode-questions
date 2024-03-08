class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
         int ans[] = new int[arr1.length];
        int n = arr2.length;
        Stack<Integer> st = new Stack<>();

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(arr2[n - 1], -1);
        st.push(arr2[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            int cur = arr2[i];
            if (st.peek() > cur) {
                hm.put(cur, st.peek());
                st.push(cur);
                continue;
            } else {
                while (!st.isEmpty() && st.peek() < cur) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    hm.put(cur, -1);
                    st.push(cur);
                    continue;
                } else {
                    hm.put(cur, st.peek());
                    st.push(cur);
                    continue;
                }
            }

        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = hm.get(arr1[i]);

        }
        return ans; 
    }
}