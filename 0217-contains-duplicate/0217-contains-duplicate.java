class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> arr = new HashSet<>();
        for(int i : nums){
        if(!arr.contains(i)){
            arr.add(i);
        }else{
            return true;
        }
        }

       return false;
        
    }
}