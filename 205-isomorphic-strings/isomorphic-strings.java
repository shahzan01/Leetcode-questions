class Solution {
    public boolean isIsomorphic(String s, String t) {
         HashSet<Character>hs=new HashSet<>();
        HashMap<Character, Character> hm = new HashMap<>();
        r: for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char d = t.charAt(i);
            if (hm.containsKey(c)) {
                if (hm.get(c) != d) {
                  return false;
                } else {
                    continue r;
                }
            }
            if(hs.contains(d)){return false;}
            hm.put(c, d);
            hs.add(d);
        }
return true;
    }
}