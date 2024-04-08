class Solution {
    public int countStudents(int[] students, int[] sand) {
           int one = 0;
        int zero = 0;
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < students.length; i++) {
            if (students[i] == 1) {
                one++;
            } else {
                zero++;
            }
            q.addLast(students[i]);
        }
        int i = 0;
        while (!q.isEmpty()) {

            if (q.peekFirst() == sand[i]) {
                if (sand[i] == 1) {
                    one--;
                } else {
                    zero--;
                }
                q.pollFirst();
                i++;
            }

            else {
                q.addLast(q.pollFirst());
                if (one == 0 && sand[i] == 1) {
                    break;
                } else if (zero == 0 && sand[i] == 0) {
                    break;
                }
            }

        } return q.size();
    }
}