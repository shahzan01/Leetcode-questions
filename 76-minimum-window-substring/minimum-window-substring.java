class Solution {
    public String minWindow(String s1, String s2) {
         String ans = "";
        if (s1.length() == 0 || s2.length() == 0 || s1.length() < s2.length()) {
           return ans;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            hm.put(s2.charAt(i), hm.getOrDefault(s2.charAt(i), 0) + 1);
        }

        int count = s2.length();
        int start = 0, end = 0, startidx = 0, minlenght = Integer.MAX_VALUE;
        while (end < s1.length()) {

            char cur = s1.charAt(end);
            if (hm.getOrDefault(cur, 0) > 0) {
                count--;
            }
            hm.put(cur, hm.getOrDefault(cur, 0) - 1);
            end++;
            while (count == 0) {
                if (end - start < minlenght) {
                    startidx = start;
                    minlenght = end - start;
                }
                char c = s1.charAt(start);
                hm.put(c, hm.getOrDefault(c, 0) + 1);
                if (hm.get(c) > 0) {
                    count++;

                }
                start++;

            }
           
        }


if(minlenght!=Integer.MAX_VALUE){ans = s1.substring(startidx, startidx + minlenght);return ans;}
       else{return ans;}









    }
}