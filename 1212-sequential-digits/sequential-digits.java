class Solution {
    public List<Integer> sequentialDigits(int min, int max) {
 int dmin = (int) (Math.log10(min) + 1);
        int dmax = (int) (Math.log10(max) + 1);
        ArrayList<Integer> al = new ArrayList<>();
        String arr[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        for (int x = dmin; x <= dmax; x++) {
            int digit = x;

            for (int i = 1; i < arr.length - digit + 1; i++) {
                int k = 0;
                String ans = "";
                while (k < digit) {
                    ans += arr[i + k];
                    k++;
                }
                al.add(Integer.parseInt(ans));
            }
        }
        List<Integer> finalans = new ArrayList<>();
        for (Integer k : al) {
            if (k >= min && k <= max) {
                finalans.add(k);
            }
        }





return finalans;








    }
}