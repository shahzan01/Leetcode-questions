class Solution {
        static boolean fxn(int arr[],int k){
        if(arr.length==1){return false;}
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0, -1);
        int sum=0;
for(int i=0;i<arr.length;i++){
sum=(sum+arr[i])%k;
if(hm.containsKey(sum)){
    if(i-hm.get(sum)>1){return true;}
    
}
else{
hm.put(sum, i);
}

}

return false;

    }
    public boolean checkSubarraySum(int[] nums, int k) {
        return fxn(nums,k);
    }
}