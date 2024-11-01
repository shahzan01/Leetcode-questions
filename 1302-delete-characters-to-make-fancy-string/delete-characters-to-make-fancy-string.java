class Solution {
    public String makeFancyString(String s) {
         HashSet<Integer> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                if (count >= 3) {
                    hs.add(i);
                }
            } else {
                count = 1;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!hs.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}