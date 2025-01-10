class Solution {
    public int getMaximumGenerated(int n) {

        int num[] = new int[n+1];
         if(n==0)
         return 0;
         else if(n==1)return 1;
         num[0]=0;
         num[1]=1;
        for(int i=1;i*2<=n;i++){
            num[i*2]=num[i];
            if(2*i+1<=n)
            num[2*i+1]=num[i]+num[i+1];
            
        }
         
         return IntStream.of(num).max().orElse(0);


        
        

        
    }
   
}
