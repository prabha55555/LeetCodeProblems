class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        List<Integer> arr= new ArrayList<>();
        int row=mat.length;
        int col=mat[0].length;
      
        for(int i=0;i<row;i++){
              int count=0;
            for(int j=0;j<col;j++){
                if(mat[i][j]==1)
                count++;
                else
                break;
            }
            arr.add(count);
        }

        int num[]=new int[k];
        
         int index=0;
        for(int i=0;i<k;i++){
             int min=Integer.MAX_VALUE;
            for(int j=0;j<arr.size();j++){

                if(arr.get(j)<min){
                    min=arr.get(j);
                    index=j;
                }
            }
            num[i]=index;
            arr.set(index,Integer.MAX_VALUE);
            
        }
        return num;

        
    }
}