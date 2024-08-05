class Solution {
    public boolean isInterleave(



        String s1, String s2, String s3) {  
            int x = s1.length();
        int y = s2.length();
        int z = s3.length();
        if(x+y!=z){
            return false;
        } 
            
            
        int n = s1.length();
        int m = s2.length();
        boolean dp[][] = new boolean[n+ 1][m+ 1];
        dp[0][0] = true;
        for (int i = 1; i < dp.length; i++) {
           if(s1.charAt(i-1) == s3.charAt(i-1)){
                dp[i][0]=true;
            } 
            else break;
        }
        for (int j = 1; j < dp[0].length; j++) {
            if(s2.charAt(j-1) == s3.charAt(j-1)){
                dp[0][j]=true;
            } 
            else break; 
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {

                dp[i][j] = (dp[i - 1][j] && s3.charAt(i + j - 1) == s1.charAt(i - 1))
                        || (dp[i][j - 1] && (s3.charAt(i + j - 1) == s2.charAt(j - 1)));

            }
        }
    return dp[n][m];
    }
}