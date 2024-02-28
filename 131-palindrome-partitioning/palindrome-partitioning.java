class Solution {
        static void helper(String s, int cur, List<List<String>> ans, List<String> al) {
        if (cur == s.length()) {
            ans.add(new ArrayList<>(al));
        }

        for (int i = cur; i < s.length(); i++) {
            String sub = s.substring(cur, i + 1);
            if (ispali(sub)) {
                al.add(sub);
                helper(s, i + 1, ans, al);
                al.remove(al.size() - 1);
            } else {
                continue;
            }
        }
    }
    
    static boolean ispali(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
         List<List<String>> ans = new ArrayList<>();
        List<String> al = new ArrayList<>();
        helper(s, 0, ans, al);
        return ans;
    }
}