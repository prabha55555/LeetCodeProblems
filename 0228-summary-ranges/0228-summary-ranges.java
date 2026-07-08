class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> res=new ArrayList<>();

        int left=0;

        for(int right=1;right<=nums.length;right++){
            if(right == nums.length || nums[right] != nums[right - 1] + 1){
                if(left==right-1){
                    res.add(String.valueOf(nums[left]));
                }
            else{
                res.add(nums[left] + "->" +nums[right-1]);
               
            }
             left=right;
            }
        }

        return res;
        
    }
}