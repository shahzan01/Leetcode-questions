class Solution { static List<Integer> merger(int parent, List<Integer> child) {
        List<Integer> merged = new ArrayList<>();
        int i = 0;

        while (i < child.size() && child.get(i) <= parent) {
            merged.add(child.get(i));
            i++;
        }
        merged.add(parent);
        i++;
        while (i < child.size()) {
            merged.add(child.get(i));
        }
        return merged;
    }

    static List<Integer> merger(List<Integer> parent, List<Integer> child) {
        List<Integer> mergedArr = new ArrayList<>();
        int m = 0;
        int n = 0;
        while (m < parent.size() && n < child.size()) {
            if (parent.get(m) < child.get(n)) {
                while (m + 1 < parent.size() && parent.get(m + 1) == parent.get(m)) {
                    m++;
                }
                mergedArr.add(parent.get(m));
                m++;
            }

            else if (parent.get(m) > child.get(n)) {
                while (n + 1 < child.size() && child.get(n + 1) == child.get(n)) {
                    n++;
                }
                mergedArr.add(child.get(n));
                n++;
            }

            else {
                while (m + 1 < parent.size() && parent.get(m + 1) == parent.get(m)) {
                    m++;
                }
                while (n + 1 < child.size() && child.get(n + 1) == child.get(n)) {
                    n++;
                }
                mergedArr.add(parent.get(m));
                m++;
                n++;
            }

        }
        while (m < parent.size()) {
            while (m + 1 < parent.size() && parent.get(m + 1) == parent.get(m)) {
                m++;
            }
            mergedArr.add(parent.get(m));
            m++;
        }
        while (n < child.size()) {
            while (n + 1 < child.size() && child.get(n + 1) == child.get(n)) {
                n++;
            }
            mergedArr.add(child.get(n));
            n++;
        }
        return mergedArr;

    }

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
          int indegree[] = new int[n];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
        }
   
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            indegree[v]++;
            map.computeIfAbsent(u, l -> new ArrayList<>()).add(v);

        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

       while (!q.isEmpty()) {
            int cur = q.poll();
           
            for (int neig : map.getOrDefault(cur, Arrays.asList())) {
                List<Integer>t=new ArrayList<>();t.add(cur);
                ans.set(neig, merger(ans.get(cur), ans.get(neig)));
                ans.set(neig,merger(t, ans.get(neig)));
                indegree[neig]--;
                if (indegree[neig] == 0) {
                    q.add(neig);
                }

            }

        }
     return ans;
    }
}