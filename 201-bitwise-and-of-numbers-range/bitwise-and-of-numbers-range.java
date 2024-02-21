class Solution {
    public int rangeBitwiseAnd(int l, int r) {
         long left = l;
     long right = r;
        if (left == 0) {
            System.out.println(0);
        }
        long a = left + 1;

        while (right > 0 && left < right) {
            right = right & (right - 1);
        }
return (int)right;



    }
}