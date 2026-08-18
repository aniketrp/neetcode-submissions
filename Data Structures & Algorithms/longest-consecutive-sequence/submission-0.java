class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }

        for(int n:nums){
            int streak=0,curr=n;
            while(set.contains(curr)){
                streak++;
                curr++;
            }
            res=Math.max(res,streak);
        }
        return res;
    }
}
