class Solution {
    public int[][] insert(int[][] arr, int[] newInt) {
               List<int[]> li = new ArrayList<>();
  
        int idx = 0;
        int start = newInt[0];
        int end = newInt[1];
        while (idx < arr.length) {
            if (arr[idx][0] >= start) {
                break;
            }
            if (arr[idx][0] < start && arr[idx][1] >= start) {
                start = arr[idx][0];
                end = Math.max(end, arr[idx][1]);
                idx++;
                break;
            }

            li.add(arr[idx]);
            idx++;

        }
        for (int i = idx; i < arr.length; i++) {
            if (arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            } else {
                int temp[] = { start, end };
                li.add(temp);
                start = arr[i][0];
                end = arr[i][1];
            }
        }
        int temp[] = { start, end };
        li.add(temp);

        int ans[][] = new int[li.size()][2];
        int i = 0;
        for (int[] is : li) {
            ans[i][0] = is[0];
            ans[i][1] = is[1];
            i++;
        }
return ans;
    }
}