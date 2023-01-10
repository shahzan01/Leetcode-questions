import java.util.*;
class Solution {
    public void sortColors(int[] s) {
//logic :- Count number of zeroes, ones, twos in array and then filling array with proper position of numbers
int count0=0;
int count1=0;

// 1st loop to count number of zeroes and ones 
for(int i=0;i<s.length;i++){
if(s[i]==0){
  count0++;
}
if(s[i]==1){count1++;}
}

int x=0;
int count2=s.length-count0-count1;

// using while loop to fill array
while(count0>0 ||count1>0|| count2>0){
if(count0>0){
  s[x]=0;
  x++;
  count0--;
}
else if(count1>0){s[x]=1;x++;count1--;}
else{s[x]=2;x++;count2--;}

}


}



}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
