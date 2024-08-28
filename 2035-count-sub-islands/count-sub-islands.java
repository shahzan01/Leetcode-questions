class Solution {
    static boolean flag=true;
static void dfs(int i,int j,int grid1[][],int grid2[][], boolean visited[][]){
    if(i<0 || j<0 || i>=grid2.length || j>=grid2[0].length || grid2[i][j]==0 || visited[i][j]==true){return;}
visited[i][j]=true;
if(grid1[i][j]==0){flag=false;}
dfs(i-1, j, grid1, grid2, visited);
dfs(i, j-1, grid1, grid2, visited);
dfs(i, j+1, grid1, grid2, visited);
dfs(i+1, j, grid1, grid2, visited);





}

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int ans=0;
        boolean visited[][]=new boolean[grid1.length][grid1[0].length];
        for(int i=0;i<grid1.length;i++){
            for(int j=0;j<grid2[0].length;j++){
if(grid2[i][j]==1 && !visited[i][j]){
    flag=true;
    dfs(i,j,grid1,grid2,visited);
if(flag==true){ans++;}
}



            }
        }
        return ans;
    }
}