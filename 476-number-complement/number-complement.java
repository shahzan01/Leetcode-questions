class Solution {
    public int findComplement(int num) {
       String s=Integer.toBinaryString(num);
    int len=s.length();
return num^((1<<len)-1);

    }
}