class Solution {
    public int[] twoSum(int[] arr, int tar) {
         int i=0;
       int n=arr.length;
       int j=n-1;
int ans[]=new int[2];
while (i<j) {
int sum=arr[i]+arr[j];
if(sum==tar){ans[0]=i+1;ans[1]=j+1;break;}
if(sum>tar){
    j--;
}
else{i++;}


    
}
return ans;
    }
}