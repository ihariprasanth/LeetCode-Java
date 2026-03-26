class Solution {
    public int largestAltitude(int[] gain) {
        int current=0;
        int maxvalue=0;
        for(int n:gain){
            current+=n;
            maxvalue=Math.max(current,maxvalue);
        }
        return maxvalue;
    }
}
