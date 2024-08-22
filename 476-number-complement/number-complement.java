class Solution {
    public int findComplement(int num) {
    
    int len=0;
    int n=num;
    while(n>0){
len++;
n/=2;
    }
       
return num^((1<<len)-1);

    }
}