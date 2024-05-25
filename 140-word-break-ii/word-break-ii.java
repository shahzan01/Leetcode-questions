class Solution {
     static void allString(ArrayList<ArrayList<String>> al, ArrayList<String> temp, HashSet<String> hs, String s, int i,
            int j, int len) {
        if (j > s.length()) {

            if (len == s.length()) {
                al.add(new ArrayList<>(temp));
            }
            return;
        }
        String sub = s.substring(i, j);
        if (hs.contains(sub)) {
            temp.add(sub);
            len += sub.length();
            allString(al, temp, hs, s, j, j + 1, len);
            temp.remove(temp.size() - 1);
            len -= sub.length();
        }
        allString(al, temp, hs, s, i, j + 1, len);
        return;

    }
    public List<String> wordBreak(String s, List<String> dic) {
        ArrayList<ArrayList<String>> al = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        for (String i : dic) {
            hs.add(i);
        }

        allString(al, temp, hs, s, 0, 1, 0);
        List<String> ans = new ArrayList<>();

        for (ArrayList<String> i : al) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < i.size(); j++) {
                sb.append(i.get(j));
                if (j == i.size() - 1) {
                    break;
                }
                sb.append(" ");
            }
            ans.add(sb.toString());

        }return ans;
    }
}