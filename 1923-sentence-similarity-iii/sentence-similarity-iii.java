class Solution {
      static void dbg(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }
     static boolean helper(String arr1[], String arr2[]) {

boolean done=false;
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i].equals(arr2[j])) {
                i++;
                j++;
            } else {
                  if (i == 0 || done) {
                    return false;
                }
                j++;
            }

        }

 if (i == arr1.length) {
            return true;
        }
        if (i == arr1.length && j == arr2.length) {
            return true;
        }
    
        return false;

    }
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
         String s1[] = sentence1.split(" ");
        String s2[] = sentence2.split(" ");
        int s1si = 0, s1ei = s1.length - 1;
        int s2si = 0, s2ei = s2.length - 1;

        // Increment both start indices while matching
        while (s1si <= s1ei && s2si <= s2ei && s1[s1si].equals(s2[s2si])) {
            s1si++;
            s2si++;
        }
        
        // Decrement both end indices while matching
        while (s1ei >= s1si && s2ei >= s2si && s1[s1ei].equals(s2[s2ei])) {
            s1ei--;
            s2ei--;
        }
        
        // Check if the remaining portion is a match
        return s1ei < s1si || s2ei < s2si;
    }
}