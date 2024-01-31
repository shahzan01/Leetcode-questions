class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int ans[] = new int[arr.length];

		Stack<Integer> st = new Stack<>();// index

		for (int i = arr.length - 1; i >= 0; i--) {

			if (st.isEmpty()) {
				ans[i] = 0;
				st.push(i);
			} else {
				while ((!st.isEmpty() && arr[i] >= arr[st.peek()])) {
					System.out.println(st);
					st.pop();
				}
				if (st.isEmpty()) {
					ans[i] = 0;
				} else {
					ans[i] = st.peek() - i;
				}

				st.push(i);

			}
		}

return ans;


    }
}