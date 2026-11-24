class Solution {
    public int climbStairs(int n) {

        if(n<=1)return 1;

        int first = 1;
        int second =1;
        int next=0;

        for(int i=2;i<=n;i++){
            next= first+second;

            first=second;
            second=next;

        }
     
     return next;
        
        // if(n==1 || n==2)return n;
        // return climbStairs(n-1)+climbStairs(n-2);



        
    }
}