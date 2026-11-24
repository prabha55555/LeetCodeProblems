class Solution {
    public int addDigits(int num) {

        // if(num<9){
        //     return num;
        // }

        // while(num>=10){
        //     int sum=0;
        //     while(num!=0){
        //         int digit=num%10;
        //         sum+=digit;
        //         num/=10;
        //     }
        //     num=sum;
        // }


        // return num;

        if(num>=0 && num<=9)return num;
        else{
            int sum=0;
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            return addDigits(sum);
        }
        
        
    }
}