class Solution {
     static List<Integer> hel(List<String> li, int s, int e) {
        if (s == e) {
            List<Integer> l = new ArrayList<>();
            l.add(Integer.parseInt(li.get(s)));
            return l;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = s; i < e; i += 2) {
            List<Integer> left = hel(li, s, i);
            List<Integer> right = hel(li, i + 2, e);
            if (li.get(i + 1).equals("+")) {
                for (Integer integer : right) {
                    for (Integer integer2 : left) {
                        ans.add(integer + integer2);
                    }

                }

            } else if (li.get(i + 1).equals("-")) {
                for (Integer integer : right) {
                    for (Integer integer2 : left) {
                        ans.add(integer2 - integer);
                    }

                }
            } else {
                for (Integer integer : right) {
                    for (Integer integer2 : left) {
                        ans.add(integer * integer2);
                    }

                }

            }

        }

        return ans;

    }
    public List<Integer> diffWaysToCompute(String s) {
  List<String> li = new ArrayList<>();
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                t += c;
            } else {
                li.add(t);
                li.add(String.valueOf(c));
                t = "";
            }
        }
        li.add(t);

      return hel(li, 0, li.size() - 1);
    }
}