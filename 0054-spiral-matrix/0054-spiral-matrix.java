class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int cls=0,rs=0,cle=matrix[0].length-1,re=matrix.length-1;

        List<Integer> res=new ArrayList<>();
   while(rs<=re && cls<=cle){
        for(int i=cls;i<=cle;i++){
            res.add(matrix[rs][i]);
        }
        rs++;

        for(int i=rs;i<=re;i++){
            res.add(matrix[i][cle]);
        }

        cle--;

        if(rs<=re){
            for(int i=cle;i>=cls;i--){
                res.add(matrix[re][i]);
            }
            
        }
        re--;
        
        if(cls<=cle){

            for(int i=re;i>=rs;i--){
                res.add(matrix[i][cls]);
            }

            cls++;
        }
        
    }
    return res;
     
    }

   
}