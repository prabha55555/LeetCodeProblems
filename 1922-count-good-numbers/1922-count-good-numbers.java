class Solution {
    public long pow(long b, long p, int m){
        b=b%m;
        long res= 1;
        while(p>0){
            if(p%2!=0){
                res= (res*b)%m;
            }
            b= (b*b)%m;
            p/=2;
        }
        return res;
    }
    public int countGoodNumbers(long n) {
        int m= 1_000_000_007;
        long ep=(n+1)/2;
        long op=n/2;
        long ec= pow(5, ep, m);
        long oc= pow(4, op, m);
        return (int)((oc*ec)%m);
    }
}