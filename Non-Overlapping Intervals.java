import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[1]-b[1]);
        int count=0;
        int previous_end=intervals[0][1];
        for(int i=1; i<intervals.length;i++){
            if(intervals[i][0]<previous_end){
                count++;
            }else{
                previous_end=intervals[i][1];
            }
        }
        return count;
    }
}