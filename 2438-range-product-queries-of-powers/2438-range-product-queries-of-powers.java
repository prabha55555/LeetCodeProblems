class Solution {

    // int power[]=new int[20];
        // int index=0;

        // for(int i=1;i<n;i*=2){
        //     power[index++]=i;
        // }

        // int res[]=new int[queries.length];

        // int indexx=0,sum=0;

        // for(int i=0;i<queries.length;i++){

        //       int a=queries[i][0];
        //       int b=queries[i][1];

        //       for(int j=a;j<b;j++){
                 
        //     sum+=power[j]*power[j+1];
 
        //       }                   This is contains some error but the approach was Good da dei Prabha 
        //       res[indexx++]=sum;
        // }
        

        // return res;
    public int mod = 1000_000_007;

    public int[] productQueries(int n, int[][] queries) {
        int len = queries.length;

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<32; i++){
            if(((1<<i) & n) != 0){ // set bit
                list.add(1<<i);
            }
        }

        int[] ans = new int[len];
        for(int i = 0; i<len; i++){
            int start = queries[i][0];
            int end = queries[i][1];

            long product = 1;
            for(int idx = start; idx<=end; idx++){
                product = (product * list.get(idx)) % mod;
            }

            ans[i] = (int)product;
        }

        return ans;
    }
}