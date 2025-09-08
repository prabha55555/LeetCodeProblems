class Solution {
    public int[] getNoZeroIntegers(int n) {

        int arr[]=new int[2];

        for(int i=1;i<n;i++){
            int b=n-i;

            if(isNoZero(i) && isNoZero(b)){
                return new int[]{i,b};
                }
            }
            return new int[2];
        }   


        boolean isNoZero(int a){
            int num=a;

            while(num>0){
                int digit=num%10;
                if(digit==0)return false;
                num/=10;
            }

            return true;
        }     
    }
