class Solution {
    public int findTheWinner(int n, int k) {
         ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int cur = 0;
        k--;
        while (list.size() > 1) {
            int remove = (cur + k) % list.size();

            list.remove(remove);
            cur = (remove) % list.size();
            System.out.println(cur);
            System.out.println(list);
        }
return list.get(0);
    }
}