class Solution {
    public boolean wordPattern(String pattern, String s) {
     HashMap<Character, String> map = new HashMap<>();
        String arr[] = s.split(" ");
        if(pattern.length() != arr.length){return false;}
HashSet<String>hs=new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            System.out.println(map);
            if (map.containsKey(c) && !map.get(c).equals(arr[i])) {
                return false;
            } else if(!map.containsKey(c)){
              if(map.containsValue(arr[i])){return false;}
                else{
                    map.put(c, arr[i]);
                 
                }
            }
            else{
                continue;
            }

        }
    return true;
    }
}