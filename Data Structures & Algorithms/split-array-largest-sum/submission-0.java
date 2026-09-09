class Solution {
    public int splitArray(int[] nums, int k) {
        int l=Arrays.stream(nums).max().getAsInt();
        int r=Arrays.stream(nums).sum();
        int res=r;

        while(l<=r){
            int m=l+(r-l)/2;
            if(canSplit(nums,m,k)){
                res=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return res;
    }
    boolean canSplit(int[] nums,int largest,int k){
        int subArray=1;
        int currSum=0;
        for(int n:nums){
            currSum=currSum+n;
            if(currSum>largest){
                subArray++;
                if(subArray>k) return false;
                currSum=n;
            }
        }
        return true;
    }
}