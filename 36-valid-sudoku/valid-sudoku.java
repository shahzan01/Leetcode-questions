class Solution {
    
    static boolean isvalid(char board[][]){

for(int i=0;i<9;i+=3){
    for(int j=0;j<9;j+=3){
        HashSet<Character>hs=new HashSet<>();
for(int n=i;n<i+3;n++){
    for(int m=j;m<j+3;m++){
if(board[n][m]=='.'){continue;}
if(hs.contains(board[n][m])){System.out.println("1");return false;}
else{hs.add(board[n][m]);}
    }
}


    }
}

for(int i=0;i<9;i++){
    HashSet<Character>hs=new HashSet<>();
for(int j=0;j<9;j++){
    if(board[i][j]=='.'){continue;}
    if(hs.contains(board[i][j])){System.out.println("2");return false;}
    else{hs.add(board[i][j]);}
}



}
for(int i=0;i<9;i++){
    HashSet<Character>hs=new HashSet<>();
for(int j=0;j<9;j++){
    if(board[j][i]=='.'){continue;}
    if(hs.contains(board[j][i])){return false;}
    else{hs.add(board[j][i]);}
}



}










return true;



    }
    public boolean isValidSudoku(char[][] board) {
        return isvalid(board);
    }
}