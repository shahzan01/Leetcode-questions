class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        r: for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                break;
            }
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue r;
            }

            int remtarget = 0 - arr[i];
            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                if (arr[j] + arr[k] == remtarget) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }

                else if (arr[j] + arr[k] > remtarget) {
                    k--;
                } else {
                    j++;
                }

            }

        }return ans;
    }
}