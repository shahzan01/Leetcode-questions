class Solution {
    public String replaceWords(List<String> dic, String sen) {
          HashSet<String> hs = new HashSet<>();
        for (String s : dic) {
            hs.add(s);
        }
        StringBuilder sb = new StringBuilder();
         String arr[] = sen.split(" ");
        l: for (int i = 0; i < arr.length; i++) {
            String cur = arr[i];
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < cur.length(); j++) {
                temp.append(cur.charAt(j));

                if (hs.contains(temp.toString())) {
                    arr[i] = temp.toString();
                    sb.append(temp + " ");
                    continue l;
                }

            }
            sb.append(arr[i] + " ");
        }
        sb.delete(sb.length() - 1, sb.length());
       
        return sb.toString();
    }
}