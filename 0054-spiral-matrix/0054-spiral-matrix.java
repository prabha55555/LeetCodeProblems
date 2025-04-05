class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int rl=0;
        int ru=matrix.length-1;
        int cl=0;
        int cu=matrix[0].length-1;

        List<Integer> arr =new ArrayList<>();


        while(rl<=ru && cl<=cu){

            for(int i=cl;i<=cu;i++){
                arr.add(matrix[rl][i]);
            }
            rl++;
            for(int i=rl;i<=ru;i++){
                arr.add(matrix[i][cu]);
            }
            cu--;

           if(rl<=ru){

            for(int i=cu;i>=cl;i--){
                arr.add(matrix[ru][i]);
            }
            ru--;
           }
           if(cl<=cu){
            for(int i=ru;i>=rl;i--){
                arr.add(matrix[i][cl]);
            }
            cl++;

        }
        }

        return arr;
        
    }
}