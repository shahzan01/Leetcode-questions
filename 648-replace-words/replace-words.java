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
            for (int j = 0; j <= cur.length(); j++) {
                String sub = cur.substring(0, j);
                if (hs.contains(sub)) {
                    arr[i] = sub;
                    sb.append(sub + " ");
                    continue l;
                }

            }
            sb.append(arr[i] + " ");
        }
        sb.delete(sb.length()-1, sb.length() );
        System.out.println(sb);
        return sb.toString();
    }
}