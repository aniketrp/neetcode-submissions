class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0,target,0,curr,candidates);
        return res;
    }
    void dfs(int i,int target,int total,List<Integer> curr,int []candidates){
        if(target==total){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(i==candidates.length || target<total){
            return;
        }
        curr.add(candidates[i]);
        dfs(i+1,target,total+candidates[i],curr,candidates);
        curr.remove(curr.size()-1);
        while(i+1<candidates.length && candidates[i]==candidates[i+1]){
            i++;
        }
        dfs(i+1,target,total,curr,candidates);
    }
}
