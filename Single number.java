//logic:- Sort the array and then check if i and i+1 index value is equal or not
import java.util.*;
class Solution {
    public int singleNumber(int[] s) {
       int x=Integer.MAX_VALUE;

//sorting array using inbuilt sort function
Arrays.sort(s);

// using loop to check coditions
for(int i=0;i<s.length-1;i+=2){

if(s[i]==s[i+1]){continue;}
else{x=s[i];break;}
}
if(x==Integer.MAX_VALUE){x=s[s.length-1];}
 return x;   }
}