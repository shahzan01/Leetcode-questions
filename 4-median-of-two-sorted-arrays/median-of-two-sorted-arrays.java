class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        


int m=arr1.length;
int n=arr2.length;
int ans[]=new int[m+n];
int i=0;
int j=0;
int k=0;
while(i<m &&j<n){
    if(arr1[i]<arr2[j]){ans[k]=arr1[i];k++;i++;}
    else{ans[k]=arr2[j];k++;j++;}
}
while (i<m) {
ans[k++]=arr1[i++];    
}
while (j<n) {
    ans[k++]=arr2[j++];
    
}
double med;
if(ans.length%2 != 0){
med=ans[ans.length/2];
}
else{med=(double)((ans[(m + n) / 2]+ans[((m + n) / 2) - 1]))/2;}

return med;





    }
}