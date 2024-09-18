class Solution {
    public String largestNumber(int[] nums) {
         int z=0;
         String arr[] = new String[nums.length];
        for (int i = 0; i < arr.length; i++) {
            if(nums[i]==0){z++;}
            arr[i] = String.valueOf(nums[i]);
        }
if(z==nums.length){return "0";}
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

  return sb.toString();
    }
}