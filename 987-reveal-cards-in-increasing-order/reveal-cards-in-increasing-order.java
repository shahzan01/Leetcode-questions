class Solution {
    public int[] deckRevealedIncreasing(int[] arr) {
      Arrays.sort(arr);
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            q.addLast(i);
        }

        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[q.peekFirst()] = arr[i];
            q.pollFirst();
            q.addLast(q.pollFirst());
        }
        return ans;
    }
}