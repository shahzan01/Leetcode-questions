class Solution {
    static boolean ispalindrome(String s) {
        int right = s.length() - 1;

        int left = 0;
        while (right >= left) {
            if (s.charAt(left) != s.charAt(right)) {

                return false;
            }
            right--;
            left++;
        }
        return true;
    }
    public String firstPalindrome(String[] word) {
        String ans="";
        for (int i = 0; i < word.length; i++) {
            if(ispalindrome(word[i])){return word[i];
            }
        }
        return ans;
    }
}