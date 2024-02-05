class Solution {
    public int firstUniqChar(String s) {

 HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            hm.put(curr, hm.getOrDefault(curr, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(hm.get(curr)==1){return i;}
        }
return -1;







    }
}