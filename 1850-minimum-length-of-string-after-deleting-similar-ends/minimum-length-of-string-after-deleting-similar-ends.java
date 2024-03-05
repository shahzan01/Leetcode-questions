class Solution {
    public int minimumLength(String s) {
         int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            while (i < j && s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(j)) {
                i++;

            }

            while (i < j && s.charAt(j) == s.charAt(j - 1) && s.charAt(j) == s.charAt(i)) {
                j--;

            }
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                break;
            }
        }
if(j<i){return 0;}
return j-i+1;
    }
}