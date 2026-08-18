class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Collections.reverseOrder());
        for(int g:gifts){
            maxHeap.offer(g);
        }
        for(int i=0;i<k;i++){
            int g=maxHeap.poll();
            maxHeap.offer((int)Math.floor(Math.sqrt(g)));
        }
        int sum=0;
        while(!maxHeap.isEmpty()){
            sum=sum+maxHeap.poll();
        }
        return sum;
    }
}