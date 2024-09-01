class Solution {  static class pair {
        int dmg;
        int health;

        pair(int a, int b) {
            this.dmg = a;
            this.health = b;
        }

    }
    public long minDamage(int power, int[] damage, int[] health) {
         int n = damage.length;
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> {
        int aMoves = (int) (Math.ceil((double) a.health / (double) power));
        int bMoves = (int) (Math.ceil((double) b.health / (double) power));

        return (a.dmg * aMoves + b.dmg * (bMoves + aMoves) - (b.dmg * bMoves + a.dmg
        * (aMoves + bMoves)));

        });
        long sum = 0;
        for (int i = 0; i < n; i++) {
        sum += damage[i];
        pq.add(new pair(damage[i], health[i]));
        }
        long ans = 0;
        while (!pq.isEmpty()) {
        pair cur = pq.poll();
        int d = cur.dmg;
        int h = cur.health;
        int move = (int) (Math.ceil((double) h / (double) power));
        ans += (long) (sum * move);
        sum -= d;

        }
return ans;
    }
}