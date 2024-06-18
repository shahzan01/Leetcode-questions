class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gas_total=0;
int cost_total=0;
for(int i=0;i<gas.length;i++){
    cost_total+=cost[i];
    gas_total+=gas[i];
}
if(cost_total>gas_total){return -1;}
int res=0;
int total=0;
for(int i=0;i<cost.length;i++){
total+=gas[i]-cost[i];
if(total<0){
    total=0;
    res=i+1;
}}
return res;
    }
}