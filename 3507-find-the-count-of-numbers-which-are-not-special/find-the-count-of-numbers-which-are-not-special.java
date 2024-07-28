class Solution {
        static int f(int l, int r) {
int coun=0;
int n=(int)Math.sqrt(r);
int prime[]=new int[n+1];
Arrays.fill(prime, 1);
prime[0]=prime[1]=0;
for(int i=2;i<prime.length;i++){
    if(prime[i]==1){
        for(int j=i*i;j<prime.length;j+=i){
            prime[j]=0;
        }
    }
}
for(int i=0;i<prime.length;i++){
    if(prime[i]==1){
        int primeSquare=i*i;
        if(primeSquare<=r && primeSquare>=l){coun++;}
    }
}

return (r-l+1)-coun;
        

     
    }
    public int nonSpecialCount(int l, int r) {
        return f(l,r);
    }
}