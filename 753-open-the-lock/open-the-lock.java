class Solution {static char turnRight(char c) {

        return (c == '9' ? '0' : (char) (c + 1));

    }

    static char turnLeft(char c) {
        return (c == '0' ? '9' : (char) (c - 1));
    }

    static void nextOption(String s, String[] arr) {
        int i = 0;

        for (int j = 0; j < 4; j++) {
            StringBuilder sb = new StringBuilder(s);
            char c = s.charAt(j);
            char tr = turnRight(c);
            char tl = turnLeft(c);
            sb.replace(j, j + 1, Character.toString(tr));
            arr[i] = sb.toString();
            i++;
            sb.replace(j, j + 1, Character.toString(tl));
            arr[i] = sb.toString();
            i++;

        }

    }

    static int bfs(String tar, String[] dep) {
        HashSet<String> visit = new HashSet<>();
        for (String s : dep) {
            visit.add(s);
        }
        if(visit.contains("0000")){return -1;}
        String s = "0000";
        Queue<String> q = new LinkedList<>();
        q.add(s);
        int ans = 0;
        q.add("");
        visit.add(s);
        r: while (!q.isEmpty()) {
            String cur = q.poll();
            if (cur == "" && !q.isEmpty()) {
                q.add("");
                ans++;
                continue r;
            } else if (cur == "" && q.isEmpty()) {
                break;
            }
            if (cur.equals(tar)) {
                return ans;
            }
            String[] arr = new String[8];
            nextOption(cur, arr);
            for (String st : arr) {
                if (!visit.contains(st)) {
                    q.add(st);
                    visit.add(st);
                }
            }

        }

        return -1;
    }
    public int openLock(String[] dep, String tar) {
        return bfs(tar, dep)
;    }
}