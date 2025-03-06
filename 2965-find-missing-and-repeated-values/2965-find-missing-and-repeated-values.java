class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
           
           int count[]= new int [grid.length*grid.length+1];
           int missing=-1,duplicate=-1;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                count[grid[i][j]]++;
            }
        }

        for(int i=1;i<count.length;i++){
            if(count[i]==2){
                duplicate=i;
            }
            else if(count[i]==0){
                missing=i;
            }
            
        }
        return new int[]{duplicate,missing};

          
    }
}