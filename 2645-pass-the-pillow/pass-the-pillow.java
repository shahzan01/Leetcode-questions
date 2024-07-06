class Solution {
    public int passThePillow(int n, int time) {
        int loop=time/(n-1);
int left=time%(n-1);


if(loop%2==0){
    return 1+left;
}
return n-left;
    }
}