class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int arr[]=new int [rectangles.length];
        for(int i=0;i<rectangles.length;i++){
                arr[i]=Math.min(rectangles[i][0],rectangles[i][1]);

            }

        
        int max=Arrays.stream(arr).max().orElse(0);
            int count=0;
            for(int aa:arr){
                if(aa==max)count++;
            }
            return count;
        
    
}
}