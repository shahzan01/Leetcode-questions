class Solution {
       static class dsu1 {
        int par[];
        int rank[];

        dsu1(int n) {
            rank = new int[n];
            par = new int[n];
            for (int i = 0; i < n; i++) {
                par[i] = i;
            }
        }

        int find(int n) {
            if (par[n] == n) {
                return n;
            }
            return par[n] = find(par[n]);
        }

        void union(int a, int b) {
            int para = find(a);
            int parb = find(b);
            if (rank[para] == rank[parb]) {
                rank[para]++;
                par[parb] = para;
            } else if (rank[para] > rank[parb]) {
                par[parb] = para;
            } else {
                par[para] = parb;
            }

        }

    }
    public int removeStones(int[][] stones) {
         int n = stones.length;
        dsu1 ds = new dsu1(n);
        for (int i = 0; i < n; i++) {
            int r = stones[i][0];
            int c = stones[i][1];
            for (int j = i + 1; j < n; j++) {
                if (stones[j][0] == r) {
                    ds.union(i, j);
                } else if (stones[j][1] == c) {
                    ds.union(i, j);
                }
            }
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
           hs.add(ds.find(i));
        }
      return  n-hs.size();
    }
}