class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        dfs(0,target,nums,subset);
        return res;
    }
    void dfs(int i,int target,int[] nums,List<Integer> subset){
        if(target==0){
            res.add(new ArrayList<>(subset));
            return;
        }
        if(i>=nums.length || target<0){
            return;
        }
        subset.add(nums[i]);
        dfs(i,target-nums[i],nums,subset);
        subset.remove(subset.size()-1);
        dfs(i+1,target,nums,subset);
    }
}
