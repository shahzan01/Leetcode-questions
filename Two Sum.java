class Solution {
    public static int[] twoSum(int[] nums, int target) {
//logic :- We need to find a subset from given array whose sum is equal to asked value
        int s[]=new int[2];


        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                
                if(nums[i]+nums[j]==target){
                    s[0]=i;
                    s[1]=j;
                    
                }
            }
        }
        
 return s;   }
}