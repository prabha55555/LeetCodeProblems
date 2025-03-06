class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));

        int out[][]=new int [intervals.length][2];

        int m=0;

        out[m]=intervals[0];

        for(int i=1;i<intervals.length;i++){
            if(out[m][1]>=intervals[i][0]){
                out[m][1] = Math.max(out[m][1],intervals[i][1]) ;
            }
            else{
                m++;
                out[m]=intervals[i];
            }
        }
        return Arrays.copyOf(out,m+1);
    }
}