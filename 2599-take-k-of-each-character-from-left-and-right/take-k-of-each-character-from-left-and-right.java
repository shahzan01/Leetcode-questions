class Solution {
     static boolean hel(HashMap<Character, Integer> hm, int k) {
                if(hm.size()<3){return false;}

        for (int i : hm.values()) {
            if (i < k) {
                return false;
            }
        }
        return true;
    }

    static boolean check(String s, int k, int n) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int count = 3;
        for (int i = 0; i < n; i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        if (hel(hm, k)) {
            return true;
        }
        int j = n - 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (j < 0) {
                break;
            }
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            hm.put(s.charAt(j), hm.get(s.charAt(j)) - 1);

            j--;
            if (hel(hm, k)) {
                return true;
            }
        }

        return false;

    }
    public int takeCharacters(String s, int k) {
        if (s.length() < k * 3) {
            return -1;
        }
                if(k==0){return 0;}

        int low = k * 3;
        int high = s.length();
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(s, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans; 
    }
}