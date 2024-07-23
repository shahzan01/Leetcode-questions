class Solution {
    public int[] frequencySort(int[] arr) {
        int freq[][] = new int[201][2];
        for (int i = 0; i < freq.length; i++) {
            freq[i][0] = i - 100;
        }

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            freq[a + 100][1]++;
        }
        Arrays.sort(freq, (a, b) -> {
            if (a[1] == b[1]) {
                return b[0] - a[0];
            }
            return a[1] - b[1];
        });
     
        int idx = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] == 0) {
                continue;
            } else {
                int count = freq[i][1];
                int val = freq[i][0];
                while (count > 0) {
                    arr[idx] = val;
                    count--;
                    idx++;
                }

            }
        }return arr;   
    }
}