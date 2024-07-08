class Solution {
      static int f(int n, int k) {
        if (n == 1) {
            return 0;
        }

        return (f((n - 1), k) + k) % n;

    }
    public int findTheWinner(int n, int k) {
return f(n,k)+1;
    }
}