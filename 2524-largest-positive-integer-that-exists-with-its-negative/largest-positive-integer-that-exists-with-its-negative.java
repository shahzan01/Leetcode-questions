class Solution {
    public int findMaxK(int[] arr) {
              Arrays.sort(arr);
int i=0;
int j=arr.length-1;
while (i<j && arr[i]<0) {
    int a=arr[i]*-1;
    int b=arr[j];
    if(a==b){return a;}
    if(a>b){i++;}
    else{j--;}
}
return -1;  
    }
}