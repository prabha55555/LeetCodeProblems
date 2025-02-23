class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r=image.length;
    
        int arr[][]=new int[r][r];
        
        for(int i=0;i<r;i++){
             int index=0;
            for(int j=r-1;j>=0;j--){
                if(image[i][j]==1){
                arr[i][index++]=0;
                
                }
                else{
                    arr[i][index++]=1;
                }
            }
        }
        return arr;
        
    }
}