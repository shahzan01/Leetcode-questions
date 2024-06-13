class Solution {
    public int majorityElement(int[] arr) {
         int majority = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0 && majority != arr[i]) {
                majority = arr[i];
                count = 1;
            } else if (arr[i] == majority) {
                count++;
            } else {
                count--;
            }
        }return majority;
    }
}