class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        
        // int count=0;

        // int r=dominoes.length;
        

        // for(int i=0;i<r-1;i++){

        //     for(int j=i+1;j<r;j++){

        //     if((dominoes[i][0]==dominoes[j][0] &&  dominoes[i][1]==dominoes[j][1] ) || (dominoes[i][0]==dominoes[j][1] &&      
        //         dominoes[i][1]==dominoes[j][0])){
        //            count++;
        //         } 
        // }
        // }

        // return count;

        int[] count = new int[100]; 
        int res = 0;

        for (int[] d : dominoes) {
            int key = Math.min(d[0], d[1]) * 10 + Math.max(d[0], d[1]);
            res += count[key];   
            count[key]++;        
        }
        return res;
    }
}

        
