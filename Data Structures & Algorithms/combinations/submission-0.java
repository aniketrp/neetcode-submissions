class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        res=new ArrayList<>();
        List<Integer> combination=new ArrayList<>();
        dfs(1,n,k,combination);
        return res;
    }
    void dfs(int start,int n, int k,List<Integer> combination){
        if(combination.size()>=k){
            res.add(new ArrayList<>(combination));
            return;
        }
        for(int i=start;i<=n;i++){
            combination.add(i);
            dfs(i+1,n,k,combination);
            combination.remove(combination.size()-1);
        }
    }
}