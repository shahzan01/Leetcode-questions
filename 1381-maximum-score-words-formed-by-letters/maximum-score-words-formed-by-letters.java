class Solution {
     static void allwordsubset(String[] word, int i, ArrayList<ArrayList<String>> al, ArrayList<String> temp) {
        if (i >= word.length) {
            al.add(new ArrayList<>(temp));
            return;
        }

        allwordsubset(word, i + 1, al, temp);

        temp.add(word[i]);
        allwordsubset(word, i + 1, al, temp);

        temp.remove(temp.size() - 1);
        return;

    }

    static boolean validSubset(ArrayList<String> s, HashMap<Character, Integer> hm) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (String cur : s) {
            for (int i = 0; i < cur.length(); i++) {
                char c = cur.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        for (Character c : map.keySet()) {
            if (hm.getOrDefault(c, 0) < map.get(c)) {
                return false;
            }
        }
        return true;

    }

    public int maxScoreWords(String[] word, char[] letters, int[] score) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < letters.length; i++) {
            hm.put(letters[i], hm.getOrDefault(letters[i], 0) + 1);
        }
        int ans = Integer.MIN_VALUE;

        ArrayList<ArrayList<String>> al = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        allwordsubset(word, 0, al, temp);
        for (ArrayList<String> s : al) {
            if (validSubset(s, hm)) {
                int sc = 0;
                for (String cur : s) {
                    for (int i = 0; i < cur.length(); i++) {
                        char c = cur.charAt(i);
                        sc += score[c - 'a'];
                    }
                }
                ans = Math.max(ans, sc);
            }
        }
return ans;
    }
}