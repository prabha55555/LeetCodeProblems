class Solution {
    public int leastInterval(char[] tasks, int n) {

        HashMap<Character,Integer> arr=new HashMap<>();

        for(char ch : tasks){
            arr.put(ch,arr.getOrDefault(ch,0)+1);
        }
          int min=Integer.MAX_VALUE,count=0;
        Queue<Character> pq=new PriorityQueue<>((a,b)->arr.get(b)-arr.get(a));

       pq.addAll(arr.keySet());
        int time=0;
        
      int cycle=n+1;
        while(!pq.isEmpty()){
            int taskExecuted=0;
            List<Character> temp=new ArrayList<>();

            for(int i=0;i<cycle && !pq.isEmpty();i++){
             char ch = pq.poll();

            if(arr.get(ch)>1){temp.add(ch);arr.put(ch,arr.get(ch)-1);}
            time++;
            taskExecuted++;


        }



        for(char i : temp)pq.offer(i);

        if(!pq.isEmpty()&& taskExecuted<cycle)time+=cycle-taskExecuted;

         


        
    }
    return time;
    }
    
}