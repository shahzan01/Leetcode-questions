class Solution {
    public String customSortString(String order, String s) {
          HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        System.out.println(hm);
        StringBuilder sb = new StringBuilder();
       for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            if (hm.containsKey(c)) {
                sb.append(String.valueOf(c).repeat(hm.get(c)));
                hm.remove(c);
            }
        }

        for (Character cur : hm.keySet()) {
            sb.append(String.valueOf(cur).repeat(hm.get(cur)));
        }
        return sb.toString();
    }
}