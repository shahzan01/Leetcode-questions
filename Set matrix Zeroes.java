class Solution {
    public void setZeroes(int[][] s) {

//Creating two arrays to store position of zeros named as row and column array.
  int row=s.length;
  int col=s[0].length;
  int r[]=new int[row];
  int c[]=new int[col];

//Filling all index in both arrays with value 1
  Arrays.fill(r,1);
  Arrays.fill(c, 1);

//Iterating through 3-D matrix and storing position of zero in row, column array
for(int m=0;m<row;m++){
  for(int n=0;n<col;n++)
{if(s[m][n]==0){
r[m]=0;
c[n]=0;
}
}}

//Again iterating through 3-D matrix and changing value to zero 
//if row or column array contains zero at same index
for(int i=0;i<row;i++){
  for(int j=0;j<col;j++){
if( r[i]==0 || c[j]==0 ){
  s[i][j]=0;
}
  }}
        
 }
}
