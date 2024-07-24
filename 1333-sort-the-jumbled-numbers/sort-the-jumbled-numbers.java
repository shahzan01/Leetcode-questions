class Solution {
      static int replace(int mapping[], int n) {
          if (n == 0) {
            return mapping[0];
        }
        StringBuilder sb = new StringBuilder();
        int temp = n;
        while (temp > 0) {
            int u = temp % 10;
            int a = mapping[u];
            sb.insert(0, a);
            temp /= 10;
        }

        return Integer.parseInt(sb.toString());
    }
    public int[] sortJumbled(int[] mapping, int[] arr) {
           int mat[][] = new int[arr.length][2];
        HashMap<Integer, Integer> map1 = new HashMap<>();
    
        for (int i = 0; i < arr.length; i++) {
            map1.put(arr[i], i);
            int n = replace(mapping, arr[i]);
            mat[i][0] = arr[i];
            mat[i][1] = n;
        }

  

        Arrays.sort(mat, (a, b) -> {
            if (a[1] == b[1]) {
                return map1.get(a[0]) - map1.get(b[0]);
            }
            return a[1] - b[1];
        });
        for (int i = 0; i < arr.length; i++) {
           arr[i]=mat[i][0];
        }return arr;
    }
}