class Solution {
    public String replaceWords(List<String> dic, String sen) {
             HashSet<String> hs = new HashSet<>();
        for (String s : dic) {
            hs.add(s);
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        l: for (int i = 0; i < sen.length(); i++) {
            char c = sen.charAt(i);
            if (c == ' ') {
                System.out.println(temp);
                sb.append(temp + " ");
                temp.setLength(0);
                continue;
            }

            temp.append(c);
            if (hs.contains(temp.toString())) {
                System.out.println();
                while (i + 1 < sen.length() && sen.charAt(i + 1) != ' ') {
                    i++;

                }
                continue l;
            }

        }
        sb.append(temp);
   
  return sb.toString();
    }
}