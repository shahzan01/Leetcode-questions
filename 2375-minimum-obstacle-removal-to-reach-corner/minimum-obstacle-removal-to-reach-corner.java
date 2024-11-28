import java.util.*;

class Solution {
    static class Tuple {
        int row, col, cost;

        Tuple(int row, int col, int cost) {
            this.row = row;
            this.col = col;
            this.cost = cost;
        }
    }

    public int minimumObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Directions for movement
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        // Deque for 0-1 BFS
        Deque<Tuple> deque = new ArrayDeque<>();
        deque.add(new Tuple(0, 0, 0));

        // Visited array to track minimum cost for each cell
        int[][] visited = new int[m][n];
        for (int[] row : visited) Arrays.fill(row, Integer.MAX_VALUE);
        visited[0][0] = 0;

        while (!deque.isEmpty()) {
            Tuple current = deque.pollFirst();
            int r = current.row;
            int c = current.col;
            int cost = current.cost;

            // If we've reached the bottom-right cell, return the cost
            if (r == m - 1 && c == n - 1) {
                return cost;
            }

            // Explore neighbors
            for (int[] dir : directions) {
                int newR = r + dir[0];
                int newC = c + dir[1];

                if (newR >= 0 && newC >= 0 && newR < m && newC < n) {
                    int newCost = cost + grid[newR][newC];

                    // If a cheaper cost is found, update and add to deque
                    if (newCost < visited[newR][newC]) {
                        visited[newR][newC] = newCost;

                        if (grid[newR][newC] == 0) {
                            deque.addFirst(new Tuple(newR, newC, newCost)); // Favorable move
                        } else {
                            deque.addLast(new Tuple(newR, newC, newCost)); // Costlier move
                        }
                    }
                }
            }
        }

        return -1; // In case no path exists (shouldn't happen for valid inputs)
    }
}
