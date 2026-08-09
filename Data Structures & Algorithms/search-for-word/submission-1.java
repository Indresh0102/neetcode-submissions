class Solution {
    private int ROWS, COLS;
    private boolean[][] visited;
    private int[][] directions = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
    public boolean exist(char[][] board, String word) {
        ROWS = board.length;
        COLS = board[0].length;
        visited = new boolean[ROWS][COLS];
        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                if(search(0,i,j,visited,board,word)){
                    return true;
                }
            }
        }
        return false;
        
    }
    private boolean search(int idx, int r, int c, boolean[][] visited, char[][] board, String word){    
        if(idx==word.length()){
            return true;
        }
        
        if(r<0 || c<0 || r>=ROWS || c>=COLS || board[r][c] != word.charAt(idx) || visited[r][c]){
            return false;
        }
    
        visited[r][c]=true;
        for(int i=0;i<4;i++){
            int nr=r+directions[i][0], nc=c+directions[i][1];
            
            if(search(idx+1,nr,nc,visited, board, word)){
                return true;
            }
        }
        visited[r][c]=false;
        return false;
    }
}
