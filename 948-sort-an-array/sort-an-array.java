class Solution {
     static int[] merge(int a[], int b[]) {
        int i = 0;
        int j = 0;
        int merged[] = new int[a.length + b.length];
        int idx = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                merged[idx] = a[i];
                i++;
            } else {
                merged[idx] = b[j];
                j++;
            }

            idx++;
        }
        while (i < a.length) {
            merged[idx] = a[i];
            i++;
            idx++;
        }
        while (j < b.length) {
            merged[idx] = b[j];
            j++;
            idx++;
        }

        return merged;

    }

    static int[] mergeSort(int arr[], int start, int end) {
        if (start == end) {
            int t[] = { arr[start] };

            return t;
        }
        int mid = (end+start)/2;
        ;

        int a[] = mergeSort(arr, start, mid);
        int b[] = mergeSort(arr, mid + 1, end);

        return merge(a, b);

    }
    public int[] sortArray(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}