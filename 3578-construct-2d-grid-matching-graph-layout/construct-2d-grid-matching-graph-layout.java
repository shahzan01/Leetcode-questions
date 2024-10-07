class Solution {
    
        static void dfs1(HashMap<Integer, List<Integer>> graph, boolean visit[], int ans[][], int idx, int n) {
        if (visit[n] == true) {
            return;
        }

        visit[n] = true;
        ans[idx][0] = n;
        for (int i = 0; i < graph.getOrDefault(n, new ArrayList<>()).size(); i++) {
            int v = graph.get(n).get(i);
            dfs1(graph, visit, ans, idx + 1, v);
        }
        return;
    }

    static int[] disgraph(HashMap<Integer, List<Integer>> graph, int k, int n) {
        int dis[] = new int[n];
        boolean visit[] = new boolean[n];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[k] = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> dis[a] - dis[b]);
        pq.add(k);
        while (!pq.isEmpty()) {
            int u = pq.poll();
            if (visit[u] == false) {
                visit[u] = true;
                for (int i = 0; i < graph.getOrDefault(u, new ArrayList<>()).size(); i++) {
                    int v = graph.get(u).get(i);
                    int w = 1;
                    if (dis[u] != Integer.MAX_VALUE && dis[v] > dis[u] + w) {
                        dis[v] = dis[u] + w;
                    }
                    if (visit[v] == false) {
                        pq.add(v);
                    }
                }

            }

        }

        return dis;
    }

    static int[] bfs(int source, HashMap<Integer, List<Integer>> adj, int n) {
        int[] dist = new int[n];
        int[] from = new int[n];
        Arrays.fill(dist, -1); // Initialize distances to -1
        Arrays.fill(from, -1); // Initialize path tracker to -1
        Queue<Integer> queue = new LinkedList<>();

        dist[source] = 0; // Source node has distance 0
        queue.add(source);

        while (!queue.isEmpty()) {
            int u = queue.poll(); // Dequeue the next node

            // Iterate over all the neighbors of node 'u'
            if (adj.containsKey(u)) {
                for (int v : adj.get(u)) {
                    // If the node hasn't been visited
                    if (dist[v] == -1) {
                        dist[v] = dist[u] + 1; // Set distance for neighbor
                        from[v] = u; // Track the path
                        queue.add(v); // Enqueue the neighbor
                    }
                }
            }
        }
        return from;
    }

    static List<Integer> getPath(int src, int dest, HashMap<Integer, List<Integer>> adj) {
        int n = adj.size();

        // Get the 'from' array that tracks the path using BFS
        int[] from = bfs(src, adj, n);
        List<Integer> path = new ArrayList<>();

        // Reconstruct the path from destination to source
        for (int node = dest; node != -1; node = from[node]) {
            path.add(node);
        }

        // Reverse the path to get from source to destination
        Collections.reverse(path);
        return path;
    }

    static int[][] c(int n, int[][] edges) {
        int indgree[] = new int[n];
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        int max = 0;
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
            indgree[u]++;
            indgree[v]++;
        }
        List<Integer> ind1 = new ArrayList<>();
        List<Integer> ind2 = new ArrayList<>();
        for (int i = 0; i < indgree.length; i++) {
            if (indgree[i] == 1) {
                ind1.add(i);
            }
            if (indgree[i] == 2) {
                ind2.add(i);
            }
        }
        if (ind1.size() == 2 && ind2.size() == n - 2) {
            int ans[][] = new int[n][1];

            boolean visit[] = new boolean[n];
            dfs1(graph, visit, ans, 0, ind1.get(0));
            return ans;
        }
        int dis[];
        dis = disgraph(graph, ind2.get(0), n);
        int cornerdis[] = new int[4];
        int minidx = -1;
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            cornerdis[i] = dis[ind2.get(i)];
            if (i != 0 && cornerdis[i] < m) {
                m = cornerdis[i];
                minidx = i;
            }
        }
        int cols = m + 1;
        int rows = n / cols;
        int ans[][] = new int[rows][cols];
        for (int[] is : ans) {
            Arrays.fill(is, -1);
        }
        List<Integer> firstrow = getPath(ind2.get(0), ind2.get(minidx), graph);
        for (int i = 0; i < firstrow.size(); i++) {
            ans[0][i] = firstrow.get(i);
        }

        for (int i = 1; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                HashSet<Integer> neig = new HashSet<>();
                int upper = ans[i - 1][j];
                int a = -1;
                for (int k = 0; k < 4; k++) {
                    int newx = dirx[k] + (i - 1);
                    int newy = diry[k] + j;

                    if (newx >= 0 && newy >= 0 && newx < ans.length && newy < ans[0].length) {
                        if (ans[newx][newy] != -1) {
                            neig.add(ans[newx][newy]);
                        }
                    }
                }

                for (int k = 0; k < graph.getOrDefault(upper, new ArrayList<>()).size(); k++) {
                    int v = graph.get(upper).get(k);
                    if (!neig.contains(v)) {
                        ans[i][j] = v;
                        break;
                    }
                }

            }
        }
       
        return ans;
    }
        static int dirx[] = { 0, 0, 1, -1, 1, 1, -1, -1 };
    static int diry[] = { 1, -1, 0, 0, 1, -1, 1, -1 };
    public int[][] constructGridLayout(int n, int[][] edges) {
        return c(n,edges);
    }
}