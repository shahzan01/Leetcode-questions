class Solution {
    static List<List<String>> mn=new ArrayList<>();
    
    public List<List<String>> solveNQueens(int n) {

char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        int leftrow[]=new int[n];
        int updiag[]=new int[2*n-1];
        int lowdia[]=new int[2*n-1];
   mn.removeAll(mn);
nQueens(board, 0,leftrow,updiag,lowdia);
 return mn;
        
    }

public static List<String> sto(char board[][]){
List<String> s=new ArrayList<>();
int n=board.length;
for(int i=0;i<n;i++){
  String sri="";
  for(int j=0;j<n;j++){
sri+=board[i][j];
  }
s.add(sri);}
return s;

}


public static void nQueens(char board[][],int col,int[] leftrow,int[] updiag, int[] lowdia){

if(col==board.length){
  
  mn.add(sto(board));
  return;}


for(int i=0;i<board.length;i++){

 if(leftrow[i]==0 && updiag[board.length-1+col-i]==0 && lowdia[col+i]==0){
leftrow[i]=updiag[board.length-1+col-i]=lowdia[col+i]=1;
board[i][col]='Q';
nQueens(board, col+1, leftrow, updiag, lowdia);
leftrow[i]=updiag[board.length-1+col-i]=lowdia[col+i]=0;
board[i][col]='.';
 }
}
}





public static boolean isSafe(char board[][],int row,int col){

//upper row
for(int i=row-1;i>=0;i--){
if(board[i][col]=='Q'){return false;}
}
//left diagonal
for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
  if(board[i][j]=='Q'){return false;}
}
//right diagonal
for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
  if(board[i][j]=='Q'){return false;}
 
} return true;
}




}