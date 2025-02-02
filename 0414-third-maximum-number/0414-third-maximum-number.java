class Solution {
    public int thirdMax(int[] nums) {

        Set<Integer> arr=new HashSet<>();
        for(int aa : nums){
            arr.add(aa);
        }
        List<Integer> arr1=new ArrayList<>(arr);

        Collections.sort(arr1,Collections.reverseOrder());

        if(arr1.size()>=3){
            return arr1.get(2);
        }
        else
        return arr1.get(0);
        
    }
}