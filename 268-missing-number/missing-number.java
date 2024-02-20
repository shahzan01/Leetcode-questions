class Solution {
    public int missingNumber(int[] arr) {

      int k = arr.length ;
        int sum = 0;
          boolean zero=false;
        int seriessum = (k * (k + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
              if(arr[i]==0){zero=true;}
            sum += arr[i];
        }
       
if(seriessum==sum && zero==true){return arr.length;}
if(seriessum==sum){return 0;}
return seriessum-sum;

    }
}