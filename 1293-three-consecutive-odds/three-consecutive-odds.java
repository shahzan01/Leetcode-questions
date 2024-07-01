class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
         boolean ans = false;
      r:  for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                int loop = 2;
                i++;
                while (i < arr.length && loop > 0) {

                    loop--;
                    if (arr[i] % 2 == 0) {
                        continue r;
                    }
                    i++;
                }
                if (loop == 0) {
                    ans = true;
                    break;
                }
                break;
            }

        }
return ans;
    }
}