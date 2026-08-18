class Solution {
    Set<List<Integer>> res=new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> perm=new ArrayList<>();
        dfs(nums,new boolean[nums.length],perm);
        return new ArrayList<>(res);
    }
    void dfs(int nums[],boolean visit[],List<Integer> perm){
        if(nums.length==perm.size()){
            res.add(new ArrayList<>(perm));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visit[i]){
                perm.add(nums[i]);
                visit[i]=true;
                dfs(nums,visit,perm);
                visit[i]=false;
                perm.remove(perm.size()-1);
            }
        }
    }
}