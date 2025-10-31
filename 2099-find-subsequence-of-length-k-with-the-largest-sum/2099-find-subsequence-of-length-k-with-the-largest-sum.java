class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        int n=nums.length;

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> nums[a]-nums[b]);

        for(int i=0;i<n;i++){
            pq.add(i);
            if(pq.size()>k)pq.poll();
        }


        Set<Integer> arr= new HashSet<>(pq);

        int index=0;
        int res[]=new int[k];


        for(int i=0;i<n;i++){
            if(arr.contains(i)){

                res[index++]=nums[i];

            }
        }


        return res;
    }
}