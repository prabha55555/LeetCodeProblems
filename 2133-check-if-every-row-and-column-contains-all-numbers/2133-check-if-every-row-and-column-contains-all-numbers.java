class Solution {
    public boolean checkValid(int[][] matrix) {
        
        int n=matrix.length;

       

        for(int i =0;i<n;i++){
             HashSet<Integer> arr =new HashSet<>();
            for(int j=0;j<n;j++){
                if(matrix[i][j]>0 && matrix[i][j]<=n){
                    arr.add(matrix[i][j]);
                }
            }
             
        if(arr.size()!=n)return false;
    }

       

        for(int i =0;i<n;i++){
            
         HashSet<Integer> arr2 =new HashSet<>();
            for(int j=0;j<n;j++){
                if(matrix[j][i]>0 && matrix[j][i]<=n){
                    arr2.add(matrix[j][i]);
                }
                 
            }
            if(arr2.size()!=n)return false;

        }
        return true;
       
        
    }
}