class Solution {
    static boolean grapgDfs(HashMap<Integer, ArrayList<Integer>> graph, HashSet<Integer> visit, int node, int des) {
        if (node == des) {
            return true;
        }

        visit.add(node);

        for (int neigb : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visit.contains(neigb)) {
                if (grapgDfs(graph, visit, neigb, des)) {
                    return true;
                }
            }
        }

        return false;

    }
    public boolean validPath(int n, int[][] arr, int s, int d) {

HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

        for (int[] i : arr) {
            int u = i[0];
            int v = i[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        HashSet<Integer> visit = new HashSet<>();

return grapgDfs(graph, visit, s, d);
       
        
    }
}