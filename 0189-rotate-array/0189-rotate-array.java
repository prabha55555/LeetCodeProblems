class Solution {
    public void rotate(int[] nums, int k) {
        //  int n=nums.length;
        //   k=k%n;
        // for(int i=0;i<k;i++){
        //     int first=nums[n-1];
        //     for(int j=n-1;j>0;j--){
        //         nums[j]=nums[j-1];
        //     }
        //     nums[0]=first;
        // }

        // for(int i=0;i<n;i++){
        //     System.out.print(nums[i]);
        // }
         k=k%nums.length;
         reverse(nums,0,nums.length-1);
         reverse(nums,0,k-1);
         reverse(nums,k,nums.length-1);
          
    }

        public static void reverse(int []nums,int start,int end){
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        
    
}