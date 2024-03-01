class Solution {
    public String maximumOddBinaryNumber(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        if(hm.containsKey('1')){
        int n = hm.get('1') - 1;

        for (int i = 0; i < n; i++) {
            sb.append("1");
        }
    }
        if (hm.containsKey('0')) {
            for (int i = 0; i < hm.get('0'); i++) {
                sb.append("0");
            }
        }
         if(hm.containsKey('1')){  sb.append("1");}
      
     return   sb.toString();




    }
}