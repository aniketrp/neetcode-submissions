class Solution {
    HashSet<List<Integer>> res=new HashSet<>();
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
        dfs(i+1,nums,subset);
    }
}
