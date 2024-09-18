class Solution {
    public String largestNumber(int[] nums) {
         String arr[] = new String[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        PriorityQueue<String> pq = new PriorityQueue<>(
                (a, b) -> {
                    String s1 = a + b;
                    String s2 = b + a;
                    return s2.compareTo(s1);
                });

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            sb.append((pq.poll()));
        }
                int n=0;
for(int i=0;i<sb.length();i++){
    if(sb.charAt(i)=='0'){
n++;
    }
}

if(n==sb.length()){return "0";}
  return sb.toString();
    }
}