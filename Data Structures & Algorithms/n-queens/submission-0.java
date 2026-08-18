class Solution {
    Set<Integer> col=new HashSet<>();
    Set<Integer> posDig=new HashSet<>();
    Set<Integer> negDig=new HashSet<>();
    List<List<String>> res =new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(char []r:board){
            Arrays.fill(r,'.');
        }
        backtrack(0,n,board);
        return res;
    }
    void backtrack(int r,int n,char[][] board){
        if(r==n){
            List<String> copy=new ArrayList<>();
            for(char[] row:board){
                copy.add(new String(row));
            }  
            res.add(copy);
            return;
        } 
        for(int c=0;c<n;c++){
            if(col.contains(c) || posDig.contains(c+r) || negDig.contains(r-c)){
                continue;
            }
            col.add(c);
            posDig.add(r+c);
            negDig.add(r-c);
            board[r][c]='Q';

            backtrack(r+1,n,board);

            col.remove(c);
            posDig.remove(r+c);
            negDig.remove(r-c);
            board[r][c]='.';
        }
    }
}
