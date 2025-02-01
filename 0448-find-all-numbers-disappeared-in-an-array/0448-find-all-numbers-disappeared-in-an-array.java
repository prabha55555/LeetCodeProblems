class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int count[]=new int[nums.length+1];
        List<Integer> arr=new ArrayList<>();

        for(int aa : nums){
            count[aa]++;

        }
        
        for(int i=1;i<count.length;i++){
            if(count[i]==0)

            arr.add(i);

        }
        return arr;
        
    }
}