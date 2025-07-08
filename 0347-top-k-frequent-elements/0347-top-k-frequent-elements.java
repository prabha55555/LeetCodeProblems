class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int i :nums){
            arr.put(i,arr.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer> res=new PriorityQueue<>((a,b)->arr.get(b)-arr.get(a));

        int arrr[]=new int[k];
        

       for(int i : arr.keySet()){
          res.add(i);
          }

          for(int i=0;i<k;i++){
            arrr[i]=res.poll();
          }

          
       
       return arrr;

       
        
    }
}