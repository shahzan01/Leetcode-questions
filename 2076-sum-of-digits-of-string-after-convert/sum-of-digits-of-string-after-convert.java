class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for (int j = 0; j < s.length(); j++) {
            int a = s.charAt(j) - 'a' + 1;
            while (a > 0) {
                sum += a % 10;
                a /= 10;
            }

        }
        s = String.valueOf(sum);
        for (int i = 0; i < k - 1; i++) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }
        return sum;  
    }
}