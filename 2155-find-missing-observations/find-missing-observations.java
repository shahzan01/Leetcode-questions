class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
int sum=0;
int m=rolls.length;
for(int i=0;i<rolls.length;i++){
    sum+=rolls[i];
}     
int total=mean*(n+m);
if(total<=sum){return new int[]{};}
total-=sum;
if(total>(n*6)){return new int[]{};}
if(total<(n)){return new int[]{};}
    System.out.println(total);
int mod=total%n;
int div=total/n;
int ans[]=new int[n];
for(int i=0;i<n;i++){
    ans[i]=div;
}
for(int i=0;i<mod;i++){
    ans[i]++;
}


return ans;




    }
}