class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
                String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map1.put(arr1[i], map1.getOrDefault(arr1[i], 0) + 1);
        }

        for (int i = 0; i < arr2.length; i++) {
            map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) + 1);
        }
        List<String> a = new ArrayList<String>();
        for (String s : map1.keySet()) {
            if (map1.get(s) == 1 && !map2.containsKey(s)) {
                a.add(s);
            }
        }

        for (String s : map2.keySet()) {
            if (map2.get(s) == 1 && !map1.containsKey(s)) {
                a.add(s);
            }
        }
        String ans[] = a.toArray(new String[0]);
        return ans;
    }
}