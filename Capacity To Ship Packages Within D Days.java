class Solution{
    public int shipWithinDays(int[] weights,int days){
        int left=0,right=0;
        for(int w:weights){
            left=Math.max(left,w);
            right+=w;
        }
        while(left<right){
            int mid=left+(right-left)/2;
            if(canship(weights,days,mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    private boolean canship(int[] weights,int days,int capacity){
        int currentweight=0,requireddays=1;
        for(int w:weights){
            if(currentweight+w>capacity){
                requireddays++;
                currentweight=0;
            }
            currentweight+=w;
        }
        return requireddays<=days;
    }
}
