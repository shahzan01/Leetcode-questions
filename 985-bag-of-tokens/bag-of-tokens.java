class Solution {
    public int bagOfTokensScore(int[] token, int p) {
         int score = 0;
        int maxScore = 0;
        int i = 0;
        int j = token.length - 1;
        Arrays.sort(token);
        while (i <= j) {
            if (p >= token[i]) {
                score++;
                maxScore = Math.max(maxScore, score);
                p -= token[i];
                i++;
            } else {
               if (score >= 1) {
                    score--;
                    p += token[j];
                    j--;
                } else {
                    break;
                }
            }
        }

return maxScore;




    }
}