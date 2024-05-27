class Solution {
    public int specialArray(int[] arr) {
        for(int i=0;i<=100;i++){
int count=0;
for(int j=0;j<arr.length;j++){
    if(arr[j]>=i){count++;}
}
if(count==i){return i;}
}
return -1;



    }
}