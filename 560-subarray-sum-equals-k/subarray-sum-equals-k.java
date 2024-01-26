class Solution {
    public int subarraySum(int[] arr, int k) {
       
		int ans = 0;
		int pfx[] = new int[arr.length];
		int sum = 0;
		pfx[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			pfx[i] = pfx[i - 1] + arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int s = 0;
				if (i == 0) {
					s = pfx[j];
				} else {
					s = pfx[j] - pfx[i - 1];
				}
				if (s == k) {
					ans++;
				}
			}
		}



return ans;





    }
}