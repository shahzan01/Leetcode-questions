class Solution {

    public int search(int[] arr, int tar) {
       
        int low=0;
int high=arr.length-1;
while (low<=high) {
    int mid=(high+low)/2;
    if(arr[mid]==tar){return mid;}
if(arr[low]<=arr[mid]){
if(arr[low]<=tar && tar<=arr[mid]){high=mid-1;}
else{low=mid+1;}
}
else{
    if(arr[mid]<=tar && tar<=arr[high]){
        low=mid+1;
    
    }
    else{high=mid-1;}
}


}
return -1;
    }
}