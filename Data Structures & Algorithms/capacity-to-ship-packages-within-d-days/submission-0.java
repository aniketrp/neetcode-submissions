class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int l=Arrays.stream(weights).max().getAsInt();
       int r=Arrays.stream(weights).sum();
       int res=r; 

       while(l<=r){
        int cap=(l+r)/2;
        if(isCapacity(weights,cap,days)){
            res=Math.min(res,cap);
            r=cap-1;
        }else{
            l=cap+1;
        }
       }
       return res;
    }
    boolean isCapacity(int[] weights,int cap,int days){
        int ships=1,currCap=cap;
        for(int w:weights){
            if(currCap-w<0){
                ships++;
                if(ships>days){
                    return false;
                }
                currCap=cap;
            }
            currCap=currCap-w;

        }
        return true;
    }
}