class Solution {
    public int rob(int[] arr) {

int rob=0;
int norob=0;
for(int i = 0; i < arr.length; i++){
    int newrob=norob+arr[i];
    int newnorob=Math.max(rob,norob);
    rob=newrob;
    norob=newnorob;
}
return Math.max(rob,norob);




    }
}