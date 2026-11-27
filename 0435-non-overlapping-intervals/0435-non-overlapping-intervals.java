class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));

        int prevend = intervals[0][1];
        int count=0;

        for(int i=1;i<intervals.length;i++){

        if(intervals[i][0]<prevend){
            count++;
        }else{
            prevend=intervals[i][1];
        }
       }

       return count;
    }
}