class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edge) {
        if(n==1){      List<Integer> ans = new ArrayList<>();
         ans.add(0);
        
        return ans;
        
        
        }
          ArrayList<Integer> graph[] = new ArrayList[n + 1];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        int out[] = new int[n];

        for (int[] i : edge) {
            int u = i[0];
            int v = i[1];
            graph[u].add(v);
            graph[v].add(u);

            out[u]++;
            out[v]++;
        }
   
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < out.length; i++) {
            if (out[i] == 1) {
                q.add(i);
            }
        }
   

        while (n > 2) {
            int s = q.size();
            n -= s;
            while (s > 0 && !q.isEmpty()) {

                int t = q.remove();
                for (int j = 0; j < graph[t].size(); j++) {
                    int neig = graph[t].get(j);
                    out[neig]--;
                    if (out[neig] == 1) {
                        q.add(neig);
                    }
                }
                s--;
            }

        }
        List<Integer> ans = new ArrayList<>();
        System.out.println(q);
        while (!q.isEmpty()) {
            ans.add(q.poll());
        }
        return ans;
    }
}