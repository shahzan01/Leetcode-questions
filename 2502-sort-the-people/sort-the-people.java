class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
           TreeMap<Integer, String> tm = new TreeMap<>((a, b) -> b - a);
        for (int i = 0; i < heights.length; i++) {
            tm.put(heights[i], names[i]);
        }
        int idx = 0;
        for (String i : tm.values()) {
            names[idx] = i;
            idx++;
        }
        return names;
    }
}