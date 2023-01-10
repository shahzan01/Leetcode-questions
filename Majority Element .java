class Solution {
    public int majorityElement(int[] nums) {

//Sorting given array using inbuilt sort function 
Arrays.sort(nums);

//creating variables for maxcount ,Current_count ,Value
int maxcount=0;
int count=1;
int val=0;

//If only one element is present in array It will be majority element
if(nums.length==1){return nums[0];}

//Iterating through the array and count how 
//Many times a number came

for(int i=0;i<nums.length-1;i++){
if(nums[i]==nums[i+1]){
count++;
}

//If current count is greater than maximum count replace value with current number 
else{count=1;}
if(count>maxcount){maxcount=count;val=nums[i];}

}
  return val; 
    }
}
