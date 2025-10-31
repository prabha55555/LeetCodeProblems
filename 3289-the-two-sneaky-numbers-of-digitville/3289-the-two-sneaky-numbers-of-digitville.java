class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int arr[]=new int [2];
        int arr1[]=new int[nums.length];

        for(int i : nums){
            arr1[i]++;

        }
        int k=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==2){
                arr[k++]=i;
            }
        }
        return arr;
        
    }
}