class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0,target,0,candidates,subset);
        return res;
    }
    void dfs(int i,int target,int total,int[] candidates,List<Integer> subset){
        if(target==total){
            res.add(new ArrayList<>(subset));
            return;
        }
        if(i==candidates.length || target<total){
            return;
        }
        subset.add(candidates[i]);
        dfs(i+1,target,total+candidates[i],candidates,subset);
        subset.remove(subset.size()-1);
        while(i+1<candidates.length && candidates[i]==candidates[i+1]){
            i++;
        }
        dfs(i+1,target,total,candidates,subset);
    }
}
