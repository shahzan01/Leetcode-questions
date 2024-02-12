class Solution {
    int res=0;
    public int reversePairs(int[] nums) {
        sort(nums,0,nums.length-1);
        return res;
    }
 //No change in merge function
     void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        // Merge the temp arrays
 
        // Initial indices of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            int i=0,j=0;
            for(  i=l;i<=m;i++){
              for( j=m+1;j<=r;j++){
                  if(arr[i]<=2*(long)arr[j]){
                       res+=j-m-1;
                       i++;
                       j--;
                       if(i>m){j++; break;}
                       }        
              }
              if(j>r)
              res+=(r-m)*(m-i+1);
                   break;  
            }
                  
            merge(arr, l, m, r);
        }
    }    
} 