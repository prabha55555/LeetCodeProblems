class Solution {
    public int findLHS(int[] nums) {

        HashMap<Integer,Integer> arr=new HashMap<>();

        for(int i : nums){
            arr.put(i,arr.getOrDefault(i,0)+1);
        }

        int max=Integer.MIN_VALUE;

        for(int key : arr.keySet()){
            if(arr.containsKey(key+1)){
                int val=arr.get(key)+arr.get(key+1);

                max=Math.max(max,val);
            }
        }

        return max>0?max:0;

        
    }
}