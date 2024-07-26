class Solution {
       static class pair {
        int des;
        int wei;

        pair(int v, int f) {
            this.des = v;
            this.wei = f;
        }

    }
      static int[] dijkstra(HashMap<Integer, ArrayList<pair>> graph, int src, int n) {
        int dis[] = new int[n];
        boolean visit[] = new boolean[n];

        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[src] = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> dis[a] - dis[b]);
        pq.add(src);
        while (!pq.isEmpty()) {
            int cur = pq.poll();
            if (visit[cur] == false) {
                visit[cur] = true;
                ArrayList<pair> li = graph.getOrDefault(cur, new ArrayList<>());
                for (int i = 0; i < li.size(); i++) {
                    int u = cur;
                    int v = li.get(i).des;
                    int w = li.get(i).wei;
                    if (dis[v] > dis[u] + w) {
                        dis[v] = dis[u] + w;
                        pq.add(v);
                    }
                }

            }
        }
        return dis;

    }
    public int findTheCity(int n, int[][] edges, int maxdis) {
         HashMap<Integer, ArrayList<pair>> graph = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            pair p = new pair(edges[i][1], edges[i][2]);
            pair pp = new pair(edges[i][0], edges[i][2]);
            graph.computeIfAbsent(edges[i][0], k -> new ArrayList<>()).add(p);
            graph.computeIfAbsent(edges[i][1], k -> new ArrayList<>()).add(pp);
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
       PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            if (hm.getOrDefault(a,0) == hm.getOrDefault(b,0)) {
                return b - a;
            }
            return hm.getOrDefault(a,0) - hm.getOrDefault(b,0);
        });
        for (int i = 0; i < n; i++) {
            int temp[] = dijkstra(graph, i, n);
            for (int j : temp) {
                if (j != 0 && j <= maxdis) {
                    hm.put(i, hm.getOrDefault(i, 0) + 1);
                }
            }
            pq.add(i);
        }
        return pq.poll();
    }
}