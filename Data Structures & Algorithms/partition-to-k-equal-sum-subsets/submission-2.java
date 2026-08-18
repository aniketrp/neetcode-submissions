class Solution {
    int target;
    int n;
    boolean used[];
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum % k != 0) return false;
        this.target=sum/k;
        this.n=nums.length;
        used=new boolean[n];
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++){
            int tmp=nums[i];
            nums[i]=nums[n-i-1];
            nums[n-i-1]=tmp;
        }
        return dfs(nums,k,0,0);
    }
    boolean dfs(int nums[],int k,int start, int subsetSum){
        if(k==0) return true;
        if(subsetSum==target) return dfs(nums,k-1,0,0);

        for(int i=start;i<nums.length;i++){
            if(used[i] || subsetSum + nums[i] > target){
                continue;
            }
            used[i]=true;
            if(dfs(nums,k,i+1,subsetSum+nums[i])){
                return true;
            }
            used[i]=false;
        }
        return false;
    }
}