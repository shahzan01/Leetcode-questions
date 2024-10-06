class Solution {
    static void dfs(HashMap<Integer, List<Integer>> graph, int k, HashSet<Integer> hs, HashSet<Integer> visited) {
        if (visited.contains(k)) {
            return;
        }
        visited.add(k);
        for (int i = 0; i < graph.getOrDefault(k, new ArrayList<>()).size(); i++) {
            int v = graph.get(k).get(i);
            hs.add(v);
            dfs(graph, v, hs, visited);
        }

        return;
    }

    static List<Integer> r(int n, int k, int[][] invocations) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < invocations.length; i++) {
            int u = invocations[i][0];
            int v = invocations[i][1];
            graph.computeIfAbsent(u, p -> new ArrayList<>()).add(v);
        }
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> visited = new HashSet<>();
        dfs(graph, k, hs, visited);
        hs.add(k);
        boolean t = false;
        for (int i = 0; i < invocations.length; i++) {
            int u = invocations[i][0];
            int v = invocations[i][1];
            if (!hs.contains(u) && hs.contains(v)) {
                t = true;
                break;
            }
        }

        if (t == true) {
            for (int i = 0; i < n; i++) {
                ans.add(i);
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (!hs.contains(i)) {
                    ans.add(i);
                }
            }
        }

        return ans;
    }

    public List<Integer> remainingMethods(int n, int k, int[][] i) {
        return r(n,k,i);
    }
}