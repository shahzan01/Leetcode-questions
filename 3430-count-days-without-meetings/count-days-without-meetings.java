class Solution {
    public int countDays(int day, int[][] meet) {
           Arrays.sort(meet, Comparator.comparing(a -> a[0]));
        ArrayList<int[]> al = new ArrayList<>();
        int s = meet[0][0];
        int e = meet[0][1];
        for (int i = 1; i < meet.length; i++) {
            if (meet[i][0] <= e) {
                e = Math.max(e, meet[i][1]);
                continue;
            } else {
                int temp[] = { s, e };
                al.add(temp);
                s = meet[i][0];
                e = meet[i][1];

            }

        }

        int temp[] = { s, e };
        al.add(temp);

        for (int i = 0; i < al.size(); i++) {
            temp = al.get(i);
            day -= (temp[1] - temp[0] + 1);
        }return day;
    }
}