import java.util.*;

class Solution {
    public int[][] validArrangement(int[][] pairs) {
        // Step 1: Build graph and degree maps
        HashMap<Integer, LinkedList<Integer>> graph = new HashMap<>();
        HashMap<Integer, Integer> indegree = new HashMap<>();
        HashMap<Integer, Integer> outdegree = new HashMap<>();

        for (int[] pair : pairs) {
            int u = pair[0], v = pair[1];
            graph.computeIfAbsent(u, k -> new LinkedList<>()).add(v);
            outdegree.put(u, outdegree.getOrDefault(u, 0) + 1);
            indegree.put(v, indegree.getOrDefault(v, 0) + 1);
        }

        // Step 2: Find the start node for Eulerian path or circuit
        int start = -1;
        for (int node : outdegree.keySet()) {
            if (outdegree.get(node) - indegree.getOrDefault(node, 0) == 1) {
                start = node; // Start node for Eulerian path
                break;
            }
        }

        if (start == -1) {
            start = pairs[0][0]; // Arbitrary start node for Eulerian circuit
        }

        // Step 3: Hierholzer's Algorithm to find the Eulerian path
        Stack<Integer> stack = new Stack<>();
        List<int[]> result = new ArrayList<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.peek();

            if (graph.containsKey(node) && !graph.get(node).isEmpty()) {
                int nextNode = graph.get(node).poll(); // Get and remove the next edge
                stack.push(nextNode);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    int prevNode = stack.peek();
                    result.add(new int[]{prevNode, node});
                }
            }
        }

        // Convert the result to array and reverse the order
        Collections.reverse(result);
        return result.toArray(new int[result.size()][]);
    }
}
