class Solution {
    public boolean canBeEqual(int[] arr, int[] nums) {
              HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map1.put(nums[i], map1.getOrDefault(nums[i], 0) + 1);

        }
for (int i : map.keySet()) {
    if(map1.getOrDefault(i, 0)!=map.get(i)){return false;}
}
return true;

    }
}