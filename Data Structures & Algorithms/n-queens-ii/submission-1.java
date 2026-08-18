class Solution {
    Set<Integer> col=new HashSet<>();
    Set<Integer> posDig=new HashSet<>();
    Set<Integer> negDig=new HashSet<>();
    //List<List<String>> res=new ArrayList<>();
    int res;

    public int totalNQueens(int n) {
        res=0;
        dfs(0,n);
        return res;    }
    void dfs(int r, int n){
        if(r==n){
            res++;
            return;
        }
        for(int c=0; c<n; c++){
            if(col.contains(c) || posDig.contains(r+c) || negDig.contains(r-c)){
                continue;
            }
            col.add(c);
            posDig.add(r+c);
            negDig.add(r-c);

            dfs(r+1,n);

            col.remove(c);
            posDig.remove(r+c);
            negDig.remove(r-c);
        }
    }
}