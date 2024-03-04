class Solution {
    public int singleNonDuplicate(int[] arr) {
            int high=arr.length-2;
            int low=1;
     if(arr.length==1){
    return arr[0];
     }
     int n=arr.length;
if(arr[0]!=arr[1]){return arr[0];}
if(arr[n-1]!=arr[n-2]){return arr[n-1];}
while (low<=high) {
    int mid=(low+high)/2;
    if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){return arr[mid];}
if(mid%2==0){
if(arr[mid]==arr[mid-1]){high=mid-1;}
else{low=mid+1;}


}
if(mid%2!=0){
    if(arr[mid]==arr[mid+1]){
high=mid-1;
    }
    else{low=mid+1;}
}




} 

return -1;










    }
}