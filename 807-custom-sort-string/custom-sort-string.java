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
                int fre = hm.get(c);
                while (fre > 0) {
                    sb.append(c);
                    fre--;
                }
                hm.remove(c);
            }
        }

        for (Character cur : hm.keySet()) {
            int fre = hm.get(cur);
            while (fre > 0) {
                sb.append(cur);
                fre--;
            }
        }
        return sb.toString();
    }
}