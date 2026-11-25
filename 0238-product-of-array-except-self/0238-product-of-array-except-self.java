class Solution {
    public int[] productExceptSelf(int[] nums) {


    //    int[] leftproduct= new int[nums.length];
    //    int[] rightproduct= new int[nums.length];

    //     leftproduct[0]=1;
    //     rightproduct[nums.length-1]=1;

    //     for(int i=1;i<nums.length;i++){
    //         leftproduct[i]=leftproduct[i-1] * nums[i-1];
    //     }
    //     for(int i=nums.length-2;i>=0;i--){
    //         rightproduct[i]=rightproduct[i+1] * nums[i+1];
    //     }
    //     for(int i=0;i<nums.length;i++){
    //         if(i==0){
    //             nums[i]=rightproduct[i];
    //         }else if(i==nums.length-1){
    //             nums[i]=leftproduct[i];
    //         }
    //         else{
    //             nums[i]= leftproduct[i]*rightproduct[i];
    //         }
    //     }

    //     return nums;

      int result[] = new int[nums.length];

      int prefix=1;

      for(int i=0;i<nums.length;i++){

        result[i]= prefix;
        prefix=prefix * nums[i];

      }
      int suffix=1;

      for(int i=nums.length-1;i>=0;i--){
        result[i]= suffix * result[i];
        suffix= suffix*nums[i];

      }

      return result;
        
    }
}