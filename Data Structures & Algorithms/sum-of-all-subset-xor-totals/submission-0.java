class Solution {
    int res=0;
    public int subsetXORSum(int[] nums) {
        backtrack(0,nums,new ArrayList<>());
        return res;
    }
    void backtrack(int i,int[] nums,ArrayList<Integer> subset){
        int xorr=0;
        for(int n:subset){
            xorr^=n;
        }
        res=res+xorr;
        for(int j=i;j<nums.length;j++){
            subset.add(nums[j]);
            backtrack(j+1,nums,subset);
            subset.remove(subset.size()-1);
        }
    }
}