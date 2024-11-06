class Solution {
      static int setbit(int n) {
        int c = 0;
        while (n > 0) {
            c++;

            n = (n & (n - 1));
        }
        return c;
    }
    public boolean canSortArray(int[] arr) {
        
          if (arr.length == 1) {
            return true;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], setbit(arr[i]));

        }
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    if (hm.get(arr[j]) == hm.get(arr[j - 1])) {
                        int t = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = t;
                          swap = true;
                    } else {
return false;
                    }
                }
            }
            if(swap==false){return true;}
        }
        return true;
    }
}