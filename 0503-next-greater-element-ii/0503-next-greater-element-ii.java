class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
       

        Stack<Integer>arr=new Stack<>();

        int[] res= new int [n];

        for(int i=(2 * n )-1;i>=0;i--){

          while(!arr.isEmpty() && arr.peek()<=nums[i%n]){
            arr.pop();
          }
          if(i<n){
            if(arr.isEmpty()){
                res[i]=-1;
     
            }
            else{
               res[i]=arr.peek();
            }
          }

          arr.push(nums[i%n]);
        }

        return res;
        
    }
}