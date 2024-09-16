class Solution {
    public int findMinDifference(List<String> li) {
 List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < li.size(); i++) {
            String t = li.get(i);
            int h = Integer.parseInt(t.substring(0, 2));
            int m = Integer.parseInt(t.substring(3, 5));
            if (h == 0) {
                arr.add((h * 60) + m);
               
            } else {
                arr.add((h * 60) + m);
            }
        }
        int ans = Integer.MAX_VALUE;
        Collections.sort(arr);

        for (int i = 1; i < arr.size(); i++) {
            ans = Math.min(ans, arr.get(i) - arr.get(i - 1));
            if(ans==0){break;}
        }ans = Math.min(ans, (24 * 60 + arr.get(0) - arr.get(arr.size() - 1)));
        return ans;
    }
}