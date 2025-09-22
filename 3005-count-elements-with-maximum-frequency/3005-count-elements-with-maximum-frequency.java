class Solution {
    public int maxFrequencyElements(int[] nums) {

        // Set<Integer> arr = new HashSet<>();

        // for(int i: nums){
        //     arr.add(i);
        // }

        // return arr.size();

        HashMap<Integer,Integer>arr =new HashMap<>();

        for(int i : nums){
            arr.put(i,arr.getOrDefault(i,0)+1);
        }

        int max=0;

        for(int i : arr.values()){
            max=Math.max(max,i);
        }
        int count=0;

        for(int i: arr.keySet()){
            if(arr.get(i)==max)count+=arr.get(i);
        }

        return count;

    }
    
}