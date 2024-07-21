class Solution {
    static HashMap<Integer, ArrayList<Integer>> buildGraph(int arr[][]) {
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int u = arr[i][0];
            int v = arr[i][1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);

        }
        return graph;

    }

    static ArrayList<Integer> topSort(HashMap<Integer, ArrayList<Integer>> graph, int k) {
        ArrayList<Integer> topSortrArray = new ArrayList<>();
        int indegre[] = new int[k + 1];
        for (int i = 1; i <= k; i++) {
            for (Integer child : graph.getOrDefault(i, new ArrayList<>())) {
                indegre[child]++;
            }

        }
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 1; i <= k; i++) {
            if (indegre[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int cur = q.poll();

            visited.add(cur);
            topSortrArray.add(cur);
            for (Integer child : graph.getOrDefault(cur, new ArrayList<>())) {
                if (!visited.contains(child)) {
                    indegre[child]--;
                    if (indegre[child] == 0) {
                        q.add(child);
                    }
                }
            }
        }
        for (int i = 1; i < k; i++) {
            if (indegre[i] != 0) {
                return new ArrayList<>();
            }
        }

        return topSortrArray;
    }


    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
         HashMap<Integer, ArrayList<Integer>> rowGraph = buildGraph(rowConditions);
        HashMap<Integer, ArrayList<Integer>> colGraph = buildGraph(colConditions);
        ArrayList<Integer> topSortRow = topSort(rowGraph, k);
        ArrayList<Integer> topSortcol = topSort(colGraph, k);
   
        if (topSortRow.size() == 0 || topSortcol.size() == 0) {int a[][]={};
            return a;
        }
        int ans[][] = new int[k][k];
        int col[] = new int[k + 1];
        int idx = 0;
        for (Integer i : topSortcol) {
            col[i] = idx;
            idx++;
        }
        idx = 0;
        for (Integer i : topSortRow) {
            ans[idx][col[i]] = i;
            idx++;

        }  return ans;
    }
}