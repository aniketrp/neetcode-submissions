class Solution {
    List<List<Integer>> res; 
    public List<List<Integer>> permute(int[] nums) {
        res=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        if(nums.length==0){
            return res;
        }
        dfs(new boolean[nums.length],nums,new ArrayList<>());
        return res;
    }
    void dfs(boolean pick[],int nums[],List<Integer> subset){
        if(subset.size()==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!pick[i]){
                subset.add(nums[i]);
                pick[i]=true;
                dfs(pick,nums,subset);
                subset.remove(subset.size()-1);
                pick[i]=false;
            }
        }
    }
}
