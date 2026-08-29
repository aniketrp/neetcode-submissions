class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] res=Arrays.copyOf(nums,nums.length);
        PriorityQueue<Integer> minHeap=new PriorityQueue<>((a,b) -> 
        {
            if(res[a]!=res[b]) return Integer.compare(res[a],res[b]);
            return Integer.compare(a,b);
        });
        for(int n=0;n<nums.length;n++){
            minHeap.add(n);
        }
        for(int i=0;i<k;i++){
           int n=minHeap.poll();
           res[n]=res[n]*multiplier;
           minHeap.add(n);
        }
        return res;
    }
}