class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>subset=new ArrayList<>();
        Arrays.sort(nums);
        dfs(0,nums,new ArrayList<>());
        return new ArrayList<>(res);
    }
    void dfs(int i,int nums[],List<Integer> subset){
        if(i==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        dfs(i+1,nums,subset);
        subset.remove(subset.size()-1);
        while(i+1<nums.length && nums[i]==nums[i+1]){
            i++;
        }
        dfs(i+1,nums,subset);
    }
}
