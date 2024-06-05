class Solution {
    public List<String> commonChars(String[] arr) {
         int n = arr.length;
        int freq[][] = new int[n][26];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length(); j++) {

                freq[i][arr[i].charAt(j) - 'a']++;
            }
        }
        List<String> ans = new ArrayList<>();
        r: for (int i = 0; i < 26; i++) {
            int count = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (freq[j][i] == 0) {
                    continue r;
                }
                count = Math.min(count, freq[j][i]);
            }

            if (count != Integer.MAX_VALUE) {
                while (count != 0) {
                    char c = (char) (i + 'a');
                    ans.add(Character.toString(c));
                    count--;
                }
            }

        }return ans; 
    }
}