class Solution {
    public int[] sortEvenOdd(int[] nums) {
        if(nums.length<3)
        return nums;

        List<Integer> odd =new ArrayList<>();
        List<Integer> even =new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            if(i%2==0)
            even.add(nums[i]);
            else
            odd.add(nums[i]);
        
        }

        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int evens =0, odds=0;
        int arr[]=new int [nums.length];
        for(int i=0;i<nums.length;i++){

            if(i%2==0){
                arr[i]=even.get(evens++);
            }
            else{
                arr[i]=odd.get(odds++);
            }
        }
        return arr;
        
    }
}