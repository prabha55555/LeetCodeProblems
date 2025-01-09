class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[nums.length+1];
        int miss=0, duplicate = 0;

         for(int num : nums){
            arr[num]++;
         }

         for(int i=1;i<arr.length;i++){
             if(0==arr[i])
             miss=i;
             if(2==arr[i])
             duplicate=i;
                
             
         }

         return new int[]{duplicate,miss};
       
        
    
        
    }
}