class Solution {
    public int minOperations(String[] logs) {
           ArrayList<String> list = new ArrayList<>();
        list.add("main");
        for (String s : logs) {
            if (s.equals("./")) {
                continue;
            } else if (s.equals("../")) {
                if (list.size() > 1) {
                    list.remove(list.size() - 1);
                }
            } else {
                list.add(s);
            }
         
        }
return list.size()-1;
    }
}