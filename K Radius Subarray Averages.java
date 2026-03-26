class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            result[i]=-1;
        }
        if(k==0){
            return nums;
        }
        int wsize=(2*k)+1;
        if(wsize>n){
            return result;
        }
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(i>=wsize){
                sum-=nums[i-wsize];
            }
            if(i>=wsize-1){
                int center=i-k;
                result[center]=(int)(sum/wsize);
            }
        }
        return result;
    }
}