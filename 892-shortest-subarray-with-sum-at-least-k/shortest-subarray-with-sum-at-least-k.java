class Solution {  static class  pair {
    long sum;int idx;
        pair(int i,long s){
            this.sum=s;
            this.idx=i;
        }
    }
    public int shortestSubarray(int[] arr, int k) {
           Deque<pair>dq=new ArrayDeque<>();
long sum=0;
int ans=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++){
    sum+=arr[i];
    if(sum>=k){
        ans=Math.min(ans, i+1);
    }
while (!dq.isEmpty() && sum-dq.peekFirst().sum >=k) {
    ans=Math.min(ans, i-dq.pollFirst().idx);
}
while (!dq.isEmpty() && sum<=dq.peekLast().sum) {
    dq.pollLast();
}
dq.addLast(new pair(i, sum));


}
return ans==Integer.MAX_VALUE?-1:ans;  
    }
}