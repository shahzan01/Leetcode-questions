class Solution {
    static void dfs1(ArrayList<Integer> graph[], int cur, int par, int[] ans, int count[]) {

        for (int i = 0; i < graph[cur].size(); i++) {
            int child = graph[cur].get(i);
            if (child != par) {
                dfs1(graph, child, cur, ans, count);
                count[cur] += count[child];
                ans[cur] += count[child] + ans[child];
            }

        }

    }

    static void dfs2(ArrayList<Integer> graph[], int cur, int par, int[] ans, int[] count, int n) {

        for (int i = 0; i < graph[cur].size(); i++) {
            int child = graph[cur].get(i);
            if (child != par) {
                ans[child] = ans[cur] - count[child] + (n - count[child]);
                dfs2(graph, child, cur, ans, count, n);
            }

        }

    }



    public int[] sumOfDistancesInTree(int n, int[][] arr) {
        ArrayList<Integer> graph[] = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();

        }
        for (int[] i : arr) {
            graph[i[0]].add(i[1]);
            graph[i[1]].add(i[0]);
        }
        int ans[] = new int[n];
        int count[] = new int[n];
        Arrays.fill(ans, 0);
        Arrays.fill(count, 1);
        dfs1(graph, 0, -1, ans, count);
        dfs2(graph, 0, -1, ans, count, n);
        return ans;
    }
}