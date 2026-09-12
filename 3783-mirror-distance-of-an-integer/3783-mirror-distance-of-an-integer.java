class Solution {
    public int mirrorDistance(int n) {

//        String str = String.valueOf(n);

//        String rev = "";

//        for(int i=str.length()-1;i>=0;i--)
//         rev+=str.charAt(i);

//  return Math.abs(n-Integer.parseInt(rev));

int m=n;
int val=0;

while(n!=0){
    int temp = n%10;
    val=val*10 + temp;
    n/=10;
}

return Math.abs(m - val);



        
    }

 
}