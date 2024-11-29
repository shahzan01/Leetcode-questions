class Solution {
   static class tuple {
        int row;
        int col;
        int cost;

        tuple(int r, int col, int c) {
            this.row = r;
            this.col = col;
            this.cost = c;
        }

    }

    static int solve(int grid[][]) {
        if (grid[0][1] > 1 && grid[1][0] > 1) {
            return -1;
        }
        int costs[][] = new int[grid.length][grid[0].length];
        for (int[] is : costs) {
            Arrays.fill(is, Integer.MAX_VALUE);
        }
        costs[0][0] = 0;
        PriorityQueue<tuple> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        pq.add(new tuple(0, 0, 0));
        int dir[][] = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        while (!pq.isEmpty()) {

            tuple cur = pq.poll();
            int currow = cur.row;
            int curcol = cur.col;
            int curcost = cur.cost;

            for (int i = 0; i < dir.length; i++) {
                int newrow = currow + dir[i][0];
                int newcol = curcol + dir[i][1];
                if (newrow >= 0 && newcol >= 0 && newrow < grid.length && newcol < grid[0].length) {
                    int newcost = (curcost + 1 >= grid[newrow][newcol] ? curcost + 1
                            : grid[newrow][newcol] + (((curcost + 1) & 1) == (grid[newrow][newcol] & 1) ? 0 : 1));
                    if (costs[newrow][newcol] == Integer.MAX_VALUE || costs[newrow][newcol] > newcost) {
                        costs[newrow][newcol] = newcost;

                        pq.add(new tuple(newrow, newcol, costs[newrow][newcol]));
                    }

                }

            }

        }

        return costs[grid.length - 1][grid[0].length - 1];

    }

    public int minimumTime(int[][] grid) {
        return solve(grid);
    }
}