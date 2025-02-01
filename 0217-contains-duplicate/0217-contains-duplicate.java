class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int aa : nums){
            arr.put(aa,arr.getOrDefault(aa,0)+1);
        }

        for(int aa : arr.values()){
            if(aa>=2)return true;
           
        }

        return false;

    }
}