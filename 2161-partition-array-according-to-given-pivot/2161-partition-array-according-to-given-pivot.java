class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        List<Integer> arr3=new ArrayList<>();
        

        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr1.add(nums[i]);
              
            }
            else if(nums[i]==pivot){
                arr2.add(nums[i]);
            }
            else if(nums[i]>pivot){
                arr3.add(nums[i]);
            }



        }
            arr1.addAll(arr2);
            arr1.addAll(arr3);
        return arr1.stream().mapToInt(Integer::intValue).toArray();



        
    }
}