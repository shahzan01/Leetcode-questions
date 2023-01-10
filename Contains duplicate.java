class Solution {
    public boolean containsDuplicate(int[] nums) {
//logic:- Sort the array and then check if i and i+1 index value is equal or not
        boolean s=false;

//sorting array using inbuilt sort function
 Arrays.sort(nums);

for(int i=0;i<nums.length-1;i++){
if(nums[i]==nums[i+1]){s= true;break;}
    
}return s; } 
}