class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();

        int result=0;
        int maxCount=0;

        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>maxCount){
                result=i;
                maxCount=map.get(i);
            }
        }
        return result;
    }
}