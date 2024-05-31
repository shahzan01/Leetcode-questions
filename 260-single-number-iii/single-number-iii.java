class Solution {
    public int[] singleNumber(int[] arr) {
if(arr.length==2){return arr;}
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
int i=0;
while((xor>>i & 1)==0){i++;}
        int a=0;int b=0;
for(int x :arr){
    if((x>>i &1 )==0){
        a^=x;
    }
    else{b^=x;}

}


int ans[]={a,b};
return ans;





    }
}