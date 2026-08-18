class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        dfs(0,target,nums,curr);
        return res;
    }
    void dfs(int i,int target,int nums[],List<Integer> curr){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(i>=nums.length || target<0){
            return;
        }
        curr.add(nums[i]);
        dfs(i,target-nums[i],nums,curr);
        curr.remove(curr.size()-1);
        dfs(i+1,target,nums,curr);
    }
}
