class Solution {
     static class info {
        int health;
        char direc;
        int posti;

        info(int p, int h, char s) {
            this.health = h;
            this.posti = p;
            this.direc = s;
        }
    }

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
            int n = positions.length;
            TreeMap<Integer, info> tm = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            info ne = new info(i, healths[i], directions.charAt(i));
            tm.put(positions[i], ne);

        }
        Stack<info> st = new Stack<>();
          r: for (Integer i : tm.keySet()) {
            info cur = tm.get(i);
            l: while (!st.isEmpty() && (cur.direc == 'L' && st.peek().direc == 'R')) {
                int currHeal = cur.health;
                int stHeal = st.peek().health;
                if (currHeal == stHeal) {
                    st.pop();
                    continue r;
                } else if (currHeal < stHeal) {
                    st.peek().health = stHeal - 1;
                    continue r;
                } else {
                    st.pop();
                    currHeal--;
                    cur.health = currHeal;
                    continue l;
                }

            }

            st.push(cur);

        }


        PriorityQueue<info> pq = new PriorityQueue<>((a,b)->a.posti-b.posti);

        List<Integer> ans = new ArrayList<>();
        while (!st.isEmpty()) {
          pq.add(st.pop());

        }
while (!pq.isEmpty()) {
    ans.add(pq.poll().health);
}
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         return ans;
    }
}