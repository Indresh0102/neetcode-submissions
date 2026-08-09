class Solution {
    private boolean[][] visited;
    private int ROWS;
    private int COLS;
    public boolean exist(char[][] board, String word) {
        ROWS  = board.length;
        COLS = board[0].length;
        visited = new boolean[ROWS][COLS];
        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                if(dfs(i,j,0,board,word)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(int r, int c, int idx, char[][] board, String word){
        if(idx==word.length()){ //0==3
            return true;
        }
        if(r<0||c<0||r>=ROWS||c>=COLS||board[r][c]!=word.charAt(idx)||visited[r][c]){
            return false;
        }
        visited[r][c]=true;
        boolean res = (
            dfs(r,c-1,idx+1,board,word)||
            dfs(r,c+1,idx+1,board,word)||
            dfs(r-1,c,idx+1,board,word)||
            dfs(r+1,c,idx+1,board,word)
        );
        visited[r][c]=false;
        return res;
    }
}
